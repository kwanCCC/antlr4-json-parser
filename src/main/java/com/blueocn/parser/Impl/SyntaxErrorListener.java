package com.blueocn.parser.Impl;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import com.blueocn.parser.exceptions.SyntaxErrorException;

public class SyntaxErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        RuntimeException ex = new SyntaxErrorException(msg);
        throw ex;
    }
}
