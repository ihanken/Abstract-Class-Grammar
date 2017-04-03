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
		T__0=1, T__1=2, T__2=3, CLASSSCOPE=4, SCOPE=5, NAME=6, FUNCTION=7, VARIABLE=8, 
		FUNCTYPE=9, VARTYPE=10, WS=11;
	public static final int
		RULE_full = 0;
	public static final String[] ruleNames = {
		"full"
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
		public List<TerminalNode> VARIABLE() { return getTokens(AbstractClassParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(AbstractClassParser.VARIABLE, i);
		}
		public List<TerminalNode> FUNCTION() { return getTokens(AbstractClassParser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(AbstractClassParser.FUNCTION, i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(3);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASSSCOPE) {
				{
				setState(2);
				match(CLASSSCOPE);
				}
			}

			setState(5);
			match(T__0);
			setState(6);
			match(NAME);
			setState(7);
			match(T__1);
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION || _la==VARIABLE) {
				{
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(8);
					_la = _input.LA(1);
					if ( !(_la==FUNCTION || _la==VARIABLE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(11); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FUNCTION || _la==VARIABLE );
				}
			}

			setState(15);
			match(T__2);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r\24\4\2\t\2\3\2"+
		"\5\2\6\n\2\3\2\3\2\3\2\3\2\6\2\f\n\2\r\2\16\2\r\5\2\20\n\2\3\2\3\2\3\2"+
		"\2\2\3\2\2\3\3\2\t\n\2\25\2\5\3\2\2\2\4\6\7\6\2\2\5\4\3\2\2\2\5\6\3\2"+
		"\2\2\6\7\3\2\2\2\7\b\7\3\2\2\b\t\7\b\2\2\t\17\7\4\2\2\n\f\t\2\2\2\13\n"+
		"\3\2\2\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\20\3\2\2\2\17\13\3\2"+
		"\2\2\17\20\3\2\2\2\20\21\3\2\2\2\21\22\7\5\2\2\22\3\3\2\2\2\5\5\r\17";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}