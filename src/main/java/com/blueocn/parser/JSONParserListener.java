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
	 * Enter a parse tree produced by {@link JSONParser#metricIdAndValue}.
	 * @param ctx the parse tree
	 */
	void enterMetricIdAndValue(JSONParser.MetricIdAndValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#metricIdAndValue}.
	 * @param ctx the parse tree
	 */
	void exitMetricIdAndValue(JSONParser.MetricIdAndValueContext ctx);
}