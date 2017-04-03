// Generated from AbstractClass.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbstractClassLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, CLASSSCOPE=4, SCOPE=5, NAME=6, FUNCTION=7, VARIABLE=8, 
		FUNCTYPE=9, VARTYPE=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "CLASSSCOPE", "SCOPE", "NAME", "FUNCTION", "VARIABLE", 
		"FUNCTYPE", "VARTYPE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' abstract class '", "'{'", "'}'", null, null, null, null, null, 
		null, "'int'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "CLASSSCOPE", "SCOPE", "NAME", "FUNCTION", "VARIABLE", 
		"FUNCTYPE", "VARTYPE", "WS"
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


	public AbstractClassLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AbstractClass.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6G\n\6\3\7\6\7"+
		"J\n\7\r\7\16\7K\3\b\5\bO\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\5\td\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\5\nq\n\n\3\13\3\13\3\13\3\13\3\f\6\fx\n\f\r\f\16\f"+
		"y\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2"+
		"\4\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0083\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5*\3\2\2\2\7,\3\2\2"+
		"\2\t<\3\2\2\2\13F\3\2\2\2\rI\3\2\2\2\17N\3\2\2\2\21c\3\2\2\2\23p\3\2\2"+
		"\2\25r\3\2\2\2\27w\3\2\2\2\31\32\7\"\2\2\32\33\7c\2\2\33\34\7d\2\2\34"+
		"\35\7u\2\2\35\36\7v\2\2\36\37\7t\2\2\37 \7c\2\2 !\7e\2\2!\"\7v\2\2\"#"+
		"\7\"\2\2#$\7e\2\2$%\7n\2\2%&\7c\2\2&\'\7u\2\2\'(\7u\2\2()\7\"\2\2)\4\3"+
		"\2\2\2*+\7}\2\2+\6\3\2\2\2,-\7\177\2\2-\b\3\2\2\2./\7r\2\2/\60\7w\2\2"+
		"\60\61\7d\2\2\61\62\7n\2\2\62\63\7k\2\2\63=\7e\2\2\64\65\7k\2\2\65\66"+
		"\7p\2\2\66\67\7v\2\2\678\7g\2\289\7t\2\29:\7p\2\2:;\7c\2\2;=\7n\2\2<."+
		"\3\2\2\2<\64\3\2\2\2=\n\3\2\2\2>G\5\t\5\2?@\7r\2\2@A\7t\2\2AB\7k\2\2B"+
		"C\7x\2\2CD\7c\2\2DE\7v\2\2EG\7g\2\2F>\3\2\2\2F?\3\2\2\2G\f\3\2\2\2HJ\t"+
		"\2\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\16\3\2\2\2MO\5\13\6\2"+
		"NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\"\2\2QR\7c\2\2RS\7d\2\2ST\7u\2\2TU"+
		"\7v\2\2UV\7t\2\2VW\7c\2\2WX\7e\2\2XY\7v\2\2YZ\7\"\2\2Z[\3\2\2\2[\\\5\23"+
		"\n\2\\]\7\"\2\2]^\5\r\7\2^_\7*\2\2_`\7+\2\2`a\7=\2\2a\20\3\2\2\2bd\5\13"+
		"\6\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\"\2\2fg\5\25\13\2gh\7\"\2\2hi\5"+
		"\r\7\2ij\7=\2\2j\22\3\2\2\2kq\5\25\13\2lm\7x\2\2mn\7q\2\2no\7k\2\2oq\7"+
		"f\2\2pk\3\2\2\2pl\3\2\2\2q\24\3\2\2\2rs\7k\2\2st\7p\2\2tu\7v\2\2u\26\3"+
		"\2\2\2vx\t\3\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b"+
		"\f\2\2|\30\3\2\2\2\n\2<FKNcpy\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}