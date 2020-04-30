// Generated from /Users/hayleemillar/Desktop/popl/boolean/src/main/antlr/Haylee.g4 by ANTLR 4.8
package com.hay.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HayleeParser}.
 */
public interface HayleeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HayleeParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(HayleeParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link HayleeParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(HayleeParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link HayleeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HayleeParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HayleeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HayleeParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HayleeParser#orexpr}.
	 * @param ctx the parse tree
	 */
	void enterOrexpr(HayleeParser.OrexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HayleeParser#orexpr}.
	 * @param ctx the parse tree
	 */
	void exitOrexpr(HayleeParser.OrexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HayleeParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void enterAndexpr(HayleeParser.AndexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HayleeParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void exitAndexpr(HayleeParser.AndexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HayleeParser#notexpr}.
	 * @param ctx the parse tree
	 */
	void enterNotexpr(HayleeParser.NotexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HayleeParser#notexpr}.
	 * @param ctx the parse tree
	 */
	void exitNotexpr(HayleeParser.NotexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HayleeParser#condexpr}.
	 * @param ctx the parse tree
	 */
	void enterCondexpr(HayleeParser.CondexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HayleeParser#condexpr}.
	 * @param ctx the parse tree
	 */
	void exitCondexpr(HayleeParser.CondexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HayleeParser#letexpr}.
	 * @param ctx the parse tree
	 */
	void enterLetexpr(HayleeParser.LetexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HayleeParser#letexpr}.
	 * @param ctx the parse tree
	 */
	void exitLetexpr(HayleeParser.LetexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HayleeParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void enterAddexpr(HayleeParser.AddexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HayleeParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void exitAddexpr(HayleeParser.AddexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HayleeParser#subexpr}.
	 * @param ctx the parse tree
	 */
	void enterSubexpr(HayleeParser.SubexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HayleeParser#subexpr}.
	 * @param ctx the parse tree
	 */
	void exitSubexpr(HayleeParser.SubexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HayleeParser#multexpr}.
	 * @param ctx the parse tree
	 */
	void enterMultexpr(HayleeParser.MultexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HayleeParser#multexpr}.
	 * @param ctx the parse tree
	 */
	void exitMultexpr(HayleeParser.MultexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HayleeParser#lambdaexpr}.
	 * @param ctx the parse tree
	 */
	void enterLambdaexpr(HayleeParser.LambdaexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HayleeParser#lambdaexpr}.
	 * @param ctx the parse tree
	 */
	void exitLambdaexpr(HayleeParser.LambdaexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HayleeParser#callexpr}.
	 * @param ctx the parse tree
	 */
	void enterCallexpr(HayleeParser.CallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HayleeParser#callexpr}.
	 * @param ctx the parse tree
	 */
	void exitCallexpr(HayleeParser.CallexprContext ctx);
}