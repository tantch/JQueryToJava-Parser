// Generated from Hello.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, OP=2, OPENP=3, CLOSEP=4, OPENB=5, CLOSEB=6, ALL=7, IN=8, OUT=9, 
		STRING=10, ENDL=11, DELIMITER=12, EQS=13, SEP=14, PSS=15, PPS=16, OPENXP=17, 
		CLOSEXP=18, WS=19;
	public static final int
		RULE_ops = 0, RULE_start = 1, RULE_input = 2, RULE_output = 3, RULE_exp = 4, 
		RULE_exp1 = 5, RULE_braexp = 6, RULE_psel = 7;
	public static final String[] ruleNames = {
		"ops", "start", "input", "output", "exp", "exp1", "braexp", "psel"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "'['", "']'", "'*'", "'in'", "'out'", 
		null, "';'", "'''", "'='", null, null, null, "'$(\"'", "'\")'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUM", "OP", "OPENP", "CLOSEP", "OPENB", "CLOSEB", "ALL", "IN", 
		"OUT", "STRING", "ENDL", "DELIMITER", "EQS", "SEP", "PSS", "PPS", "OPENXP", 
		"CLOSEXP", "WS"
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
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OpsContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(HelloParser.OP, 0); }
		public TerminalNode EQS() { return getToken(HelloParser.EQS, 0); }
		public OpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterOps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitOps(this);
		}
	}

	public final OpsContext ops() throws RecognitionException {
		OpsContext _localctx = new OpsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_la = _input.LA(1);
			if ( !(_la==OP || _la==EQS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class StartContext extends ParserRuleContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HelloParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			input();
			setState(19);
			output();
			setState(20);
			exp();
			setState(21);
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

	public static class InputContext extends ParserRuleContext {
		public String v;
		public Token STRING;
		public TerminalNode IN() { return getToken(HelloParser.IN, 0); }
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public TerminalNode ENDL() { return getToken(HelloParser.ENDL, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(IN);
			setState(25);
			((InputContext)_localctx).STRING = match(STRING);
			setState(26);
			match(ENDL);
			((InputContext)_localctx).v = (((InputContext)_localctx).STRING!=null?((InputContext)_localctx).STRING.getText():null);
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

	public static class OutputContext extends ParserRuleContext {
		public String s;
		public Token STRING;
		public TerminalNode OUT() { return getToken(HelloParser.OUT, 0); }
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public TerminalNode ENDL() { return getToken(HelloParser.ENDL, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(OUT);
			setState(30);
			((OutputContext)_localctx).STRING = match(STRING);
			setState(31);
			match(ENDL);
			((OutputContext)_localctx).s = (((OutputContext)_localctx).STRING!=null?((OutputContext)_localctx).STRING.getText():null);
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

	public static class ExpContext extends ParserRuleContext {
		public Token ter;
		public ExpContext prev;
		public TerminalNode EQS() { return getToken(HelloParser.EQS, 0); }
		public TerminalNode OPENXP() { return getToken(HelloParser.OPENXP, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public TerminalNode CLOSEXP() { return getToken(HelloParser.CLOSEXP, 0); }
		public TerminalNode ENDL() { return getToken(HelloParser.ENDL, 0); }
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exp);
		try {
			setState(49);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				((ExpContext)_localctx).ter = match(STRING);
				setState(35);
				match(EQS);
				setState(36);
				match(OPENXP);
				setState(37);
				exp1();
				setState(38);
				match(CLOSEXP);
				setState(39);
				match(ENDL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(STRING);
				setState(42);
				match(EQS);
				setState(43);
				match(OPENXP);
				setState(44);
				exp1();
				setState(45);
				match(CLOSEXP);
				setState(46);
				match(ENDL);
				setState(47);
				((ExpContext)_localctx).prev = exp();
				}
				break;
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

	public static class Exp1Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(HelloParser.ALL, 0); }
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public PselContext psel() {
			return getRuleContext(PselContext.class,0);
		}
		public BraexpContext braexp() {
			return getRuleContext(BraexpContext.class,0);
		}
		public TerminalNode SEP() { return getToken(HelloParser.SEP, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExp1(this);
		}
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_exp1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==STRING) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(54);
			switch (_input.LA(1)) {
			case PSS:
			case PPS:
				{
				setState(52);
				psel();
				}
				break;
			case OPENB:
				{
				setState(53);
				braexp();
				}
				break;
			case ALL:
			case STRING:
			case SEP:
			case CLOSEXP:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(57);
			_la = _input.LA(1);
			if (_la==SEP) {
				{
				setState(56);
				match(SEP);
				}
			}

			setState(60);
			_la = _input.LA(1);
			if (_la==ALL || _la==STRING) {
				{
				setState(59);
				exp1();
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

	public static class BraexpContext extends ParserRuleContext {
		public TerminalNode OPENB() { return getToken(HelloParser.OPENB, 0); }
		public List<TerminalNode> STRING() { return getTokens(HelloParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HelloParser.STRING, i);
		}
		public OpsContext ops() {
			return getRuleContext(OpsContext.class,0);
		}
		public List<TerminalNode> DELIMITER() { return getTokens(HelloParser.DELIMITER); }
		public TerminalNode DELIMITER(int i) {
			return getToken(HelloParser.DELIMITER, i);
		}
		public TerminalNode CLOSEB() { return getToken(HelloParser.CLOSEB, 0); }
		public PselContext psel() {
			return getRuleContext(PselContext.class,0);
		}
		public BraexpContext braexp() {
			return getRuleContext(BraexpContext.class,0);
		}
		public BraexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBraexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBraexp(this);
		}
	}

	public final BraexpContext braexp() throws RecognitionException {
		BraexpContext _localctx = new BraexpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_braexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(OPENB);
			setState(63);
			match(STRING);
			setState(64);
			ops();
			setState(65);
			match(DELIMITER);
			setState(66);
			match(STRING);
			setState(67);
			match(DELIMITER);
			setState(68);
			match(CLOSEB);
			setState(71);
			switch (_input.LA(1)) {
			case PSS:
			case PPS:
				{
				setState(69);
				psel();
				}
				break;
			case OPENB:
				{
				setState(70);
				braexp();
				}
				break;
			case ALL:
			case STRING:
			case SEP:
			case CLOSEXP:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PselContext extends ParserRuleContext {
		public TerminalNode PSS() { return getToken(HelloParser.PSS, 0); }
		public PselContext psel() {
			return getRuleContext(PselContext.class,0);
		}
		public BraexpContext braexp() {
			return getRuleContext(BraexpContext.class,0);
		}
		public TerminalNode PPS() { return getToken(HelloParser.PPS, 0); }
		public TerminalNode OPENP() { return getToken(HelloParser.OPENP, 0); }
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public TerminalNode CLOSEP() { return getToken(HelloParser.CLOSEP, 0); }
		public PselContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_psel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPsel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPsel(this);
		}
	}

	public final PselContext psel() throws RecognitionException {
		PselContext _localctx = new PselContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_psel);
		try {
			setState(86);
			switch (_input.LA(1)) {
			case PSS:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(PSS);
				setState(76);
				switch (_input.LA(1)) {
				case PSS:
				case PPS:
					{
					setState(74);
					psel();
					}
					break;
				case OPENB:
					{
					setState(75);
					braexp();
					}
					break;
				case ALL:
				case STRING:
				case SEP:
				case CLOSEXP:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case PPS:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(PPS);
				setState(79);
				match(OPENP);
				setState(80);
				match(STRING);
				setState(81);
				match(CLOSEP);
				setState(84);
				switch (_input.LA(1)) {
				case PSS:
				case PPS:
					{
					setState(82);
					psel();
					}
					break;
				case OPENB:
					{
					setState(83);
					braexp();
					}
					break;
				case ALL:
				case STRING:
				case SEP:
				case CLOSEXP:
					break;
				default:
					throw new NoViableAltException(this);
				}
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\64\n\6\3\7\3\7\3\7\5\7"+
		"9\n\7\3\7\5\7<\n\7\3\7\5\7?\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bJ\n\b\3\t\3\t\3\t\5\tO\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tW\n\t\5\tY\n\t"+
		"\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4\4\2\4\4\17\17\4\2\t\t\f\f^\2\22\3\2\2"+
		"\2\4\24\3\2\2\2\6\32\3\2\2\2\b\37\3\2\2\2\n\63\3\2\2\2\f\65\3\2\2\2\16"+
		"@\3\2\2\2\20X\3\2\2\2\22\23\t\2\2\2\23\3\3\2\2\2\24\25\5\6\4\2\25\26\5"+
		"\b\5\2\26\27\5\n\6\2\27\30\7\2\2\3\30\31\b\3\1\2\31\5\3\2\2\2\32\33\7"+
		"\n\2\2\33\34\7\f\2\2\34\35\7\r\2\2\35\36\b\4\1\2\36\7\3\2\2\2\37 \7\13"+
		"\2\2 !\7\f\2\2!\"\7\r\2\2\"#\b\5\1\2#\t\3\2\2\2$%\7\f\2\2%&\7\17\2\2&"+
		"\'\7\23\2\2\'(\5\f\7\2()\7\24\2\2)*\7\r\2\2*\64\3\2\2\2+,\7\f\2\2,-\7"+
		"\17\2\2-.\7\23\2\2./\5\f\7\2/\60\7\24\2\2\60\61\7\r\2\2\61\62\5\n\6\2"+
		"\62\64\3\2\2\2\63$\3\2\2\2\63+\3\2\2\2\64\13\3\2\2\2\658\t\3\2\2\669\5"+
		"\20\t\2\679\5\16\b\28\66\3\2\2\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:<\7\20"+
		"\2\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\5\f\7\2>=\3\2\2\2>?\3\2\2\2?\r\3"+
		"\2\2\2@A\7\7\2\2AB\7\f\2\2BC\5\2\2\2CD\7\16\2\2DE\7\f\2\2EF\7\16\2\2F"+
		"I\7\b\2\2GJ\5\20\t\2HJ\5\16\b\2IG\3\2\2\2IH\3\2\2\2IJ\3\2\2\2J\17\3\2"+
		"\2\2KN\7\21\2\2LO\5\20\t\2MO\5\16\b\2NL\3\2\2\2NM\3\2\2\2NO\3\2\2\2OY"+
		"\3\2\2\2PQ\7\22\2\2QR\7\5\2\2RS\7\f\2\2SV\7\6\2\2TW\5\20\t\2UW\5\16\b"+
		"\2VT\3\2\2\2VU\3\2\2\2VW\3\2\2\2WY\3\2\2\2XK\3\2\2\2XP\3\2\2\2Y\21\3\2"+
		"\2\2\n\638;>INVX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}