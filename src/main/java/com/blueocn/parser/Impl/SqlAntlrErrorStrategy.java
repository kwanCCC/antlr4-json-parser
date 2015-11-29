package com.blueocn.parser.Impl;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

import com.blueocn.parser.exceptions.ParseErrorException;

public class SqlAntlrErrorStrategy extends DefaultErrorStrategy {
    @Override
    public Token recoverInline(Parser recognizer) throws RecognitionException {
        String msg = String.format("sql parser error,line:%s,token:%s", recognizer.getCurrentToken().getLine(), recognizer.getCurrentToken().getText());
        throw new ParseErrorException(msg);
    }

    @Override
    public void reportError(Parser recognizer, RecognitionException e) {
        String msg = String.format("sql parser error,line:%s,token:%s", recognizer.getCurrentToken().getLine(), recognizer.getCurrentToken().getText());
        throw new ParseErrorException(msg, e);
    }
}
