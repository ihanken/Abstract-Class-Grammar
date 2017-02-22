// Generated from AbstractClass.g4 by ANTLR 4.5.3
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
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SCOPE=4, WS=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "SCOPE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'abstract class'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "SCOPE", "WS"
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
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7>\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\66\n\5\3\6\6\6"+
		"9\n\6\r\6\16\6:\3\6\3\6\2\2\7\3\3\5\4\7\5\t\6\13\7\3\2\3\5\2\13\f\17\17"+
		"\"\"@\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\r"+
		"\3\2\2\2\5\34\3\2\2\2\7\36\3\2\2\2\t\65\3\2\2\2\138\3\2\2\2\r\16\7c\2"+
		"\2\16\17\7d\2\2\17\20\7u\2\2\20\21\7v\2\2\21\22\7t\2\2\22\23\7c\2\2\23"+
		"\24\7e\2\2\24\25\7v\2\2\25\26\7\"\2\2\26\27\7e\2\2\27\30\7n\2\2\30\31"+
		"\7c\2\2\31\32\7u\2\2\32\33\7u\2\2\33\4\3\2\2\2\34\35\7}\2\2\35\6\3\2\2"+
		"\2\36\37\7\177\2\2\37\b\3\2\2\2 !\7r\2\2!\"\7w\2\2\"#\7d\2\2#$\7n\2\2"+
		"$%\7k\2\2%\66\7e\2\2&\'\7r\2\2\'(\7t\2\2()\7k\2\2)*\7x\2\2*+\7c\2\2+,"+
		"\7v\2\2,\66\7g\2\2-.\7k\2\2./\7p\2\2/\60\7v\2\2\60\61\7g\2\2\61\62\7t"+
		"\2\2\62\63\7p\2\2\63\64\7c\2\2\64\66\7n\2\2\65 \3\2\2\2\65&\3\2\2\2\65"+
		"-\3\2\2\2\66\n\3\2\2\2\679\t\2\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3"+
		"\2\2\2;<\3\2\2\2<=\b\6\2\2=\f\3\2\2\2\5\2\65:\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}