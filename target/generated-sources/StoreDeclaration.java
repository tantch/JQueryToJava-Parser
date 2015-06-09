import java.util.ArrayList;
import java.util.Map.Entry;

public class StoreDeclaration extends Declaration {

	private Variable outVar;
	private Variable inVarSelector;
	private ArrayList<Selector> selectors;

	public StoreDeclaration(Variable outVar, Variable inVarSelector) {
		super();
		this.outVar = outVar;
		this.inVarSelector = inVarSelector;
		this.selectors = new ArrayList<Selector>();
	}

	/**
	 * @return the outVar
	 */
	public Variable getOutVar() {
		return outVar;
	}

	/**
	 * @return the inVarSelector
	 */
	public Variable getInVarSelector() {
		return inVarSelector;
	}

	/**
	 * @return the selectors
	 */
	public ArrayList<Selector> getSelectors() {
		return selectors;
	}

	@Override
	public String getDesc() {
		String tmp = "StoreDeclaration with " + selectors.size()
				+ " selectors\n";
		for (Selector selector : selectors) {
			tmp += " " + selector.getDesc() + "\n";
		}
		return tmp;
	}

	public void addSelector(Selector sec) {
		selectors.add(sec);
	}

	@Override
	public void processToJava() {

		String str = "";
		String curntVar = inVarSelector.getName();
		String curVarGenType = inVarSelector.getGenericType();
		String currentTypeIns = curVarGenType.toLowerCase();
		if (!Starter.classes.containsKey(curVarGenType)) {
			System.out.println("ERROR: Class " + curVarGenType
					+ " doesn't exist ");
		}
		for (int i = 0; i < selectors.size(); i++) {
			Selector sel = selectors.get(i);
			
			String storeType ;
			System.out.println("LOG: "+ sel.getName());
			storeType = Starter.classes.get(curVarGenType).getAtribClass(sel.getName());
			
			str += "ArrayList<" + storeType + "> temp"+i+" = new ArrayList<"
					+ storeType + ">();\n";
			str += "for(" + curVarGenType + " " + currentTypeIns + " : "
					+ curntVar + "){\n";
			str += "\t temp"+i+".addAll(" + currentTypeIns + "." + sel.getName()
					+ ");\n";
			str += "}\n";
			curntVar = "temp"+i;
			curVarGenType = storeType;
			currentTypeIns = curVarGenType.toLowerCase();
		}

		System.out.println(str);
	}
}
