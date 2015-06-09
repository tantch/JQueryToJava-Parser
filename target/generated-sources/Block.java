import java.util.ArrayList;

public class Block {
	private int startLine;
	private int finishLine;
	private ArrayList<Declaration> declarations;

	public Block(int st, int fn) {
		this.startLine = st;
		this.finishLine = fn;
		declarations = new ArrayList<Declaration>();
	}

	public void addDeclaration(Declaration dec) {
		declarations.add(dec);
	}

	/**
	 * @return the startLine
	 */
	public int getStartLine() {
		return startLine;
	}

	/**
	 * @return the finishLine
	 */
	public int getFinishLine() {
		return finishLine;
	}

	/**
	 * @return the declarations
	 */
	public ArrayList<Declaration> getDeclarations() {
		return declarations;
	}

	public void print() {
		System.out.println("Block starting at line: " + startLine
				+ "and ending at " + finishLine + " : ");
		for (Declaration declaration : declarations) {
			System.out.println(declaration.getDesc());
		}
	}

	public void processToJava() {
		for (Declaration declaration : declarations) {
			declaration.processToJava();
		}
		
	}

}
