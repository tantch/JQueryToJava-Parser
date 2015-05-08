import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
public class Starter {

	public static void main(String[] args) throws IOException {
		
		String inputFile = null;
		if(args.length > 0) inputFile = args[0];
		InputStream is = System.in;
		if(inputFile != null) is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		HelloLexer lexer = new HelloLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		HelloParser parser = new HelloParser(tokens);
		ParserRuleContext tree = parser.start(); // parse
		ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
														
		MyListener extractor = new MyListener();
		walker.walk(extractor, tree); // initiate walk of tree with listener
	}

}
