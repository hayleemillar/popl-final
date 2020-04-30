package com.hay.parser;

import java.util.HashMap;

public class MyVisitor extends HayleeBaseVisitor<Data> implements HayleeVisitor<Data> {
    public Data visitR(HayleeParser.RContext ctx) {
        return visitExpr(ctx.expr());
    }

    public Data visitExpr(HayleeParser.ExprContext ctx) {
        HashMap<String, Data> symTable = new HashMap<>();
        return visitExpr(ctx, symTable);
    }

    public Data visitExpr(HayleeParser.ExprContext ctx, HashMap<String, Data> symTable) {
        if (ctx.orexpr() != null) {
            return visitOrexpr(ctx.orexpr(), symTable);
        } else if (ctx.andexpr() != null) {
            return visitAndexpr(ctx.andexpr(), symTable);
        } else if (ctx.notexpr() != null) {
            return visitNotexpr(ctx.notexpr(), symTable);
        } else if (ctx.condexpr() != null) {
            return visitCondexpr(ctx.condexpr(), symTable);
        } else if (ctx.letexpr() != null) {
            return visitLetexpr(ctx.letexpr(), symTable);
        } else if (ctx.addexpr() != null) {
            return visitAddexpr(ctx.addexpr(), symTable);
        } else if (ctx.subexpr() != null) {
            return visitSubexpr(ctx.subexpr(), symTable);
        } else if (ctx.multexpr() != null) {
            return visitMultexpr(ctx.multexpr(), symTable);
        } else if (ctx.lambdaexpr() != null) {
            return visitLambdaexpr(ctx.lambdaexpr(), symTable);
        } else if (ctx.callexpr() != null) {
            return visitCallexpr(ctx.callexpr(), symTable);
        } else if (ctx.VAR() != null) {
            return symTable.get(ctx.VAR().getText());
        } else if (ctx.BOOL_VAL() != null) {
            return new Data(Types.BOOLEAN, Boolean.parseBoolean(ctx.BOOL_VAL().getText().toLowerCase()));
        } else if (ctx.INT_VAL() != null) {
            return new Data(Types.INTEGER, Integer.parseInt(ctx.INT_VAL().getText()));
        }
        return null; // stub
    }

    public Data visitOrexpr(HayleeParser.OrexprContext ctx, HashMap<String, Data> symTable) {
        /*
         * orexpr = expr 'or' expr
         *
         */
        Data expr1 = visitExpr(ctx.expr().get(0), symTable);
        Data expr2 = visitExpr(ctx.expr().get(1), symTable);

        if (expr1.value instanceof Boolean && expr2.value instanceof Boolean) {
            return new Data(Types.BOOLEAN, ((Boolean) expr1.value).booleanValue() || ((Boolean) expr2.value).booleanValue());
        }
        return new Data(Types.ERROR, "ERROR: One or both values is incompatible with OR expression.");
    }

    public Data visitAndexpr(HayleeParser.AndexprContext ctx, HashMap<String, Data> symTable) {
        /*
         * andexpr = expr 'and' expr
         *
         */
        Data expr1 = visitExpr(ctx.expr().get(0), symTable);
        Data expr2 = visitExpr(ctx.expr().get(1), symTable);

        if (expr1.value instanceof Boolean && expr2.value instanceof Boolean) {
            return new Data(Types.BOOLEAN, ((Boolean) expr1.value).booleanValue() && ((Boolean) expr2.value).booleanValue());
        }
        return new Data(Types.ERROR, "ERROR: One or both values is incompatible with AND expression.");
    }

    public Data visitNotexpr(HayleeParser.NotexprContext ctx, HashMap<String, Data> symTable) {
        /*
         * notexpr = 'not' expr
         *
         */
        Data expr = visitExpr(ctx.expr(), symTable);

        if (expr.value instanceof Boolean) return new Data(Types.BOOLEAN, !((Boolean) expr.value).booleanValue());
        return new Data(Types.ERROR, "ERROR: Value is incompatible with NOT expression.");
    }

