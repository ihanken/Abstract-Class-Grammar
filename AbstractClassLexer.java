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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, CLASSSCOPE=7, SCOPE=8, 
		NAME=9, MEMBER=10, FUNCTION=11, VARIABLE=12, PARAMETERS=13, PARAMETER=14, 
		FUNCTYPE=15, VARTYPE=16, INT=17, FLOAT=18, STRING=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "CLASSSCOPE", "SCOPE", 
		"NAME", "MEMBER", "FUNCTION", "VARIABLE", "PARAMETERS", "PARAMETER", "FUNCTYPE", 
		"VARTYPE", "INT", "FLOAT", "STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'abstract class '", "'{'", "'}'", "'abstract '", "'class'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "CLASSSCOPE", "SCOPE", "NAME", 
		"MEMBER", "FUNCTION", "VARIABLE", "PARAMETERS", "PARAMETER", "FUNCTYPE", 
		"VARTYPE", "INT", "FLOAT", "STRING", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u01db\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b`\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\ts\n\t\3\n\5\nv\n\n\3\n\6"+
		"\ny\n\n\r\n\16\nz\3\13\3\13\5\13\177\n\13\3\f\3\f\3\f\5\f\u0084\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0095\n"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00a7\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ae\n\f\3\f\3\f\3\f\5\f\u00b3\n\f"+
		"\3\r\3\r\3\r\5\r\u00b8\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c3"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d1\n\r\3\r"+
		"\3\r\3\r\5\r\u00d6\n\r\3\r\3\r\3\r\5\r\u00db\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00e4\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00ef\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0102\n\21\5\21\u0104\n\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u010f\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u011b\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0129\n\21\3\21\5\21"+
		"\u012c\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u013a\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0146\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0152"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u015c\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0167\n\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0172\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u017e\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0193"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01a0"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01ad"+
		"\n\21\5\21\u01af\n\21\3\22\6\22\u01b2\n\22\r\22\16\22\u01b3\3\23\6\23"+
		"\u01b7\n\23\r\23\16\23\u01b8\3\23\3\23\7\23\u01bd\n\23\f\23\16\23\u01c0"+
		"\13\23\3\23\3\23\6\23\u01c4\n\23\r\23\16\23\u01c5\5\23\u01c8\n\23\3\24"+
		"\3\24\3\24\3\24\7\24\u01ce\n\24\f\24\16\24\u01d1\13\24\3\24\3\24\3\25"+
		"\6\25\u01d6\n\25\r\25\16\25\u01d7\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26\3\2\6\4\2C\\c|\5\2\f\f\17\17$$\3\2\62;\5\2\13\f\17\17\"\"\2\u0212"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7=\3\2\2"+
		"\2\t?\3\2\2\2\13A\3\2\2\2\rK\3\2\2\2\17_\3\2\2\2\21r\3\2\2\2\23u\3\2\2"+
		"\2\25~\3\2\2\2\27\u00b2\3\2\2\2\31\u00da\3\2\2\2\33\u00e3\3\2\2\2\35\u00e5"+
		"\3\2\2\2\37\u00ee\3\2\2\2!\u01ae\3\2\2\2#\u01b1\3\2\2\2%\u01c7\3\2\2\2"+
		"\'\u01c9\3\2\2\2)\u01d5\3\2\2\2+,\7\"\2\2,\4\3\2\2\2-.\7c\2\2./\7d\2\2"+
		"/\60\7u\2\2\60\61\7v\2\2\61\62\7t\2\2\62\63\7c\2\2\63\64\7e\2\2\64\65"+
		"\7v\2\2\65\66\7\"\2\2\66\67\7e\2\2\678\7n\2\289\7c\2\29:\7u\2\2:;\7u\2"+
		"\2;<\7\"\2\2<\6\3\2\2\2=>\7}\2\2>\b\3\2\2\2?@\7\177\2\2@\n\3\2\2\2AB\7"+
		"c\2\2BC\7d\2\2CD\7u\2\2DE\7v\2\2EF\7t\2\2FG\7c\2\2GH\7e\2\2HI\7v\2\2I"+
		"J\7\"\2\2J\f\3\2\2\2KL\7e\2\2LM\7n\2\2MN\7c\2\2NO\7u\2\2OP\7u\2\2P\16"+
		"\3\2\2\2QR\7r\2\2RS\7w\2\2ST\7d\2\2TU\7n\2\2UV\7k\2\2V`\7e\2\2WX\7k\2"+
		"\2XY\7p\2\2YZ\7v\2\2Z[\7g\2\2[\\\7t\2\2\\]\7p\2\2]^\7c\2\2^`\7n\2\2_Q"+
		"\3\2\2\2_W\3\2\2\2`\20\3\2\2\2as\5\17\b\2bc\7r\2\2cd\7t\2\2de\7k\2\2e"+
		"f\7x\2\2fg\7c\2\2gh\7v\2\2hs\7g\2\2ij\7r\2\2jk\7t\2\2kl\7q\2\2lm\7v\2"+
		"\2mn\7g\2\2no\7e\2\2op\7v\2\2pq\7g\2\2qs\7f\2\2ra\3\2\2\2rb\3\2\2\2ri"+
		"\3\2\2\2s\22\3\2\2\2tv\7a\2\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2wy\t\2\2\2"+
		"xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\24\3\2\2\2|\177\5\27\f\2}\177"+
		"\5\31\r\2~|\3\2\2\2~}\3\2\2\2\177\26\3\2\2\2\u0080\u0081\5\21\t\2\u0081"+
		"\u0082\7\"\2\2\u0082\u0084\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7c\2\2\u0086\u0087\7d\2\2\u0087\u0088"+
		"\7u\2\2\u0088\u0089\7v\2\2\u0089\u008a\7t\2\2\u008a\u008b\7c\2\2\u008b"+
		"\u008c\7e\2\2\u008c\u008d\7v\2\2\u008d\u008e\7\"\2\2\u008e\u008f\3\2\2"+
		"\2\u008f\u0090\5\37\20\2\u0090\u0091\7\"\2\2\u0091\u0092\5\23\n\2\u0092"+
		"\u0094\7*\2\2\u0093\u0095\5\33\16\2\u0094\u0093\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7+\2\2\u0097\u0098\7=\2\2\u0098"+
		"\u00b3\3\2\2\2\u0099\u009a\7c\2\2\u009a\u009b\7d\2\2\u009b\u009c\7u\2"+
		"\2\u009c\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e\u009f\7c\2\2\u009f\u00a0"+
		"\7e\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7\"\2\2\u00a2\u00a6\3\2\2\2\u00a3"+
		"\u00a4\5\21\t\2\u00a4\u00a5\7\"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a3\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\5\37\20\2\u00a9"+
		"\u00aa\7\"\2\2\u00aa\u00ab\5\23\n\2\u00ab\u00ad\7*\2\2\u00ac\u00ae\5\33"+
		"\16\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\7+\2\2\u00b0\u00b1\7=\2\2\u00b1\u00b3\3\2\2\2\u00b2\u0083\3\2\2"+
		"\2\u00b2\u0099\3\2\2\2\u00b3\30\3\2\2\2\u00b4\u00b5\5\21\t\2\u00b5\u00b6"+
		"\7\"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00c2\3\2\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7d\2\2\u00bb\u00bc\7u\2"+
		"\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0"+
		"\7e\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c3\7\"\2\2\u00c2\u00b9\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\5!\21\2\u00c5\u00c6\7="+
		"\2\2\u00c6\u00db\3\2\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca"+
		"\7u\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7c\2\2\u00cd"+
		"\u00ce\7e\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d1\7\"\2\2\u00d0\u00c7\3\2\2"+
		"\2\u00d0\u00d1\3\2\2\2\u00d1\u00d5\3\2\2\2\u00d2\u00d3\5\21\t\2\u00d3"+
		"\u00d4\7\"\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\5!\21\2\u00d8\u00d9\7=\2\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00b7\3\2\2\2\u00da\u00d0\3\2\2\2\u00db\32\3\2\2"+
		"\2\u00dc\u00dd\5\35\17\2\u00dd\u00de\7.\2\2\u00de\u00df\7\"\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\5\33\16\2\u00e1\u00e4\3\2\2\2\u00e2\u00e4\5"+
		"\35\17\2\u00e3\u00dc\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\34\3\2\2\2\u00e5"+
		"\u00e6\5!\21\2\u00e6\u00e7\7\"\2\2\u00e7\u00e8\5\23\n\2\u00e8\36\3\2\2"+
		"\2\u00e9\u00ef\5!\21\2\u00ea\u00eb\7x\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed"+
		"\7k\2\2\u00ed\u00ef\7f\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ef"+
		" \3\2\2\2\u00f0\u00f1\7d\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7q\2\2\u00f3"+
		"\u00f4\7n\2\2\u00f4\u00f5\7\"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u0103\5\23"+
		"\n\2\u00f7\u0101\7?\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb"+
		"\7w\2\2\u00fb\u0102\7g\2\2\u00fc\u00fd\7h\2\2\u00fd\u00fe\7c\2\2\u00fe"+
		"\u00ff\7n\2\2\u00ff\u0100\7u\2\2\u0100\u0102\7g\2\2\u0101\u00f8\3\2\2"+
		"\2\u0101\u00fc\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u00f7\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u01af\3\2\2\2\u0105\u0106\7d\2\2\u0106\u0107\7{\2\2\u0107"+
		"\u0108\7v\2\2\u0108\u0109\7g\2\2\u0109\u010a\7\"\2\2\u010a\u010b\3\2\2"+
		"\2\u010b\u010e\5\23\n\2\u010c\u010d\7?\2\2\u010d\u010f\5#\22\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u01af\3\2\2\2\u0110\u0111\7u\2\2\u0111"+
		"\u0112\7d\2\2\u0112\u0113\7{\2\2\u0113\u0114\7v\2\2\u0114\u0115\7g\2\2"+
		"\u0115\u0116\7\"\2\2\u0116\u0117\3\2\2\2\u0117\u011a\5\23\n\2\u0118\u0119"+
		"\7?\2\2\u0119\u011b\5#\22\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u01af\3\2\2\2\u011c\u011d\7e\2\2\u011d\u011e\7j\2\2\u011e\u011f\7c\2"+
		"\2\u011f\u0120\7t\2\2\u0120\u0121\7\"\2\2\u0121\u0122\3\2\2\2\u0122\u012b"+
		"\5\23\n\2\u0123\u0124\7?\2\2\u0124\u0128\7)\2\2\u0125\u0129\n\3\2\2\u0126"+
		"\u0127\7$\2\2\u0127\u0129\7$\2\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2\2"+
		"\2\u0129\u012a\3\2\2\2\u012a\u012c\7)\2\2\u012b\u0123\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u01af\3\2\2\2\u012d\u012e\7f\2\2\u012e\u012f\7g\2\2\u012f"+
		"\u0130\7e\2\2\u0130\u0131\7k\2\2\u0131\u0132\7o\2\2\u0132\u0133\7c\2\2"+
		"\u0133\u0134\7n\2\2\u0134\u0135\7\"\2\2\u0135\u0136\3\2\2\2\u0136\u0139"+
		"\5\23\n\2\u0137\u0138\7?\2\2\u0138\u013a\5%\23\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u01af\3\2\2\2\u013b\u013c\7f\2\2\u013c\u013d\7q\2"+
		"\2\u013d\u013e\7w\2\2\u013e\u013f\7d\2\2\u013f\u0140\7n\2\2\u0140\u0141"+
		"\7g\2\2\u0141\u0142\7\"\2\2\u0142\u0145\3\2\2\2\u0143\u0144\7?\2\2\u0144"+
		"\u0146\5%\23\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u01af\3\2"+
		"\2\2\u0147\u0148\7h\2\2\u0148\u0149\7n\2\2\u0149\u014a\7q\2\2\u014a\u014b"+
		"\7c\2\2\u014b\u014c\7v\2\2\u014c\u014d\7\"\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0151\5\23\n\2\u014f\u0150\7?\2\2\u0150\u0152\5%\23\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u01af\3\2\2\2\u0153\u0154\7k\2\2\u0154"+
		"\u0155\7p\2\2\u0155\u0156\7v\2\2\u0156\u0157\7\"\2\2\u0157\u0158\3\2\2"+
		"\2\u0158\u015b\5\23\n\2\u0159\u015a\7?\2\2\u015a\u015c\5#\22\2\u015b\u0159"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u01af\3\2\2\2\u015d\u015e\7w\2\2\u015e"+
		"\u015f\7k\2\2\u015f\u0160\7p\2\2\u0160\u0161\7v\2\2\u0161\u0162\7\"\2"+
		"\2\u0162\u0163\3\2\2\2\u0163\u0166\5\23\n\2\u0164\u0165\7?\2\2\u0165\u0167"+
		"\5#\22\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u01af\3\2\2\2\u0168"+
		"\u0169\7n\2\2\u0169\u016a\7q\2\2\u016a\u016b\7p\2\2\u016b\u016c\7i\2\2"+
		"\u016c\u016d\7\"\2\2\u016d\u016e\3\2\2\2\u016e\u0171\5\23\n\2\u016f\u0170"+
		"\7?\2\2\u0170\u0172\5#\22\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u01af\3\2\2\2\u0173\u0174\7w\2\2\u0174\u0175\7n\2\2\u0175\u0176\7q\2"+
		"\2\u0176\u0177\7p\2\2\u0177\u0178\7i\2\2\u0178\u0179\7\"\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017d\5\23\n\2\u017b\u017c\7?\2\2\u017c\u017e\5#\22\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u01af\3\2\2\2\u017f\u0180\7q"+
		"\2\2\u0180\u0181\7d\2\2\u0181\u0182\7l\2\2\u0182\u0183\7g\2\2\u0183\u0184"+
		"\7e\2\2\u0184\u0185\7v\2\2\u0185\u0186\7\"\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u01af\5\23\n\2\u0188\u0189\7u\2\2\u0189\u018a\7j\2\2\u018a\u018b\7q\2"+
		"\2\u018b\u018c\7t\2\2\u018c\u018d\7v\2\2\u018d\u018e\7\"\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u0192\5\23\n\2\u0190\u0191\7?\2\2\u0191\u0193\5#\22\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u01af\3\2\2\2\u0194\u0195\7w"+
		"\2\2\u0195\u0196\7u\2\2\u0196\u0197\7j\2\2\u0197\u0198\7q\2\2\u0198\u0199"+
		"\7t\2\2\u0199\u019a\7v\2\2\u019a\u019b\7\"\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019f\5\23\n\2\u019d\u019e\7?\2\2\u019e\u01a0\5#\22\2\u019f\u019d\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0\u01af\3\2\2\2\u01a1\u01a2\7u\2\2\u01a2"+
		"\u01a3\7v\2\2\u01a3\u01a4\7t\2\2\u01a4\u01a5\7k\2\2\u01a5\u01a6\7p\2\2"+
		"\u01a6\u01a7\7i\2\2\u01a7\u01a8\7\"\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ac"+
		"\5\23\n\2\u01aa\u01ab\7?\2\2\u01ab\u01ad\5\'\24\2\u01ac\u01aa\3\2\2\2"+
		"\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u00f0\3\2\2\2\u01ae\u0105"+
		"\3\2\2\2\u01ae\u0110\3\2\2\2\u01ae\u011c\3\2\2\2\u01ae\u012d\3\2\2\2\u01ae"+
		"\u013b\3\2\2\2\u01ae\u0147\3\2\2\2\u01ae\u0153\3\2\2\2\u01ae\u015d\3\2"+
		"\2\2\u01ae\u0168\3\2\2\2\u01ae\u0173\3\2\2\2\u01ae\u017f\3\2\2\2\u01ae"+
		"\u0188\3\2\2\2\u01ae\u0194\3\2\2\2\u01ae\u01a1\3\2\2\2\u01af\"\3\2\2\2"+
		"\u01b0\u01b2\t\4\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b1"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4$\3\2\2\2\u01b5\u01b7\t\4\2\2\u01b6"+
		"\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01be\7\60\2\2\u01bb\u01bd\t\4\2\2\u01bc"+
		"\u01bb\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2"+
		"\2\2\u01bf\u01c8\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c3\7\60\2\2\u01c2"+
		"\u01c4\t\4\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c3\3\2"+
		"\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01b6\3\2\2\2\u01c7"+
		"\u01c1\3\2\2\2\u01c8&\3\2\2\2\u01c9\u01cf\7$\2\2\u01ca\u01ce\n\3\2\2\u01cb"+
		"\u01cc\7$\2\2\u01cc\u01ce\7$\2\2\u01cd\u01ca\3\2\2\2\u01cd\u01cb\3\2\2"+
		"\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2"+
		"\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\7$\2\2\u01d3(\3\2\2\2\u01d4\u01d6"+
		"\t\5\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\b\25\2\2\u01da*\3\2\2\2"+
		"-\2_ruz~\u0083\u0094\u00a6\u00ad\u00b2\u00b7\u00c2\u00d0\u00d5\u00da\u00e3"+
		"\u00ee\u0101\u0103\u010e\u011a\u0128\u012b\u0139\u0145\u0151\u015b\u0166"+
		"\u0171\u017d\u0192\u019f\u01ac\u01ae\u01b3\u01b8\u01be\u01c5\u01c7\u01cd"+
		"\u01cf\u01d7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}