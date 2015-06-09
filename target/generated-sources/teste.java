
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionMode;

import java.io.File;
import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Book{

	private ArrayList<Author> authors;
	private int isbn;
	private int year;
	
	public ArrayList<String> getAuthor(){
		return authors;
	}
	public int getIsbn(){
		return isbn;
	}
	public int getYear(){
		return year;
	}
	

}
public class Author{
	private String name;
}
public class Test {
//	public static long lexerTime = 0;
	public static boolean profile = false;
	public static boolean notree = false;
	public static boolean gui = false;
	public static boolean printTree = false;
	public static boolean SLL = false;
	public static ArrayList<Integer> filPub;
	
	public static Worker[] workers = new Worker[3];
	static int windex = 0;

	public static CyclicBarrier barrier;

	public static volatile boolean firstPassDone = false;
	
	

	public static void main(String[] args,String nome,ArrayList<Book> libPub) {
	
		ArrayList<Book> lib = agrs[0];
		ArrayList<Author> fil = new ArrayList<Author>();	
		ArrayList<String> aut;
		String autor;
		try{
	if(lib.size() <1){
		System.out.println("An empty arraylist cannot be used as an in var");
		return;
	}
}catch (NullPointerException e) {
	System.out.println("ERROR : ArrayList<> lib is null ");
	System.exit(-1);
}

aut = new ArrayList<String>();

try{
	if(fil.size() <1){
		System.out.println("An empty arraylist cannot be used as an in var");
		return;
	}
}catch (NullPointerException e) {
	System.out.println("ERROR : ArrayList<> fil is null ");
	System.exit(-1);
}
try{
	if(libPub.size() <1){
		System.out.println("An empty arraylist cannot be used as an in var");
		return;
	}
}catch (NullPointerException e) {
	System.out.println("ERROR : ArrayList<> libPub is null ");
	System.exit(-1);
}
filPub = new ArrayList<Integer>();


	}
}