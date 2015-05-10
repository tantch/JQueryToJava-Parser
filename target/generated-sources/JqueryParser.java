// Generated from Jquery.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JqueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, OP=2, OPENP=3, CLOSEP=4, OPENB=5, CLOSEB=6, IN=7, OUT=8, STRING=9, 
		ENDL=10, DELIMITER=11, EQS=12, SEP=13, PSS=14, PPS=15, OPENXP=16, CLOSEXP=17, 
		WS=18;
	public static final int
		RULE_ops = 0, RULE_start = 1, RULE_input = 2, RULE_output = 3, RULE_line = 4, 
		RULE_exp = 5, RULE_exp1 = 6, RULE_braexp = 7, RULE_psel = 8;
	public static final String[] ruleNames = {
		"ops", "start", "input", "output", "line", "exp", "exp1", "braexp", "psel"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "'['", "']'", "'in'", "'out'", null, "';'", 
		"'''", "'='", null, null, null, "'$(\"'", "'\")'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUM", "OP", "OPENP", "CLOSEP", "OPENB", "CLOSEB", "IN", "OUT", 
		"STRING", "ENDL", "DELIMITER", "EQS", "SEP", "PSS", "PPS", "OPENXP", "CLOSEXP", 
		"WS"
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
	public String getGrammarFileName() { return "Jquery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JqueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OpsContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(JqueryParser.OP, 0); }
		public TerminalNode EQS() { return getToken(JqueryParser.EQS, 0); }
		public OpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).enterOps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).exitOps(this);
		}
	}

	public final OpsContext ops() throws RecognitionException {
		OpsContext _localctx = new OpsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
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
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JqueryParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			line();
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
		public TerminalNode IN() { return getToken(JqueryParser.IN, 0); }
		public TerminalNode STRING() { return getToken(JqueryParser.STRING, 0); }
		public TerminalNode ENDL() { return getToken(JqueryParser.ENDL, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(IN);
			setState(24);
			match(STRING);
			setState(25);
			match(ENDL);
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
		public TerminalNode OUT() { return getToken(JqueryParser.OUT, 0); }
		public TerminalNode STRING() { return getToken(JqueryParser.STRING, 0); }
		public TerminalNode ENDL() { return getToken(JqueryParser.ENDL, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(OUT);
			setState(28);
			match(STRING);
			setState(29);
			match(ENDL);
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

	public static class LineContext extends ParserRuleContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_line);
		int _la;
		try {
			setState(43);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				input();
				setState(33);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << STRING))) != 0)) {
					{
					setState(32);
					line();
					}
				}

				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				output();
				setState(37);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << STRING))) != 0)) {
					{
					setState(36);
					line();
					}
				}

				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				exp();
				setState(41);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << STRING))) != 0)) {
					{
					setState(40);
					line();
					}
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

	public static class ExpContext extends ParserRuleContext {
		public Token ter;
		public TerminalNode EQS() { return getToken(JqueryParser.EQS, 0); }
		public TerminalNode OPENXP() { return getToken(JqueryParser.OPENXP, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public TerminalNode CLOSEXP() { return getToken(JqueryParser.CLOSEXP, 0); }
		public TerminalNode ENDL() { return getToken(JqueryParser.ENDL, 0); }
		public TerminalNode STRING() { return getToken(JqueryParser.STRING, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((ExpContext)_localctx).ter = match(STRING);
			setState(46);
			match(EQS);
			setState(47);
			match(OPENXP);
			setState(48);
			exp1();
			setState(49);
			match(CLOSEXP);
			setState(50);
			match(ENDL);
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
		public String v;
		public Token ter;
		public TerminalNode STRING() { return getToken(JqueryParser.STRING, 0); }
		public PselContext psel() {
			return getRuleContext(PselContext.class,0);
		}
		public BraexpContext braexp() {
			return getRuleContext(BraexpContext.class,0);
		}
		public TerminalNode SEP() { return getToken(JqueryParser.SEP, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).enterExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).exitExp1(this);
		}
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_exp1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((Exp1Context)_localctx).ter = match(STRING);
			setState(55);
			switch (_input.LA(1)) {
			case PSS:
			case PPS:
				{
				setState(53);
				psel();
				}
				break;
			case OPENB:
				{
				setState(54);
				braexp();
				}
				break;
			case STRING:
			case SEP:
			case CLOSEXP:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(58);
			_la = _input.LA(1);
			if (_la==SEP) {
				{
				setState(57);
				match(SEP);
				}
			}

			setState(61);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(60);
				exp1();
				}
			}

			((Exp1Context)_localctx).v = (((Exp1Context)_localctx).ter!=null?((Exp1Context)_localctx).ter.getText():null);
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
		public TerminalNode OPENB() { return getToken(JqueryParser.OPENB, 0); }
		public List<TerminalNode> STRING() { return getTokens(JqueryParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JqueryParser.STRING, i);
		}
		public OpsContext ops() {
			return getRuleContext(OpsContext.class,0);
		}
		public List<TerminalNode> DELIMITER() { return getTokens(JqueryParser.DELIMITER); }
		public TerminalNode DELIMITER(int i) {
			return getToken(JqueryParser.DELIMITER, i);
		}
		public TerminalNode CLOSEB() { return getToken(JqueryParser.CLOSEB, 0); }
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
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).enterBraexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).exitBraexp(this);
		}
	}

	public final BraexpContext braexp() throws RecognitionException {
		BraexpContext _localctx = new BraexpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_braexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(OPENB);
			setState(66);
			match(STRING);
			setState(67);
			ops();
			setState(68);
			match(DELIMITER);
			setState(69);
			match(STRING);
			setState(70);
			match(DELIMITER);
			setState(71);
			match(CLOSEB);
			setState(74);
			switch (_input.LA(1)) {
			case PSS:
			case PPS:
				{
				setState(72);
				psel();
				}
				break;
			case OPENB:
				{
				setState(73);
				braexp();
				}
				break;
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
		public TerminalNode PSS() { return getToken(JqueryParser.PSS, 0); }
		public PselContext psel() {
			return getRuleContext(PselContext.class,0);
		}
		public BraexpContext braexp() {
			return getRuleContext(BraexpContext.class,0);
		}
		public TerminalNode PPS() { return getToken(JqueryParser.PPS, 0); }
		public TerminalNode OPENP() { return getToken(JqueryParser.OPENP, 0); }
		public TerminalNode STRING() { return getToken(JqueryParser.STRING, 0); }
		public TerminalNode CLOSEP() { return getToken(JqueryParser.CLOSEP, 0); }
		public PselContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_psel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).enterPsel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryListener ) ((JqueryListener)listener).exitPsel(this);
		}
	}

	public final PselContext psel() throws RecognitionException {
		PselContext _localctx = new PselContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_psel);
		try {
			setState(89);
			switch (_input.LA(1)) {
			case PSS:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(PSS);
				setState(79);
				switch (_input.LA(1)) {
				case PSS:
				case PPS:
					{
					setState(77);
					psel();
					}
					break;
				case OPENB:
					{
					setState(78);
					braexp();
					}
					break;
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
				setState(81);
				match(PPS);
				setState(82);
				match(OPENP);
				setState(83);
				match(STRING);
				setState(84);
				match(CLOSEP);
				setState(87);
				switch (_input.LA(1)) {
				case PSS:
				case PPS:
					{
					setState(85);
					psel();
					}
					break;
				case OPENB:
					{
					setState(86);
					braexp();
					}
					break;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24^\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6$\n\6\3\6\3\6\5\6"+
		"(\n\6\3\6\3\6\5\6,\n\6\5\6.\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\5\b:\n\b\3\b\5\b=\n\b\3\b\5\b@\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\tM\n\t\3\n\3\n\3\n\5\nR\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"Z\n\n\5\n\\\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\4\2\4\4\16\16d\2\24"+
		"\3\2\2\2\4\26\3\2\2\2\6\31\3\2\2\2\b\35\3\2\2\2\n-\3\2\2\2\f/\3\2\2\2"+
		"\16\66\3\2\2\2\20C\3\2\2\2\22[\3\2\2\2\24\25\t\2\2\2\25\3\3\2\2\2\26\27"+
		"\5\n\6\2\27\30\7\2\2\3\30\5\3\2\2\2\31\32\7\t\2\2\32\33\7\13\2\2\33\34"+
		"\7\f\2\2\34\7\3\2\2\2\35\36\7\n\2\2\36\37\7\13\2\2\37 \7\f\2\2 \t\3\2"+
		"\2\2!#\5\6\4\2\"$\5\n\6\2#\"\3\2\2\2#$\3\2\2\2$.\3\2\2\2%\'\5\b\5\2&("+
		"\5\n\6\2\'&\3\2\2\2\'(\3\2\2\2(.\3\2\2\2)+\5\f\7\2*,\5\n\6\2+*\3\2\2\2"+
		"+,\3\2\2\2,.\3\2\2\2-!\3\2\2\2-%\3\2\2\2-)\3\2\2\2.\13\3\2\2\2/\60\7\13"+
		"\2\2\60\61\7\16\2\2\61\62\7\22\2\2\62\63\5\16\b\2\63\64\7\23\2\2\64\65"+
		"\7\f\2\2\65\r\3\2\2\2\669\7\13\2\2\67:\5\22\n\28:\5\20\t\29\67\3\2\2\2"+
		"98\3\2\2\29:\3\2\2\2:<\3\2\2\2;=\7\17\2\2<;\3\2\2\2<=\3\2\2\2=?\3\2\2"+
		"\2>@\5\16\b\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\b\b\1\2B\17\3\2\2\2CD\7"+
		"\7\2\2DE\7\13\2\2EF\5\2\2\2FG\7\r\2\2GH\7\13\2\2HI\7\r\2\2IL\7\b\2\2J"+
		"M\5\22\n\2KM\5\20\t\2LJ\3\2\2\2LK\3\2\2\2LM\3\2\2\2M\21\3\2\2\2NQ\7\20"+
		"\2\2OR\5\22\n\2PR\5\20\t\2QO\3\2\2\2QP\3\2\2\2QR\3\2\2\2R\\\3\2\2\2ST"+
		"\7\21\2\2TU\7\5\2\2UV\7\13\2\2VY\7\6\2\2WZ\5\22\n\2XZ\5\20\t\2YW\3\2\2"+
		"\2YX\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[N\3\2\2\2[S\3\2\2\2\\\23\3\2\2\2\r#"+
		"\'+-9<?LQY[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}