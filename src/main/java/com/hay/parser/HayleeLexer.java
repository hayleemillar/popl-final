// Generated from /Users/hayleemillar/Desktop/popl/boolean/src/main/antlr/Haylee.g4 by ANTLR 4.8
package com.hay.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HayleeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, VAR=12, STR=13, LETTER=14, BOOL_VAL=15, INT_VAL=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "VAR", "STR", "LETTER", "BOOL_VAL", "INT_VAL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'(or'", "')'", "'(and'", "'(not'", "'(if'", "'(let'", "'(add'", 
			"'(sub'", "'(mult'", "'(lambda'", "'(call'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"VAR", "STR", "LETTER", "BOOL_VAL", "INT_VAL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public HayleeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Haylee.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r`\n\r\f\r\16\rc\13\r\3\16\6\16"+
		"f\n\16\r\16\16\16g\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20u\n\20\3\21\6\21x\n\21\r\21\16\21y\3\22\6\22}\n\22\r\22\16\22"+
		"~\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23\3\2\5\3\2c|\3\2\62;\5\2\13\f\17\17\""+
		"\"\2\u0087\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\3%\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t\60\3\2\2\2\13\65\3\2"+
		"\2\2\r9\3\2\2\2\17>\3\2\2\2\21C\3\2\2\2\23H\3\2\2\2\25N\3\2\2\2\27V\3"+
		"\2\2\2\31\\\3\2\2\2\33e\3\2\2\2\35i\3\2\2\2\37t\3\2\2\2!w\3\2\2\2#|\3"+
		"\2\2\2%&\7*\2\2&\'\7q\2\2\'(\7t\2\2(\4\3\2\2\2)*\7+\2\2*\6\3\2\2\2+,\7"+
		"*\2\2,-\7c\2\2-.\7p\2\2./\7f\2\2/\b\3\2\2\2\60\61\7*\2\2\61\62\7p\2\2"+
		"\62\63\7q\2\2\63\64\7v\2\2\64\n\3\2\2\2\65\66\7*\2\2\66\67\7k\2\2\678"+
		"\7h\2\28\f\3\2\2\29:\7*\2\2:;\7n\2\2;<\7g\2\2<=\7v\2\2=\16\3\2\2\2>?\7"+
		"*\2\2?@\7c\2\2@A\7f\2\2AB\7f\2\2B\20\3\2\2\2CD\7*\2\2DE\7u\2\2EF\7w\2"+
		"\2FG\7d\2\2G\22\3\2\2\2HI\7*\2\2IJ\7o\2\2JK\7w\2\2KL\7n\2\2LM\7v\2\2M"+
		"\24\3\2\2\2NO\7*\2\2OP\7n\2\2PQ\7c\2\2QR\7o\2\2RS\7d\2\2ST\7f\2\2TU\7"+
		"c\2\2U\26\3\2\2\2VW\7*\2\2WX\7e\2\2XY\7c\2\2YZ\7n\2\2Z[\7n\2\2[\30\3\2"+
		"\2\2\\a\5\33\16\2]`\5\33\16\2^`\5!\21\2_]\3\2\2\2_^\3\2\2\2`c\3\2\2\2"+
		"a_\3\2\2\2ab\3\2\2\2b\32\3\2\2\2ca\3\2\2\2df\5\35\17\2ed\3\2\2\2fg\3\2"+
		"\2\2ge\3\2\2\2gh\3\2\2\2h\34\3\2\2\2ij\t\2\2\2j\36\3\2\2\2kl\7V\2\2lm"+
		"\7t\2\2mn\7w\2\2nu\7g\2\2op\7H\2\2pq\7c\2\2qr\7n\2\2rs\7u\2\2su\7g\2\2"+
		"tk\3\2\2\2to\3\2\2\2u \3\2\2\2vx\t\3\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2"+
		"yz\3\2\2\2z\"\3\2\2\2{}\t\4\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080\u0081\b\22\2\2\u0081$\3\2\2\2\t\2_agty~\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}