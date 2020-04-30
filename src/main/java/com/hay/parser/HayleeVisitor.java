// Generated from /Users/hayleemillar/Desktop/popl/boolean/src/main/antlr/Haylee.g4 by ANTLR 4.8
package com.hay.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HayleeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HayleeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HayleeParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(HayleeParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link HayleeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HayleeParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HayleeParser#orexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrexpr(HayleeParser.OrexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HayleeParser#andexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndexpr(HayleeParser.AndexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HayleeParser#notexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotexpr(HayleeParser.NotexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HayleeParser#condexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondexpr(HayleeParser.CondexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HayleeParser#letexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetexpr(HayleeParser.LetexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HayleeParser#addexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddexpr(HayleeParser.AddexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HayleeParser#subexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubexpr(HayleeParser.SubexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HayleeParser#multexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultexpr(HayleeParser.MultexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HayleeParser#lambdaexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaexpr(HayleeParser.LambdaexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HayleeParser#callexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallexpr(HayleeParser.CallexprContext ctx);
}