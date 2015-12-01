package com.blueocn.parser.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import lombok.Getter;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.tuple.Pair;

import com.blueocn.entity.Query;
import com.blueocn.parser.JSONParser.DimensionContext;
import com.blueocn.parser.JSONParser.DimensionsContext;
import com.blueocn.parser.JSONParser.JsonArrayContext;
import com.blueocn.parser.JSONParser.JsonObjectContext;
import com.blueocn.parser.JSONParser.JsonValueContext;
import com.blueocn.parser.JSONParser.LimitContext;
import com.blueocn.parser.JSONParser.MemberContext;
import com.blueocn.parser.JSONParser.MetricIdAndValueContext;
import com.blueocn.parser.JSONParser.MetricIdAndValuesContext;
import com.blueocn.parser.JSONParser.OrderByContext;
import com.blueocn.parser.JSONParser.ProgContext;
import com.blueocn.parser.JSONParser.SingleValueContext;
import com.blueocn.parser.JSONParser.ValuesContext;

public class JSONParserVisitor implements com.blueocn.parser.JSONParserVisitor<Boolean> {

    private Stack<Object>      stack;

    @Getter
    private Query              query;

    private Query.QueryBuilder builder;

    public JSONParserVisitor() {
        stack = new Stack<Object>();
        builder = Query.builder();
    }

    @Override
    public Boolean visit(ParseTree tree) {
        if (tree instanceof ProgContext) {
            if (visitProg((ProgContext) tree)) {
                query = builder.build();
                return true;
            }
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
            builder.groupby((List<String>) stack.pop());
        }
        if (ctx.metricIdAndValues() != null) {
            if (!visitMetricIdAndValues(ctx.metricIdAndValues())) {
                return false;
            }
            builder.idAndV((List<Pair<String, Object>>) stack.pop());
        }
        if (ctx.limit() != null) {
            boolean status_limt = true;
            if (!visitLimit(ctx.limit())) {
                status_limt = false;
                return status_limt;
            }
            if (status_limt) {
                builder.top((Integer) stack.pop());
            }
        }
        if (ctx.orderBy() != null) {
            boolean status_order = true;
            if (!visitOrderBy(ctx.orderBy())) {
                status_order = false;
                return status_order;
            }
            if (status_order) {
                builder.order((String) stack.pop());
            }
        }
        return true;
    }

    // @Override
    // public Boolean visitValues(ValuesContext ctx) {
    // if (ctx.multiValue() != null) {
    // List<MultiValueContext> multiValue = ctx.multiValue();
    // List<String> metricValues = new ArrayList<String>();
    // for (MultiValueContext mCtx : multiValue) {
    // if (!visitMultiValue(mCtx)) {
    // return false;
    // }
    // String value = (String) stack.pop();
    // metricValues.add(value);
    // }
    // stack.push(metricValues);
    // return true;
    // } else if (ctx.singleValue() != null) {
    // SingleValueContext singleValue = ctx.singleValue();
    // if (!visitSingleValue(singleValue)) {
    // return false;
    // }
    // String singleTon = (String) stack.pop();
    // stack.push(singleTon);
    // return true;
    // }
    // return false;
    // }

    @Override
    public Boolean visitDimension(DimensionContext ctx) {
        if (ctx.dimensionName != null) {
            String dimension = ctx.dimensionName.getText();
            if (dimension.contains("\"")) {
                dimension = dimension.replace("\"", "");
            }
            stack.push(dimension);
            return true;
        }
        return false;
    }

    @Override
    public Boolean visitMetricIdAndValue(MetricIdAndValueContext ctx) {
        if (ctx.metricName != null) {
            String key = ctx.metricName.getText();
            ValuesContext values = ctx.values();
            if (!visitValues(values)) {
                return false;
            }
            Object _value = stack.pop();
            if (_value instanceof String) {
                String actul_string_value = (String) _value;
                stack.push(Pair.of(key, actul_string_value));
                return true;
            } else if (_value instanceof List) {
                List<Object> actual_list_value = (List<Object>) _value;
                stack.push(Pair.of(key, actual_list_value));
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean visitLimit(LimitContext ctx) {
        if (ctx.limitNum != null) {
            int limt = ctx.limitNum.getLine();
            stack.push(limt);
            return true;
        }
        return false;
    }

    @Override
    public Boolean visitOrderBy(OrderByContext ctx) {
        if (ctx.orderByStr != null) {
            String _orderStr = ctx.orderByStr.getText();
            stack.push(_orderStr);
            return true;
        }
        return false;
    }

    @Override
    public Boolean visitDimensions(DimensionsContext ctx) {
        List<DimensionContext> dimensionCtxs = ctx.dimension();
        List<String> dimensions = new ArrayList<String>();
        for (DimensionContext dCtx : dimensionCtxs) {
            if (!visitDimension(dCtx)) {
                return false;
            }
            String dimension = (String) stack.pop();
            dimensions.add(dimension);
        }
        stack.push(dimensions);
        return true;
    }

    @Override
    public Boolean visitMetricIdAndValues(MetricIdAndValuesContext ctx) {
        List<MetricIdAndValueContext> metricIdAndValueSCtx = ctx.metricIdAndValue();
        List<Pair<String, Object>> metricIdAndValues = new ArrayList<Pair<String, Object>>();
        for (MetricIdAndValueContext mAndvCtx : metricIdAndValueSCtx) {
            if (!visitMetricIdAndValue(mAndvCtx)) {
                return false;
            }
            Pair<String, Object> _mAndv = (Pair<String, Object>) stack.pop();
            metricIdAndValues.add(_mAndv);
        }
        stack.push(metricIdAndValues);
        return true;
    }

    // @Override
    // public Boolean visitMultiValue(MultiValueContext ctx) {
    // if (ctx.multiValueCtx != null) {
    // String singleValue = ctx.multiValueCtx.getText();
    // stack.push(singleValue);
    // return true;
    // }
    // return false;
    // }

    // @Override
    // public Boolean visitSingleValue(SingleValueContext ctx) {
    // if (ctx.singleValueCtx != null) {
    // String singleValue = ctx.singleValueCtx.getText();
    // stack.push(singleValue);
    // return true;
    // }
    // return false;
    // }

    @Override
    public Boolean visitJsonValue(JsonValueContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean visitJsonObject(JsonObjectContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean visitMember(MemberContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean visitJsonArray(JsonArrayContext ctx) {
        List<Object> jsonArrayValue = new ArrayList<Object>();
        List<SingleValueContext> singleValueCtx = ctx.singleValue();
        for (SingleValueContext s_ctx : singleValueCtx) {
            if (!visitSingleValue(s_ctx)) {
                return false;
            }
            Object _singleValue = stack.pop();
            jsonArrayValue.add(_singleValue);
        }
        stack.push(jsonArrayValue);
        return true;
    }

    @Override
    public Boolean visitValues(ValuesContext ctx) {
        if (ctx.multiObject != null) {
            if (!visitJsonArray(ctx.multiObject)) {
                return false;
            }
        } else if (ctx.singleObject != null) {
            if (!visitSingleValue(ctx.singleValue())) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public Boolean visitSingleValue(SingleValueContext ctx) {
        if (ctx.objectValue != null) {
            String _objectValue = ctx.objectValue.getText();
            stack.push(_objectValue);
            return true;
        }
        return false;
    }

}
