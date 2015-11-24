// Generated from com/blueocn/parser/JSONParser.g4 by ANTLR 4.5
package com.blueocn.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GROUPBY=1, IDANDV=2, TOP=3, ORDER=4, LPAREN=5, RPAREN=6, LBRACE=7, RBRACE=8, 
		LBRACKET=9, RBRACKET=10, SEMI=11, COMMA=12, DOT=13, DOTDOT=14, DOTDOTDOT=15, 
		EQ=16, GT=17, LT=18, BANG=19, BANGBANG=20, TILDE=21, QUES=22, COLON=23, 
		COLONCOLON=24, COLONEQ=25, EQEQ=26, LTEQ=27, LTEQGT=28, LTGT=29, GTEQ=30, 
		BANGEQ=31, BANGGT=32, BANGLT=33, AMPAMP=34, BARBAR=35, BARBARSLASH=36, 
		BARSLASH=37, PLUS=38, SUB=39, STAR=40, SLASH=41, AMP=42, BAR=43, CARET=44, 
		PERCENT=45, LTLT=46, GTGT=47, MONKEYS_AT=48, POUND=49, DIV=50, MOD=51, 
		UNDERLINE=52, QUOTES=53, INT=54, FLOAT=55, STRING=56, ID=57, WS=58;
	public static final int
		RULE_prog = 0, RULE_dimension = 1, RULE_metricIdAndValue = 2;
	public static final String[] ruleNames = {
		"prog", "dimension", "metricIdAndValue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'", "'..'", "'..,'", "'='", "'>'", "'<'", "'!'", "'!!'", 
		"'~'", "'?'", "':'", "'::'", "':='", "'=='", "'<='", "'<=>'", null, "'>='", 
		null, "'!>'", "'!<'", "'&&'", "'||'", "'||/'", "'|/'", "'+'", "'-'", "'*'", 
		"'/'", "'&'", "'|'", "'^'", null, "'<<'", "'>>'", "'@'", "'#'", null, 
		null, "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "GROUPBY", "IDANDV", "TOP", "ORDER", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "LBRACKET", "RBRACKET", "SEMI", "COMMA", "DOT", "DOTDOT", "DOTDOTDOT", 
		"EQ", "GT", "LT", "BANG", "BANGBANG", "TILDE", "QUES", "COLON", "COLONCOLON", 
		"COLONEQ", "EQEQ", "LTEQ", "LTEQGT", "LTGT", "GTEQ", "BANGEQ", "BANGGT", 
		"BANGLT", "AMPAMP", "BARBAR", "BARBARSLASH", "BARSLASH", "PLUS", "SUB", 
		"STAR", "SLASH", "AMP", "BAR", "CARET", "PERCENT", "LTLT", "GTGT", "MONKEYS_AT", 
		"POUND", "DIV", "MOD", "UNDERLINE", "QUOTES", "INT", "FLOAT", "STRING", 
		"ID", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JSONParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(JSONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSONParser.COMMA, i);
		}
		public TerminalNode EOF() { return getToken(JSONParser.EOF, 0); }
		public List<TerminalNode> GROUPBY() { return getTokens(JSONParser.GROUPBY); }
		public TerminalNode GROUPBY(int i) {
			return getToken(JSONParser.GROUPBY, i);
		}
		public List<TerminalNode> COLON() { return getTokens(JSONParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JSONParser.COLON, i);
		}
		public List<DimensionContext> dimension() {
			return getRuleContexts(DimensionContext.class);
		}
		public DimensionContext dimension(int i) {
			return getRuleContext(DimensionContext.class,i);
		}
		public List<TerminalNode> IDANDV() { return getTokens(JSONParser.IDANDV); }
		public TerminalNode IDANDV(int i) {
			return getToken(JSONParser.IDANDV, i);
		}
		public List<MetricIdAndValueContext> metricIdAndValue() {
			return getRuleContexts(MetricIdAndValueContext.class);
		}
		public MetricIdAndValueContext metricIdAndValue(int i) {
			return getRuleContext(MetricIdAndValueContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONParserVisitor ) return ((JSONParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GROUPBY) {
				{
				{
				setState(6);
				match(GROUPBY);
				setState(7);
				match(COLON);
				setState(8);
				dimension();
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(14);
			match(COMMA);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDANDV) {
				{
				{
				setState(15);
				match(IDANDV);
				setState(16);
				match(COLON);
				setState(17);
				metricIdAndValue();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
			match(COMMA);
			{
			}
			setState(25);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionContext extends ParserRuleContext {
		public Token dimensionName;
		public List<TerminalNode> LBRACKET() { return getTokens(JSONParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(JSONParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(JSONParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(JSONParser.RBRACKET, i);
		}
		public List<TerminalNode> STRING() { return getTokens(JSONParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JSONParser.STRING, i);
		}
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONParserVisitor ) return ((JSONParserVisitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(27);
				match(LBRACKET);
				setState(28);
				((DimensionContext)_localctx).dimensionName = match(STRING);
				setState(29);
				match(RBRACKET);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetricIdAndValueContext extends ParserRuleContext {
		public Token metricName;
		public Token metricValue;
		public List<TerminalNode> LBRACE() { return getTokens(JSONParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(JSONParser.LBRACE, i);
		}
		public List<TerminalNode> COLON() { return getTokens(JSONParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JSONParser.COLON, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(JSONParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(JSONParser.RBRACE, i);
		}
		public List<TerminalNode> STRING() { return getTokens(JSONParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JSONParser.STRING, i);
		}
		public MetricIdAndValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metricIdAndValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterMetricIdAndValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitMetricIdAndValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONParserVisitor ) return ((JSONParserVisitor<? extends T>)visitor).visitMetricIdAndValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetricIdAndValueContext metricIdAndValue() throws RecognitionException {
		MetricIdAndValueContext _localctx = new MetricIdAndValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_metricIdAndValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACE) {
				{
				{
				setState(35);
				match(LBRACE);
				setState(36);
				((MetricIdAndValueContext)_localctx).metricName = match(STRING);
				setState(37);
				match(COLON);
				setState(38);
				((MetricIdAndValueContext)_localctx).metricValue = match(STRING);
				setState(39);
				match(RBRACE);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3<\60\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\3\2\3\2\7\2"+
		"\25\n\2\f\2\16\2\30\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3!\n\3\f\3\16\3"+
		"$\13\3\3\4\3\4\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\4\2\2\5\2\4\6\2\2"+
		"\60\2\r\3\2\2\2\4\"\3\2\2\2\6,\3\2\2\2\b\t\7\3\2\2\t\n\7\31\2\2\n\f\5"+
		"\4\3\2\13\b\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\20\3\2\2"+
		"\2\17\r\3\2\2\2\20\26\7\16\2\2\21\22\7\4\2\2\22\23\7\31\2\2\23\25\5\6"+
		"\4\2\24\21\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2"+
		"\2\2\30\26\3\2\2\2\31\32\7\16\2\2\32\33\3\2\2\2\33\34\7\2\2\3\34\3\3\2"+
		"\2\2\35\36\7\13\2\2\36\37\7:\2\2\37!\7\f\2\2 \35\3\2\2\2!$\3\2\2\2\" "+
		"\3\2\2\2\"#\3\2\2\2#\5\3\2\2\2$\"\3\2\2\2%&\7\t\2\2&\'\7:\2\2\'(\7\31"+
		"\2\2()\7:\2\2)+\7\n\2\2*%\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\7\3\2"+
		"\2\2.,\3\2\2\2\6\r\26\",";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}