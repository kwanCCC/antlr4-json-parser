package com.blueocn.parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.lang3.StringUtils;

import com.blueocn.entity.Query;
import com.blueocn.parser.JSONParser.ProgContext;
import com.blueocn.parser.Impl.JSONParserVisitor;
import com.blueocn.parser.Impl.SqlAntlrErrorStrategy;
import com.blueocn.parser.Impl.SyntaxErrorListener;

// {"groupby":["region","timeSection"],"idAndV":{"country":"CN","metricId":5}}
public class ParserEngine {
    public static Query parse(String json_param) {
        if (StringUtils.isBlank(json_param)) {
            throw new RuntimeException();
        }
        SyntaxErrorListener listener = new SyntaxErrorListener();
        ANTLRInputStream input = new ANTLRInputStream(json_param);
        JSONLexer lexer = new JSONLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(listener);
        CommonTokenStream token = new CommonTokenStream(lexer);
        JSONParser jsonParser = new JSONParser(token);
        jsonParser.setErrorHandler(new SqlAntlrErrorStrategy());
        ProgContext prog = jsonParser.prog();
        JSONParserVisitor visitor = new JSONParserVisitor();
        if (visitor.visit(prog)) {
            return visitor.getQuery();
        }
        throw new RuntimeException("parse error");
    }
}
