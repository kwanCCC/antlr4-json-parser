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
		RULE_prog = 0, RULE_dimensions = 1, RULE_dimension = 2, RULE_metricIdAndValues = 3, 
		RULE_metricIdAndValue = 4, RULE_limit = 5, RULE_orderBy = 6;
	public static final String[] ruleNames = {
		"prog", "dimensions", "dimension", "metricIdAndValues", "metricIdAndValue", 
		"limit", "orderBy"
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
		public TerminalNode LBRACE() { return getToken(JSONParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JSONParser.RBRACE, 0); }
		public TerminalNode EOF() { return getToken(JSONParser.EOF, 0); }
		public TerminalNode GROUPBY() { return getToken(JSONParser.GROUPBY, 0); }
		public List<TerminalNode> COLON() { return getTokens(JSONParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JSONParser.COLON, i);
		}
		public DimensionsContext dimensions() {
			return getRuleContext(DimensionsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JSONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSONParser.COMMA, i);
		}
		public TerminalNode IDANDV() { return getToken(JSONParser.IDANDV, 0); }
		public MetricIdAndValuesContext metricIdAndValues() {
			return getRuleContext(MetricIdAndValuesContext.class,0);
		}
		public TerminalNode TOP() { return getToken(JSONParser.TOP, 0); }
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(JSONParser.ORDER, 0); }
		public OrderByContext orderBy() {
			return getRuleContext(OrderByContext.class,0);
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
			setState(14);
			match(LBRACE);
			setState(18);
			_la = _input.LA(1);
			if (_la==GROUPBY) {
				{
				setState(15);
				match(GROUPBY);
				setState(16);
				match(COLON);
				setState(17);
				dimensions();
				}
			}

			setState(24);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(20);
				match(COMMA);
				setState(21);
				match(IDANDV);
				setState(22);
				match(COLON);
				setState(23);
				metricIdAndValues();
				}
				break;
			}
			setState(30);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(26);
				match(COMMA);
				setState(27);
				match(TOP);
				setState(28);
				match(COLON);
				setState(29);
				limit();
				}
				break;
			}
			setState(36);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(32);
				match(COMMA);
				setState(33);
				match(ORDER);
				setState(34);
				match(COLON);
				setState(35);
				orderBy();
				}
			}

			setState(38);
			match(RBRACE);
			setState(39);
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

	public static class DimensionsContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(JSONParser.LBRACKET, 0); }
		public List<DimensionContext> dimension() {
			return getRuleContexts(DimensionContext.class);
		}
		public DimensionContext dimension(int i) {
			return getRuleContext(DimensionContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(JSONParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JSONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSONParser.COMMA, i);
		}
		public DimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterDimensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitDimensions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONParserVisitor ) return ((JSONParserVisitor<? extends T>)visitor).visitDimensions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionsContext dimensions() throws RecognitionException {
		DimensionsContext _localctx = new DimensionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dimensions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(LBRACKET);
			setState(42);
			dimension();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(43);
				match(COMMA);
				setState(44);
				dimension();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(RBRACKET);
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
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
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
		enterRule(_localctx, 4, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(52);
				((DimensionContext)_localctx).dimensionName = match(STRING);
				}
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

	public static class MetricIdAndValuesContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JSONParser.LBRACE, 0); }
		public List<MetricIdAndValueContext> metricIdAndValue() {
			return getRuleContexts(MetricIdAndValueContext.class);
		}
		public MetricIdAndValueContext metricIdAndValue(int i) {
			return getRuleContext(MetricIdAndValueContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(JSONParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JSONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSONParser.COMMA, i);
		}
		public MetricIdAndValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metricIdAndValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterMetricIdAndValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitMetricIdAndValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONParserVisitor ) return ((JSONParserVisitor<? extends T>)visitor).visitMetricIdAndValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetricIdAndValuesContext metricIdAndValues() throws RecognitionException {
		MetricIdAndValuesContext _localctx = new MetricIdAndValuesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_metricIdAndValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(LBRACE);
			setState(56);
			metricIdAndValue();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(57);
				match(COMMA);
				setState(58);
				metricIdAndValue();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(RBRACE);
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
		public TerminalNode COLON() { return getToken(JSONParser.COLON, 0); }
		public List<TerminalNode> STRING() { return getTokens(JSONParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JSONParser.STRING, i);
		}
		public TerminalNode INT() { return getToken(JSONParser.INT, 0); }
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
		enterRule(_localctx, 8, RULE_metricIdAndValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(66);
				((MetricIdAndValueContext)_localctx).metricName = match(STRING);
				setState(67);
				match(COLON);
				setState(68);
				((MetricIdAndValueContext)_localctx).metricValue = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==STRING) ) {
					((MetricIdAndValueContext)_localctx).metricValue = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
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

	public static class LimitContext extends ParserRuleContext {
		public Token limitNum;
		public TerminalNode INT() { return getToken(JSONParser.INT, 0); }
		public LimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitLimit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONParserVisitor ) return ((JSONParserVisitor<? extends T>)visitor).visitLimit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(71);
				((LimitContext)_localctx).limitNum = match(INT);
				}
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

	public static class OrderByContext extends ParserRuleContext {
		public Token orderByStr;
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public OrderByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterOrderBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitOrderBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONParserVisitor ) return ((JSONParserVisitor<? extends T>)visitor).visitOrderBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByContext orderBy() throws RecognitionException {
		OrderByContext _localctx = new OrderByContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_orderBy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(74);
				((OrderByContext)_localctx).orderByStr = match(STRING);
				}
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3<P\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\5\2\25\n\2\3"+
		"\2\3\2\3\2\3\2\5\2\33\n\2\3\2\3\2\3\2\3\2\5\2!\n\2\3\2\3\2\3\2\3\2\5\2"+
		"\'\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63\13\3\3\3\3\3"+
		"\3\4\5\48\n\4\3\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\5\3\5\3\6\3\6"+
		"\3\6\5\6H\n\6\3\7\5\7K\n\7\3\b\5\bN\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\3\4"+
		"\288::R\2\20\3\2\2\2\4+\3\2\2\2\6\67\3\2\2\2\b9\3\2\2\2\nG\3\2\2\2\fJ"+
		"\3\2\2\2\16M\3\2\2\2\20\24\7\t\2\2\21\22\7\3\2\2\22\23\7\31\2\2\23\25"+
		"\5\4\3\2\24\21\3\2\2\2\24\25\3\2\2\2\25\32\3\2\2\2\26\27\7\16\2\2\27\30"+
		"\7\4\2\2\30\31\7\31\2\2\31\33\5\b\5\2\32\26\3\2\2\2\32\33\3\2\2\2\33 "+
		"\3\2\2\2\34\35\7\16\2\2\35\36\7\5\2\2\36\37\7\31\2\2\37!\5\f\7\2 \34\3"+
		"\2\2\2 !\3\2\2\2!&\3\2\2\2\"#\7\16\2\2#$\7\6\2\2$%\7\31\2\2%\'\5\16\b"+
		"\2&\"\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\7\n\2\2)*\7\2\2\3*\3\3\2\2\2+,\7"+
		"\13\2\2,\61\5\6\4\2-.\7\16\2\2.\60\5\6\4\2/-\3\2\2\2\60\63\3\2\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\f\2\2\65\5"+
		"\3\2\2\2\668\7:\2\2\67\66\3\2\2\2\678\3\2\2\28\7\3\2\2\29:\7\t\2\2:?\5"+
		"\n\6\2;<\7\16\2\2<>\5\n\6\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B"+
		"\3\2\2\2A?\3\2\2\2BC\7\n\2\2C\t\3\2\2\2DE\7:\2\2EF\7\31\2\2FH\t\2\2\2"+
		"GD\3\2\2\2GH\3\2\2\2H\13\3\2\2\2IK\78\2\2JI\3\2\2\2JK\3\2\2\2K\r\3\2\2"+
		"\2LN\7:\2\2ML\3\2\2\2MN\3\2\2\2N\17\3\2\2\2\f\24\32 &\61\67?GJM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}