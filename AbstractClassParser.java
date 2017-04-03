// Generated from AbstractClass.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbstractClassParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, CLASSSCOPE=7, SCOPE=8, 
		NAME=9, MEMBER=10, FUNCTION=11, VARIABLE=12, PARAMETERS=13, PARAMETER=14, 
		FUNCTYPE=15, VARTYPE=16, INT=17, FLOAT=18, STRING=19, WS=20;
	public static final int
		RULE_full = 0;
	public static final String[] ruleNames = {
		"full"
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

	@Override
	public String getGrammarFileName() { return "AbstractClass.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AbstractClassParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FullContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(AbstractClassParser.NAME, 0); }
		public TerminalNode CLASSSCOPE() { return getToken(AbstractClassParser.CLASSSCOPE, 0); }
		public List<TerminalNode> MEMBER() { return getTokens(AbstractClassParser.MEMBER); }
		public TerminalNode MEMBER(int i) {
			return getToken(AbstractClassParser.MEMBER, i);
		}
		public FullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbstractClassListener ) ((AbstractClassListener)listener).enterFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbstractClassListener ) ((AbstractClassListener)listener).exitFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbstractClassVisitor ) return ((AbstractClassVisitor<? extends T>)visitor).visitFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullContext full() throws RecognitionException {
		FullContext _localctx = new FullContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_full);
		int _la;
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case CLASSSCOPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(4);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLASSSCOPE) {
					{
					setState(2);
					match(CLASSSCOPE);
					setState(3);
					match(T__0);
					}
				}

				setState(6);
				match(T__1);
				setState(7);
				match(NAME);
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(9); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(8);
						match(T__0);
						}
						}
						setState(11); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__0 );
					}
				}

				setState(15);
				match(T__2);
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MEMBER) {
					{
					setState(17); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(16);
						match(MEMBER);
						}
						}
						setState(19); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==MEMBER );
					}
				}

				setState(23);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(T__4);
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLASSSCOPE) {
					{
					setState(25);
					match(CLASSSCOPE);
					setState(26);
					match(T__0);
					}
				}

				setState(29);
				match(T__5);
				setState(30);
				match(NAME);
				setState(31);
				match(T__2);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MEMBER) {
					{
					setState(33); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(32);
						match(MEMBER);
						}
						}
						setState(35); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==MEMBER );
					}
				}

				setState(39);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26-\4\2\t\2\3\2\3"+
		"\2\5\2\7\n\2\3\2\3\2\3\2\6\2\f\n\2\r\2\16\2\r\5\2\20\n\2\3\2\3\2\6\2\24"+
		"\n\2\r\2\16\2\25\5\2\30\n\2\3\2\3\2\3\2\3\2\5\2\36\n\2\3\2\3\2\3\2\3\2"+
		"\6\2$\n\2\r\2\16\2%\5\2(\n\2\3\2\5\2+\n\2\3\2\2\2\3\2\2\2\2\64\2*\3\2"+
		"\2\2\4\5\7\t\2\2\5\7\7\3\2\2\6\4\3\2\2\2\6\7\3\2\2\2\7\b\3\2\2\2\b\t\7"+
		"\4\2\2\t\17\7\13\2\2\n\f\7\3\2\2\13\n\3\2\2\2\f\r\3\2\2\2\r\13\3\2\2\2"+
		"\r\16\3\2\2\2\16\20\3\2\2\2\17\13\3\2\2\2\17\20\3\2\2\2\20\21\3\2\2\2"+
		"\21\27\7\5\2\2\22\24\7\f\2\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2"+
		"\25\26\3\2\2\2\26\30\3\2\2\2\27\23\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2"+
		"\31+\7\6\2\2\32\35\7\7\2\2\33\34\7\t\2\2\34\36\7\3\2\2\35\33\3\2\2\2\35"+
		"\36\3\2\2\2\36\37\3\2\2\2\37 \7\b\2\2 !\7\13\2\2!\'\7\5\2\2\"$\7\f\2\2"+
		"#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'#\3\2\2\2\'(\3\2"+
		"\2\2()\3\2\2\2)+\7\6\2\2*\6\3\2\2\2*\32\3\2\2\2+\3\3\2\2\2\13\6\r\17\25"+
		"\27\35%\'*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}