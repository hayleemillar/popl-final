package com.hay.parser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nTesting OR expression...");
        String str = "(or True True)";
        System.out.println(str);
        System.out.println(getResult(str));

        str = "(or False False)";
        System.out.println(str);
        System.out.println(getResult(str));

        str = "(or True False)";
        System.out.println(str);
        System.out.println(getResult(str));


        System.out.println("\nTesting AND expression...");
        str = "(and True True)";
        System.out.println(str);
        System.out.println(getResult(str));

        str = "(and False False)";
        System.out.println(str);
        System.out.println(getResult(str));

        str = "(and True False)";
        System.out.println(str);
        System.out.println(getResult(str));


        System.out.println("\nTesting NOT expression...");
        str = "(not True)";
        System.out.println(str);
        System.out.println(getResult(str));

        str = "(not False)";
        System.out.println(str);
        System.out.println(getResult(str));


        System.out.println("\nTesting Conditional expression...");
        str = "(if True True False)";
        System.out.println(str);
        System.out.println(getResult(str));

        str = "(if False True False)";
        System.out.println(str);
        System.out.println(getResult(str));

        System.out.println("\nTesting Let expression...");

        str = "(let x True x)";
        System.out.println(str);
        System.out.println(getResult(str));

        str = "(let x 5 x)";
        System.out.println(str);
        System.out.println(getResult(str));


        System.out.println("\nTesting Addition expression...");

        str = "(add 5 5)";
        System.out.println(str);
        System.out.println(getResult(str));

        str = "(add 100 20)";
        System.out.println(str);
        System.out.println(getResult(str));


        System.out.println("\nTesting Subtraction expression...");
        str = "(sub 5 5)";
        System.out.println(str);
        System.out.println(getResult(str));

        str = "(sub 100 20)";
        System.out.println(str);
        System.out.println(getResult(str));


        System.out.println("\nTesting Multiplication expression...");
        str = "(mult 5 5)";
        System.out.println(str);
        System.out.println(getResult(str));

        str = "(mult 100 20)";
        System.out.println(str);
        System.out.println(getResult(str));


        System.out.println("\nTesting Lambda expression...");
        str = "(lambda x (add 5 5))";
        System.out.println(str);
        System.out.println(getResult(str));


        System.out.println("\nTesting Call expression...");
        str = "(let func (lambda x (add x x)) (call func 5))";
        System.out.println(str);
        System.out.println(getResult(str));


        System.out.println("\nTesting error messages...");
        str = "(add 5 False)";
        System.out.println(str);
        System.out.println(getResult(str));
    }

    public static Data getResult(String str) {
        HayleeLexer lexer = new HayleeLexer(CharStreams.fromString(str));
        HayleeParser parser = new HayleeParser(new CommonTokenStream(lexer));
        HayleeParser.ExprContext tree = parser.expr();
        return new MyVisitor().visit(tree);
    }
}