import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

public class Starter{
	

	static TreeViewer viewr;
	private static boolean syntaxErrors=false;
	public static void main(String[] args) throws IOException {

		String inputFile = null;
		if (args.length > 0) {
			inputFile = args[0];
			System.out.println(inputFile);
		}
		InputStream is = System.in;
		if (inputFile != null)
			is = new FileInputStream(inputFile);
		else {
			System.out.println("error in file");
			return;
		}
		ANTLRInputStream input = new ANTLRInputStream(is);
		JavaLexer lexer = new JavaLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		JavaParser parser = new JavaParser(tokens);
		lexer.removeErrorListeners();
		lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);
		parser.removeErrorListeners();
		parser.addErrorListener(DescriptiveErrorListener.INSTANCE);
		ParserRuleContext tree = parser.compilationUnit(); // parse
		if(syntaxErrors){
		System.out.println("There are syntax errors, but continuing with semantic analises");
		}
	
		viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()),
				tree);
		viewr.setScale(1.5);// scale a little
		
		PanAndZoom pan = new PanAndZoom(viewr);
		
		// System.out.println(tree.toStringTree(parser)); // print LISP-style
		// tree
		ParseTreeWalker walker = new ParseTreeWalker(); // create standard
														// walker

		MyListener extractor = new MyListener();
		
		
		walker.walk(extractor, tree); // initiate walk of tree with listener

	}
	public static void SyntaxError() {
		syntaxErrors=true;
	}


}
