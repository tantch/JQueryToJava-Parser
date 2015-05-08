// Generated from Hello.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, OP=2, OPENP=3, CLOSEP=4, OPENB=5, CLOSEB=6, ALL=7, IN=8, OUT=9, 
		STRING=10, ENDL=11, DELIMITER=12, EQS=13, SEP=14, PSS=15, PPS=16, OPENXP=17, 
		CLOSEXP=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NUM", "OP", "OPENP", "CLOSEP", "OPENB", "CLOSEB", "ALL", "IN", "OUT", 
		"STRING", "ENDL", "DELIMITER", "EQS", "SEP", "PSS", "PPS", "OPENXP", "CLOSEXP", 
		"WS"
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\6\2+\n\2\r\2\16\2,\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\6\13P\n\13\r\13\16\13Q\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"p\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0087\n\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\6\24\u0091\n\24\r\24\16\24\u0092\3\24\3\24\2"+
		"\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25\3\2\7\3\2\62;\3\2C|\5\2\62;C\\c|\4\2@@\u0080"+
		"\u0080\5\2\13\f\17\17\"\"\u00a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3*\3\2\2\2"+
		"\5:\3\2\2\2\7<\3\2\2\2\t>\3\2\2\2\13@\3\2\2\2\rB\3\2\2\2\17D\3\2\2\2\21"+
		"F\3\2\2\2\23I\3\2\2\2\25M\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33W\3\2\2\2"+
		"\35Y\3\2\2\2\37o\3\2\2\2!\u0086\3\2\2\2#\u0088\3\2\2\2%\u008c\3\2\2\2"+
		"\'\u0090\3\2\2\2)+\t\2\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\4"+
		"\3\2\2\2./\7~\2\2/;\7?\2\2\60\61\7,\2\2\61;\7?\2\2\62\63\7\u0080\2\2\63"+
		";\7?\2\2\64\65\7&\2\2\65;\7?\2\2\66\67\7#\2\2\67;\7?\2\289\7`\2\29;\7"+
		"?\2\2:.\3\2\2\2:\60\3\2\2\2:\62\3\2\2\2:\64\3\2\2\2:\66\3\2\2\2:8\3\2"+
		"\2\2;\6\3\2\2\2<=\7*\2\2=\b\3\2\2\2>?\7+\2\2?\n\3\2\2\2@A\7]\2\2A\f\3"+
		"\2\2\2BC\7_\2\2C\16\3\2\2\2DE\7,\2\2E\20\3\2\2\2FG\7k\2\2GH\7p\2\2H\22"+
		"\3\2\2\2IJ\7q\2\2JK\7w\2\2KL\7v\2\2L\24\3\2\2\2MO\t\3\2\2NP\t\4\2\2ON"+
		"\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\26\3\2\2\2ST\7=\2\2T\30\3\2\2"+
		"\2UV\7)\2\2V\32\3\2\2\2WX\7?\2\2X\34\3\2\2\2YZ\t\5\2\2Z\36\3\2\2\2[\\"+
		"\7<\2\2\\]\7g\2\2]^\7x\2\2^_\7g\2\2_p\7p\2\2`a\7<\2\2ab\7h\2\2bc\7k\2"+
		"\2cd\7t\2\2de\7u\2\2ep\7v\2\2fg\7<\2\2gh\7q\2\2hi\7f\2\2ip\7f\2\2jk\7"+
		"<\2\2kl\7n\2\2lm\7c\2\2mn\7u\2\2np\7v\2\2o[\3\2\2\2o`\3\2\2\2of\3\2\2"+
		"\2oj\3\2\2\2p \3\2\2\2qr\7<\2\2rs\7p\2\2st\7q\2\2t\u0087\7v\2\2uv\7<\2"+
		"\2vw\7e\2\2wx\7q\2\2xy\7p\2\2yz\7v\2\2z{\7c\2\2{|\7k\2\2|}\7p\2\2}\u0087"+
		"\7u\2\2~\177\7g\2\2\177\u0087\7s\2\2\u0080\u0081\7<\2\2\u0081\u0082\7"+
		"n\2\2\u0082\u0087\7v\2\2\u0083\u0084\7<\2\2\u0084\u0085\7i\2\2\u0085\u0087"+
		"\7v\2\2\u0086q\3\2\2\2\u0086u\3\2\2\2\u0086~\3\2\2\2\u0086\u0080\3\2\2"+
		"\2\u0086\u0083\3\2\2\2\u0087\"\3\2\2\2\u0088\u0089\7&\2\2\u0089\u008a"+
		"\7*\2\2\u008a\u008b\7$\2\2\u008b$\3\2\2\2\u008c\u008d\7$\2\2\u008d\u008e"+
		"\7+\2\2\u008e&\3\2\2\2\u008f\u0091\t\6\2\2\u0090\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\b\24\2\2\u0095(\3\2\2\2\t\2,:Qo\u0086\u0092\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}