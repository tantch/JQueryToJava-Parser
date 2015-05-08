// Generated from Hello.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#ops}.
	 * @param ctx the parse tree
	 */
	void enterOps(HelloParser.OpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#ops}.
	 * @param ctx the parse tree
	 */
	void exitOps(HelloParser.OpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(HelloParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(HelloParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(HelloParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(HelloParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(HelloParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(HelloParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(HelloParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(HelloParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterExp1(HelloParser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitExp1(HelloParser.Exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#braexp}.
	 * @param ctx the parse tree
	 */
	void enterBraexp(HelloParser.BraexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#braexp}.
	 * @param ctx the parse tree
	 */
	void exitBraexp(HelloParser.BraexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#psel}.
	 * @param ctx the parse tree
	 */
	void enterPsel(HelloParser.PselContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#psel}.
	 * @param ctx the parse tree
	 */
	void exitPsel(HelloParser.PselContext ctx);
}