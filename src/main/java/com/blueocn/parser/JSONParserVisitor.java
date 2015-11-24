// Generated from com/blueocn/parser/JSONParser.g4 by ANTLR 4.5
package com.blueocn.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSONParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSONParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSONParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(JSONParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(JSONParser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#metricIdAndValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetricIdAndValue(JSONParser.MetricIdAndValueContext ctx);
}