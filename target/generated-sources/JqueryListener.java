// Generated from Jquery.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JqueryParser}.
 */
public interface JqueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JqueryParser#ops}.
	 * @param ctx the parse tree
	 */
	void enterOps(JqueryParser.OpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#ops}.
	 * @param ctx the parse tree
	 */
	void exitOps(JqueryParser.OpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(JqueryParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(JqueryParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(JqueryParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(JqueryParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(JqueryParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(JqueryParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(JqueryParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(JqueryParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(JqueryParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(JqueryParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterExp1(JqueryParser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitExp1(JqueryParser.Exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#braexp}.
	 * @param ctx the parse tree
	 */
	void enterBraexp(JqueryParser.BraexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#braexp}.
	 * @param ctx the parse tree
	 */
	void exitBraexp(JqueryParser.BraexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#psel}.
	 * @param ctx the parse tree
	 */
	void enterPsel(JqueryParser.PselContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#psel}.
	 * @param ctx the parse tree
	 */
	void exitPsel(JqueryParser.PselContext ctx);
}