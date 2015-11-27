// Generated from com/blueocn/parser/JSONParser.g4 by ANTLR 4.5
package com.blueocn.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONParser}.
 */
public interface JSONParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(JSONParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(JSONParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterDimensions(JSONParser.DimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitDimensions(JSONParser.DimensionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(JSONParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(JSONParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#metricIdAndValues}.
	 * @param ctx the parse tree
	 */
	void enterMetricIdAndValues(JSONParser.MetricIdAndValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#metricIdAndValues}.
	 * @param ctx the parse tree
	 */
	void exitMetricIdAndValues(JSONParser.MetricIdAndValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#metricIdAndValue}.
	 * @param ctx the parse tree
	 */
	void enterMetricIdAndValue(JSONParser.MetricIdAndValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#metricIdAndValue}.
	 * @param ctx the parse tree
	 */
	void exitMetricIdAndValue(JSONParser.MetricIdAndValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#limit}.
	 * @param ctx the parse tree
	 */
	void enterLimit(JSONParser.LimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#limit}.
	 * @param ctx the parse tree
	 */
	void exitLimit(JSONParser.LimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#orderBy}.
	 * @param ctx the parse tree
	 */
	void enterOrderBy(JSONParser.OrderByContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#orderBy}.
	 * @param ctx the parse tree
	 */
	void exitOrderBy(JSONParser.OrderByContext ctx);
}