    public Data visitCondexpr(HayleeParser.CondexprContext ctx, HashMap<String, Data> symTable) {
        /*
         * condexpr = 'if' expr expr expr
         *
         */
        Data expr1 = visitExpr(ctx.expr().get(0), symTable);
        Data expr2 = visitExpr(ctx.expr().get(1), symTable);
        Data expr3 = visitExpr(ctx.expr().get(2), symTable);

        if (expr1.value instanceof Boolean) {
            if (((Boolean) expr1.value).booleanValue()) return expr2;
            return expr3;
        }
        return new Data(Types.ERROR, "ERROR: Not a valid conditional expression provided.");
    }

    public Data visitLetexpr(HayleeParser.LetexprContext ctx, HashMap<String, Data> symTable) {
        /*
         * letexpr = 'let' VAR expr expr
         *
         */
        String varName = ctx.VAR().getText();

        // if we are attempting to store a lambda, then
        // we need to store context, not the result
        Data varValue = null;
        if (ctx.expr().get(0).lambdaexpr() != null) {
            varValue = new Data(Types.LAMBDA, ctx.expr().get(0).lambdaexpr());
        } else {
            varValue = visitExpr(ctx.expr().get(0));
        }
        symTable.put(varName, varValue);
        return visitExpr(ctx.expr().get(1), symTable);
    }

    public Data visitAddexpr(HayleeParser.AddexprContext ctx, HashMap<String, Data> symTable) {
        /*
         * addexpr = 'add' expr expr
         */
        Data expr1 = visitExpr(ctx.expr().get(0), symTable);
        Data expr2 = visitExpr(ctx.expr().get(1), symTable);
        if (expr1.value instanceof Integer && expr2.value instanceof Integer) {
            return new Data(Types.INTEGER, (int) expr1.value + (int) expr2.value);
        }
        return new Data(Types.ERROR, "ERROR: One or both values is incompatible with ADD expression.");
    }

    public Data visitSubexpr(HayleeParser.SubexprContext ctx, HashMap<String, Data> symTable) {
        Data expr1 = visitExpr(ctx.expr().get(0), symTable);
        Data expr2 = visitExpr(ctx.expr().get(1), symTable);
        if (expr1.value instanceof Integer && expr2.value instanceof Integer) {
            return new Data(Types.INTEGER, (int) expr1.value - (int) expr2.value);
        }
        return new Data(Types.ERROR, "ERROR: One or both values is incompatible with SUB expression.");
    }

    public Data visitMultexpr(HayleeParser.MultexprContext ctx, HashMap<String, Data> symTable) {
        Data expr1 = visitExpr(ctx.expr().get(0), symTable);
        Data expr2 = visitExpr(ctx.expr().get(1), symTable);
        if (expr1.value instanceof Integer && expr2.value instanceof Integer) {
            return new Data(Types.INTEGER, (int) expr1.value * (int) expr2.value);
        }
        return new Data(Types.ERROR, "ERROR: One or both values is incompatible with MULT expression.");
    }

    public Data visitLambdaexpr(HayleeParser.LambdaexprContext ctx, HashMap<String, Data> symTable) {
        /*
         * lambdaexpr = 'lambda' VAR expr
         */
        return visitExpr(ctx.expr(), symTable);
    }

    public Data visitCallexpr(HayleeParser.CallexprContext ctx, HashMap<String, Data> symTable) {
        /*
         * callexpr = 'call' VAR expr*
         */
        // expecting VAR symbol table lookup to return a lambda expr ctx
        HayleeParser.LambdaexprContext lambda = (HayleeParser.LambdaexprContext) symTable.get(ctx.VAR().getText()).value;

        // clone symbol table
        HashMap<String, Data> newSymTable = (HashMap) symTable.clone();
        // update with call value
        newSymTable.put(lambda.VAR().getText(), visitExpr(ctx.expr()));

        // feed to lambda expr
        return visitLambdaexpr(lambda, newSymTable); // stubbed
    }
}
