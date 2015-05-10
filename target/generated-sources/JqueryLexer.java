// Generated from Jquery.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JqueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, OP=2, OPENP=3, CLOSEP=4, OPENB=5, CLOSEB=6, IN=7, OUT=8, STRING=9, 
		ENDL=10, DELIMITER=11, EQS=12, SEP=13, PSS=14, PPS=15, OPENXP=16, CLOSEXP=17, 
		WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NUM", "OP", "OPENP", "CLOSEP", "OPENB", "CLOSEB", "IN", "OUT", "STRING", 
		"ENDL", "DELIMITER", "EQS", "SEP", "PSS", "PPS", "OPENXP", "CLOSEXP", 
		"WS"
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


	public JqueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Jquery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\6\2)\n\2\r\2\16\2*\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\6\nL\n\n\r\n\16\nM\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17l\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0084\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\6\23\u008e\n\23\r\23\16\23\u008f\3\23\3\23\2\2\24\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\3\2\7\3\2\62;\3\2C|\5\2\62;C\\c|\4\2@@\u0080\u0080\5\2\13\f\17\17"+
		"\"\"\u00a1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\3(\3\2\2\2\58\3\2\2\2\7:\3\2\2\2\t<\3\2\2\2\13"+
		">\3\2\2\2\r@\3\2\2\2\17B\3\2\2\2\21E\3\2\2\2\23I\3\2\2\2\25O\3\2\2\2\27"+
		"Q\3\2\2\2\31S\3\2\2\2\33U\3\2\2\2\35k\3\2\2\2\37\u0083\3\2\2\2!\u0085"+
		"\3\2\2\2#\u0089\3\2\2\2%\u008d\3\2\2\2\')\t\2\2\2(\'\3\2\2\2)*\3\2\2\2"+
		"*(\3\2\2\2*+\3\2\2\2+\4\3\2\2\2,-\7~\2\2-9\7?\2\2./\7,\2\2/9\7?\2\2\60"+
		"\61\7\u0080\2\2\619\7?\2\2\62\63\7&\2\2\639\7?\2\2\64\65\7#\2\2\659\7"+
		"?\2\2\66\67\7`\2\2\679\7?\2\28,\3\2\2\28.\3\2\2\28\60\3\2\2\28\62\3\2"+
		"\2\28\64\3\2\2\28\66\3\2\2\29\6\3\2\2\2:;\7*\2\2;\b\3\2\2\2<=\7+\2\2="+
		"\n\3\2\2\2>?\7]\2\2?\f\3\2\2\2@A\7_\2\2A\16\3\2\2\2BC\7k\2\2CD\7p\2\2"+
		"D\20\3\2\2\2EF\7q\2\2FG\7w\2\2GH\7v\2\2H\22\3\2\2\2IK\t\3\2\2JL\t\4\2"+
		"\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\24\3\2\2\2OP\7=\2\2P\26\3"+
		"\2\2\2QR\7)\2\2R\30\3\2\2\2ST\7?\2\2T\32\3\2\2\2UV\t\5\2\2V\34\3\2\2\2"+
		"WX\7<\2\2XY\7g\2\2YZ\7x\2\2Z[\7g\2\2[l\7p\2\2\\]\7<\2\2]^\7h\2\2^_\7k"+
		"\2\2_`\7t\2\2`a\7u\2\2al\7v\2\2bc\7<\2\2cd\7q\2\2de\7f\2\2el\7f\2\2fg"+
		"\7<\2\2gh\7n\2\2hi\7c\2\2ij\7u\2\2jl\7v\2\2kW\3\2\2\2k\\\3\2\2\2kb\3\2"+
		"\2\2kf\3\2\2\2l\36\3\2\2\2mn\7<\2\2no\7p\2\2op\7q\2\2p\u0084\7v\2\2qr"+
		"\7<\2\2rs\7e\2\2st\7q\2\2tu\7p\2\2uv\7v\2\2vw\7c\2\2wx\7k\2\2xy\7p\2\2"+
		"y\u0084\7u\2\2z{\7<\2\2{|\7g\2\2|\u0084\7s\2\2}~\7<\2\2~\177\7n\2\2\177"+
		"\u0084\7v\2\2\u0080\u0081\7<\2\2\u0081\u0082\7i\2\2\u0082\u0084\7v\2\2"+
		"\u0083m\3\2\2\2\u0083q\3\2\2\2\u0083z\3\2\2\2\u0083}\3\2\2\2\u0083\u0080"+
		"\3\2\2\2\u0084 \3\2\2\2\u0085\u0086\7&\2\2\u0086\u0087\7*\2\2\u0087\u0088"+
		"\7$\2\2\u0088\"\3\2\2\2\u0089\u008a\7$\2\2\u008a\u008b\7+\2\2\u008b$\3"+
		"\2\2\2\u008c\u008e\t\6\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\23"+
		"\2\2\u0092&\3\2\2\2\t\2*8Mk\u0083\u008f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}