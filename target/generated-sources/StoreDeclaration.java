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

			String storeType = "Object";
			boolean isArray = true;

			try {

				storeType = Starter.classes.get(curVarGenType).getAtribClass(
						sel.getName());
				isArray = Starter.classes.get(curVarGenType).getIsArray(
						sel.getName());

			} catch (NullPointerException e) {
				System.out.println("ERROR: class " + curVarGenType
						+ " for selector " + sel.getName()
						+ " was not declared, or the atribute does not exist");
			}
			str += "ArrayList<" + MyUtils.getClassName(storeType) + "> temp" + Starter.count
					+ " = new ArrayList<" + MyUtils.getClassName(storeType) + ">();\n";
			str += "for(" + curVarGenType + " " + currentTypeIns + " : "
					+ curntVar + "){\n";
			if (!isArray) {
				str += "\t temp" + Starter.count + ".add(" + currentTypeIns
						+ "." + sel.getName() + ");\n";
			} else {
				str += "\t temp" + Starter.count + ".addAll(" + currentTypeIns
						+ "." + sel.getName() + ");\n";
			}

			str += "}\n";

			
		
			ArrayList<SelectorCondition> selC = sel.getConds();
			if (isArray && selC.size()>0) {
			str += "for(Iterator<" + storeType + "> it= temp"+Starter.count+".iterator();it.hasNext();){\n";
			str+= "\t"+storeType+" obj = it.next();\n";	
			str+= "\tint i = 0;\n";
			for(int j = 0; j < sel.getConds().size(); j++){
					SelectorCondition sel1 = sel.getConds().get(j);
					String desc = sel1.getDesc();
					if(desc.equals("Brackets")){
						BrackCondition brack = (BrackCondition) sel1;
						switch(brack.getOp()){
						case "=":
							str += "if( obj." + brack.getAtrib() + " != \"" + brack.getVal() + "\" ){\n";
							str += "\tit.remove();\n";
							str += "\tcontinue;\n";
							str += "}\n";
							break;
						case "*=":
							str += "if( !obj." + brack.getAtrib() + ".contains(\"" + brack.getVal() + "\")){\n";
							str += "\tit.remove();\n";
							str += "\tcontinue;\n";
							str += "}\n";
							break;
						case "$=":
							str += "if( !obj." + brack.getAtrib() + ".endsWith(\"" + brack.getVal() + "\")){\n";
							str += "\tit.remove();\n";
							str += "\tcontinue;\n";
							str += "}\n";
							break;
						case "!=":
							str += "if( obj." + brack.getAtrib() + " == \"" + brack.getVal() + "\" ){\n";
							str += "\tit.remove();\n";
							str += "\tcontinue;\n";
							str += "}\n";
							break;
						case "^=":
							str += "if( !obj." + brack.getAtrib() + ".startsWith(\"" + brack.getVal() + "\")){\n";
							str += "\tit.remove();\n";
							str += "\tcontinue;\n";
							str += "}\n";
							break;
						}
					}
					else if(desc.equals("Function")){
						FunctionCondition func = (FunctionCondition) sel1;
						switch(func.getName()){
							case ":even":
								str += "if(i%2 != 0){\n";
								str += "\tit.remove();\n";
								str += "\tcontinue;\n";
								str += "}\n";
								break;
							case ":first":
								str += "if(i != 0){\n";
								str += "\tit.remove();\n";
								str += "\tcontinue;\n";
								str += "}\n";
								break;
							case ":odd":
								str += "if(i%2 == 0){\n";
								str += "\tit.remove();\n";
								str += "\tcontinue;\n";
								str += "}\n";
								break;
							case ":last":
								str += "if(it.hasNext()){\n";
								str += "\tit.remove();\n";
								str += "\tcontinue;\n";
								str += "}\n";
								break;
								/*
							case ":not":
								str += "if(obj == "+ func.getArg() +"){\n";
								str += "\tit.remove();\n";
								str += "\tcontinue;\n";
								str += "}\n";
								break;*/
							case ":contains":
								str += "if( !obj" + ".contains(" + func.getArg() + ")){\n";
								str += "\tit.remove();\n";
								str += "\tcontinue;\n";
								str += "}\n";
								break;
							case ":eq":
								str += "if(i != "+ func.getArg() +"){\n";
								str += "\tit.remove();\n";
								str += "\tcontinue;\n";
								str += "}\n";
								break;
							case ":lt":
								str += "if("+func.getArg()+ " >= i){\n";
								str += "\tit.remove();\n";
								str += "\tcontinue;\n";
								str += "}\n";
								break;
							case ":gt":
								str += "if("+func.getArg()+" =< i){\n";
								str += "\tit.remove();\n";
								str += "\tcontinue;\n";
								str += "}\n";
								break;
						}
					}
				}
			str += "\ti++;\n}\n";
			}
			curntVar = "temp" + Starter.count;
			curVarGenType = storeType;
			currentTypeIns = curVarGenType.toLowerCase();
			Starter.count++;
		}
		String outClass = outVar.getGenericType();
		// System.out.println("LOG: outClass = " + outClass + " of name " +
		// outVar.getName());
		// System.out.println("LOG: curVarGenType = " + curVarGenType);
		if (outClass.equals(curVarGenType)
				|| outClass.equals(MyUtils.getClassName(curVarGenType))) {
			str += outVar.getName() + " = temp" + (Starter.count - 1) + "; \n";
		} else {
			System.out
					.println("ERROR: outputvar ins't the same type as expected final output from selections");
		}
		javaCode=str;
		//System.out.println(str);
	}
}
