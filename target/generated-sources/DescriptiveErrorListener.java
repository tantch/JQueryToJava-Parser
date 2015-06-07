import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;


public class DescriptiveErrorListener extends BaseErrorListener {
	private static final boolean REPORT_SYNTAX_ERRORS = true;
    public static DescriptiveErrorListener INSTANCE = new DescriptiveErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e)
    {
        if (!REPORT_SYNTAX_ERRORS) {
            return;
        }
        Starter.SyntaxError();
        String sourceName = recognizer.getInputStream().getSourceName();
        if (!sourceName.isEmpty()) {
            sourceName = String.format("%s:%d:%d: ", "JQUERY", line, charPositionInLine);
        }

        System.err.println(sourceName+" "+msg);
    }
}