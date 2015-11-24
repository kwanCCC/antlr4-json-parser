package com.blueocn.parser.Impl;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.blueocn.parser.JSONParser.DimensionContext;
import com.blueocn.parser.JSONParser.MetricIdAndValueContext;
import com.blueocn.parser.JSONParser.ProgContext;
import com.blueocn.parser.JSONParserVisitor;

public class JSONQueryVisitor implements JSONParserVisitor<Boolean> {

    @Override
    public Boolean visit(ParseTree tree) {
        if (tree instanceof ProgContext) {
            if (visitProg((ProgContext) tree)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean visitChildren(RuleNode node) {
        return null;
    }

    @Override
    public Boolean visitTerminal(TerminalNode node) {
        return null;
    }

    @Override
    public Boolean visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean visitProg(ProgContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDimension(DimensionContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean visitMetricIdAndValue(MetricIdAndValueContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

}
