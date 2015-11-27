package com.blueocn.parser.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import lombok.Getter;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.blueocn.entity.Query;
import com.blueocn.parser.JSONParser.DimensionContext;
import com.blueocn.parser.JSONParser.DimensionsContext;
import com.blueocn.parser.JSONParser.LimitContext;
import com.blueocn.parser.JSONParser.MetricIdAndValueContext;
import com.blueocn.parser.JSONParser.MetricIdAndValuesContext;
import com.blueocn.parser.JSONParser.OrderByContext;
import com.blueocn.parser.JSONParser.ProgContext;

public class JSONParserVisitor implements com.blueocn.parser.JSONParserVisitor<Boolean> {

    private Stack<Object> stack;

    @Getter
    private Query         query;


    @Override
    public Boolean visit(ParseTree tree) {
        if (tree instanceof ProgContext) {
        }
        return false;
    }

    @Override
    public Boolean visitChildren(RuleNode node) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean visitProg(ProgContext ctx) {
        if (ctx.dimensions() != null) {
            if (!visitDimensions(ctx.dimensions())) {
                return false;
            }
            stack.pop();
        }
        return null;
    }

    @Override
    public Boolean visitDimension(DimensionContext ctx) {
        if (ctx.dimensionName != null) {
            String dimension = ctx.dimensionName.getText();
            stack.push(dimension);
            return true;
        }
        return false;
    }

    @Override
    public Boolean visitMetricIdAndValue(MetricIdAndValueContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLimit(LimitContext ctx) {

        return null;
    }

    @Override
    public Boolean visitOrderBy(OrderByContext ctx) {

        return null;
    }

    @Override
    public Boolean visitDimensions(DimensionsContext ctx) {
        List<DimensionContext> dimensionCtxs = ctx.dimension();
        List<String> dimensions = new ArrayList<String>();
        for (DimensionContext dCtx : dimensionCtxs) {
            if (!visitDimension(dCtx)) {
                continue;
            }
            String dimension = (String) stack.pop();
            dimensions.add(dimension);
        }
        stack.push(dimensions);
        return true;
    }

    @Override
    public Boolean visitMetricIdAndValues(MetricIdAndValuesContext ctx) {

        return null;
    }
}
