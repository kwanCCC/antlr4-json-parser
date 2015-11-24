// Generated from com/blueocn/parser/JSONLexer.g4 by ANTLR 4.5
package com.blueocn.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"GROUPBY", "IDANDV", "TOP", "ORDER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACKET", "RBRACKET", "SEMI", "COMMA", "DOT", "DOTDOT", "DOTDOTDOT", 
		"EQ", "GT", "LT", "BANG", "BANGBANG", "TILDE", "QUES", "COLON", "COLONCOLON", 
		"COLONEQ", "EQEQ", "LTEQ", "LTEQGT", "LTGT", "GTEQ", "BANGEQ", "BANGGT", 
		"BANGLT", "AMPAMP", "BARBAR", "BARBARSLASH", "BARSLASH", "PLUS", "SUB", 
		"STAR", "SLASH", "AMP", "BAR", "CARET", "PERCENT", "LTLT", "GTGT", "MONKEYS_AT", 
		"POUND", "DIV", "MOD", "UNDERLINE", "QUOTES", "INT", "FLOAT", "STRING", 
		"ID", "ID_LETTER", "DIGIT", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
		"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
		"X", "Y", "Z", "WS"
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


	public JSONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSONLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2<\u01ae\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\67\6\67\u0144\n\67\r\67\16\67\u0145\38\68\u0149\n8\r8\168\u014a"+
		"\38\38\78\u014f\n8\f8\168\u0152\138\38\38\68\u0156\n8\r8\168\u0157\58"+
		"\u015a\n8\39\39\39\39\79\u0160\n9\f9\169\u0163\139\39\39\3:\3:\3:\7:\u016a"+
		"\n:\f:\16:\u016d\13:\3;\5;\u0170\n;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3"+
		"A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3"+
		"M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\6W\u01a9"+
		"\nW\rW\16W\u01aa\3W\3W\2\2X\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085"+
		"\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097"+
		"\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9"+
		"\2\u00ab\2\u00ad<\3\2 \4\2$$))\5\2C\\aac|\3\2\62;\4\2CCcc\4\2DDdd\4\2"+
		"EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4"+
		"\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVv"+
		"v\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\5\2\13\f\16\17\"\""+
		"\u019c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2\u00ad\3\2\2\2\3\u00af\3\2"+
		"\2\2\5\u00b7\3\2\2\2\7\u00be\3\2\2\2\t\u00c2\3\2\2\2\13\u00c8\3\2\2\2"+
		"\r\u00ca\3\2\2\2\17\u00cc\3\2\2\2\21\u00ce\3\2\2\2\23\u00d0\3\2\2\2\25"+
		"\u00d2\3\2\2\2\27\u00d4\3\2\2\2\31\u00d6\3\2\2\2\33\u00d8\3\2\2\2\35\u00da"+
		"\3\2\2\2\37\u00dd\3\2\2\2!\u00e1\3\2\2\2#\u00e3\3\2\2\2%\u00e5\3\2\2\2"+
		"\'\u00e7\3\2\2\2)\u00e9\3\2\2\2+\u00ec\3\2\2\2-\u00ee\3\2\2\2/\u00f0\3"+
		"\2\2\2\61\u00f2\3\2\2\2\63\u00f5\3\2\2\2\65\u00f8\3\2\2\2\67\u00fb\3\2"+
		"\2\29\u00fe\3\2\2\2;\u0102\3\2\2\2=\u0105\3\2\2\2?\u0108\3\2\2\2A\u010b"+
		"\3\2\2\2C\u010e\3\2\2\2E\u0111\3\2\2\2G\u0114\3\2\2\2I\u0117\3\2\2\2K"+
		"\u011b\3\2\2\2M\u011e\3\2\2\2O\u0120\3\2\2\2Q\u0122\3\2\2\2S\u0124\3\2"+
		"\2\2U\u0126\3\2\2\2W\u0128\3\2\2\2Y\u012a\3\2\2\2[\u012c\3\2\2\2]\u012e"+
		"\3\2\2\2_\u0131\3\2\2\2a\u0134\3\2\2\2c\u0136\3\2\2\2e\u0138\3\2\2\2g"+
		"\u013c\3\2\2\2i\u013e\3\2\2\2k\u0140\3\2\2\2m\u0143\3\2\2\2o\u0159\3\2"+
		"\2\2q\u015b\3\2\2\2s\u0166\3\2\2\2u\u016f\3\2\2\2w\u0171\3\2\2\2y\u0173"+
		"\3\2\2\2{\u0175\3\2\2\2}\u0177\3\2\2\2\177\u0179\3\2\2\2\u0081\u017b\3"+
		"\2\2\2\u0083\u017d\3\2\2\2\u0085\u017f\3\2\2\2\u0087\u0181\3\2\2\2\u0089"+
		"\u0183\3\2\2\2\u008b\u0185\3\2\2\2\u008d\u0187\3\2\2\2\u008f\u0189\3\2"+
		"\2\2\u0091\u018b\3\2\2\2\u0093\u018d\3\2\2\2\u0095\u018f\3\2\2\2\u0097"+
		"\u0191\3\2\2\2\u0099\u0193\3\2\2\2\u009b\u0195\3\2\2\2\u009d\u0197\3\2"+
		"\2\2\u009f\u0199\3\2\2\2\u00a1\u019b\3\2\2\2\u00a3\u019d\3\2\2\2\u00a5"+
		"\u019f\3\2\2\2\u00a7\u01a1\3\2\2\2\u00a9\u01a3\3\2\2\2\u00ab\u01a5\3\2"+
		"\2\2\u00ad\u01a8\3\2\2\2\u00af\u00b0\5\u0085C\2\u00b0\u00b1\5\u009bN\2"+
		"\u00b1\u00b2\5\u0095K\2\u00b2\u00b3\5\u00a1Q\2\u00b3\u00b4\5\u0097L\2"+
		"\u00b4\u00b5\5{>\2\u00b5\u00b6\5\u00a9U\2\u00b6\4\3\2\2\2\u00b7\u00b8"+
		"\5\u0089E\2\u00b8\u00b9\5\177@\2\u00b9\u00ba\5y=\2\u00ba\u00bb\5\u0093"+
		"J\2\u00bb\u00bc\5\177@\2\u00bc\u00bd\5\u00a3R\2\u00bd\6\3\2\2\2\u00be"+
		"\u00bf\5\u009fP\2\u00bf\u00c0\5\u0095K\2\u00c0\u00c1\5\u0097L\2\u00c1"+
		"\b\3\2\2\2\u00c2\u00c3\5\u0095K\2\u00c3\u00c4\5\u009bN\2\u00c4\u00c5\5"+
		"\177@\2\u00c5\u00c6\5\u0081A\2\u00c6\u00c7\5\u009bN\2\u00c7\n\3\2\2\2"+
		"\u00c8\u00c9\7*\2\2\u00c9\f\3\2\2\2\u00ca\u00cb\7+\2\2\u00cb\16\3\2\2"+
		"\2\u00cc\u00cd\7}\2\2\u00cd\20\3\2\2\2\u00ce\u00cf\7\177\2\2\u00cf\22"+
		"\3\2\2\2\u00d0\u00d1\7]\2\2\u00d1\24\3\2\2\2\u00d2\u00d3\7_\2\2\u00d3"+
		"\26\3\2\2\2\u00d4\u00d5\7=\2\2\u00d5\30\3\2\2\2\u00d6\u00d7\7.\2\2\u00d7"+
		"\32\3\2\2\2\u00d8\u00d9\7\60\2\2\u00d9\34\3\2\2\2\u00da\u00db\7\60\2\2"+
		"\u00db\u00dc\7\60\2\2\u00dc\36\3\2\2\2\u00dd\u00de\7\60\2\2\u00de\u00df"+
		"\7\60\2\2\u00df\u00e0\7.\2\2\u00e0 \3\2\2\2\u00e1\u00e2\7?\2\2\u00e2\""+
		"\3\2\2\2\u00e3\u00e4\7@\2\2\u00e4$\3\2\2\2\u00e5\u00e6\7>\2\2\u00e6&\3"+
		"\2\2\2\u00e7\u00e8\7#\2\2\u00e8(\3\2\2\2\u00e9\u00ea\7#\2\2\u00ea\u00eb"+
		"\7#\2\2\u00eb*\3\2\2\2\u00ec\u00ed\7\u0080\2\2\u00ed,\3\2\2\2\u00ee\u00ef"+
		"\7A\2\2\u00ef.\3\2\2\2\u00f0\u00f1\7<\2\2\u00f1\60\3\2\2\2\u00f2\u00f3"+
		"\7<\2\2\u00f3\u00f4\7<\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7<\2\2\u00f6\u00f7"+
		"\7?\2\2\u00f7\64\3\2\2\2\u00f8\u00f9\7?\2\2\u00f9\u00fa\7?\2\2\u00fa\66"+
		"\3\2\2\2\u00fb\u00fc\7>\2\2\u00fc\u00fd\7?\2\2\u00fd8\3\2\2\2\u00fe\u00ff"+
		"\7>\2\2\u00ff\u0100\7?\2\2\u0100\u0101\7@\2\2\u0101:\3\2\2\2\u0102\u0103"+
		"\7>\2\2\u0103\u0104\7@\2\2\u0104<\3\2\2\2\u0105\u0106\7@\2\2\u0106\u0107"+
		"\7?\2\2\u0107>\3\2\2\2\u0108\u0109\7>\2\2\u0109\u010a\7@\2\2\u010a@\3"+
		"\2\2\2\u010b\u010c\7#\2\2\u010c\u010d\7@\2\2\u010dB\3\2\2\2\u010e\u010f"+
		"\7#\2\2\u010f\u0110\7>\2\2\u0110D\3\2\2\2\u0111\u0112\7(\2\2\u0112\u0113"+
		"\7(\2\2\u0113F\3\2\2\2\u0114\u0115\7~\2\2\u0115\u0116\7~\2\2\u0116H\3"+
		"\2\2\2\u0117\u0118\7~\2\2\u0118\u0119\7~\2\2\u0119\u011a\7\61\2\2\u011a"+
		"J\3\2\2\2\u011b\u011c\7~\2\2\u011c\u011d\7\61\2\2\u011dL\3\2\2\2\u011e"+
		"\u011f\7-\2\2\u011fN\3\2\2\2\u0120\u0121\7/\2\2\u0121P\3\2\2\2\u0122\u0123"+
		"\7,\2\2\u0123R\3\2\2\2\u0124\u0125\7\61\2\2\u0125T\3\2\2\2\u0126\u0127"+
		"\7(\2\2\u0127V\3\2\2\2\u0128\u0129\7~\2\2\u0129X\3\2\2\2\u012a\u012b\7"+
		"`\2\2\u012bZ\3\2\2\2\u012c\u012d\7\'\2\2\u012d\\\3\2\2\2\u012e\u012f\7"+
		">\2\2\u012f\u0130\7>\2\2\u0130^\3\2\2\2\u0131\u0132\7@\2\2\u0132\u0133"+
		"\7@\2\2\u0133`\3\2\2\2\u0134\u0135\7B\2\2\u0135b\3\2\2\2\u0136\u0137\7"+
		"%\2\2\u0137d\3\2\2\2\u0138\u0139\5\177@\2\u0139\u013a\5\u0089E\2\u013a"+
		"\u013b\5\u00a3R\2\u013bf\3\2\2\2\u013c\u013d\7\'\2\2\u013dh\3\2\2\2\u013e"+
		"\u013f\7a\2\2\u013fj\3\2\2\2\u0140\u0141\t\2\2\2\u0141l\3\2\2\2\u0142"+
		"\u0144\5w<\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2\2"+
		"\2\u0145\u0146\3\2\2\2\u0146n\3\2\2\2\u0147\u0149\5w<\2\u0148\u0147\3"+
		"\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u0150\7\60\2\2\u014d\u014f\5w<\2\u014e\u014d\3\2"+
		"\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u015a\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0155\7\60\2\2\u0154\u0156\5"+
		"w<\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0148\3\2\2\2\u0159\u0153\3\2"+
		"\2\2\u015ap\3\2\2\2\u015b\u0161\5k\66\2\u015c\u0160\5s:\2\u015d\u0160"+
		"\5m\67\2\u015e\u0160\5o8\2\u015f\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\5k\66\2\u0165"+
		"r\3\2\2\2\u0166\u016b\5u;\2\u0167\u016a\5u;\2\u0168\u016a\5w<\2\u0169"+
		"\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016ct\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170"+
		"\t\3\2\2\u016f\u016e\3\2\2\2\u0170v\3\2\2\2\u0171\u0172\t\4\2\2\u0172"+
		"x\3\2\2\2\u0173\u0174\t\5\2\2\u0174z\3\2\2\2\u0175\u0176\t\6\2\2\u0176"+
		"|\3\2\2\2\u0177\u0178\t\7\2\2\u0178~\3\2\2\2\u0179\u017a\t\b\2\2\u017a"+
		"\u0080\3\2\2\2\u017b\u017c\t\t\2\2\u017c\u0082\3\2\2\2\u017d\u017e\t\n"+
		"\2\2\u017e\u0084\3\2\2\2\u017f\u0180\t\13\2\2\u0180\u0086\3\2\2\2\u0181"+
		"\u0182\t\f\2\2\u0182\u0088\3\2\2\2\u0183\u0184\t\r\2\2\u0184\u008a\3\2"+
		"\2\2\u0185\u0186\t\16\2\2\u0186\u008c\3\2\2\2\u0187\u0188\t\17\2\2\u0188"+
		"\u008e\3\2\2\2\u0189\u018a\t\20\2\2\u018a\u0090\3\2\2\2\u018b\u018c\t"+
		"\21\2\2\u018c\u0092\3\2\2\2\u018d\u018e\t\22\2\2\u018e\u0094\3\2\2\2\u018f"+
		"\u0190\t\23\2\2\u0190\u0096\3\2\2\2\u0191\u0192\t\24\2\2\u0192\u0098\3"+
		"\2\2\2\u0193\u0194\t\25\2\2\u0194\u009a\3\2\2\2\u0195\u0196\t\26\2\2\u0196"+
		"\u009c\3\2\2\2\u0197\u0198\t\27\2\2\u0198\u009e\3\2\2\2\u0199\u019a\t"+
		"\30\2\2\u019a\u00a0\3\2\2\2\u019b\u019c\t\31\2\2\u019c\u00a2\3\2\2\2\u019d"+
		"\u019e\t\32\2\2\u019e\u00a4\3\2\2\2\u019f\u01a0\t\33\2\2\u01a0\u00a6\3"+
		"\2\2\2\u01a1\u01a2\t\34\2\2\u01a2\u00a8\3\2\2\2\u01a3\u01a4\t\35\2\2\u01a4"+
		"\u00aa\3\2\2\2\u01a5\u01a6\t\36\2\2\u01a6\u00ac\3\2\2\2\u01a7\u01a9\t"+
		"\37\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\bW\2\2\u01ad\u00ae\3\2"+
		"\2\2\16\2\u0145\u014a\u0150\u0157\u0159\u015f\u0161\u0169\u016b\u016f"+
		"\u01aa\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}