package fixture.owl.swrl.parser;

import java.util.ArrayList;
import java.util.List;

public class SWRLRuleString {
	
	private String rule;
	private List<AtomString> antecedentAtoms;
	private List<AtomString> consequentAtoms;
	
	public static class StringCardinality {
		
		private String atomType;
		private String cardinality;
		private String value;
		
		
		public String getAtomType() {
			return atomType;
		}
		public void setAtomType(String atomType) {
			this.atomType = atomType;
		}
		public String getCardinality() {
			return cardinality;
		}
		public void setCardinality(String cardinality) {
			this.cardinality = cardinality;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	public static class AtomString {
		private String atomType;
		private String[] variables;
		private StringCardinality stringCardinality;
		
		public String getAtomType() {
			return atomType;
		}
		public void setAtomType(String atomType) {
			this.atomType = atomType;
		}
		public String[] getVariables() {
			return variables;
		}
		public void setVariables(String[] variables) {
			this.variables = variables;
		}
		public StringCardinality getStringCardinality() {
			return stringCardinality;
		}
		public void setStringCardinality(StringCardinality stringCardinality) {
			this.stringCardinality = stringCardinality;
		}
				
	}
	
	public SWRLRuleString(String rule) {
		this.rule = rule;
		antecedentAtoms = new ArrayList<AtomString>();
		consequentAtoms = new ArrayList<AtomString>();
		processParts(rule);
	}
	
	private void processParts(String rule) {
//		String ruleTrim = rule.replace(" ", "");
//		ruleTrim = ruleTrim.replace("\n", "");
		
		String[] parts = rule.split("->");
		
		String[] antecedent = parts[0].split("\\^");
		String[] consequent = parts[1].split("\\^");
		
		for (String atom : antecedent) {
			processAtom(atom, antecedentAtoms);
		}
		for (String atom : consequent) {
			processAtom(atom, consequentAtoms);
		}
	}
	
	private void processAtom(String atom, List<AtomString> atoms) {
		
		atom = atom.trim();  
		boolean isSingleAtom = isSingleAtom(atom);
		
		if (isSingleAtom) {
			int openPerentesisIndex = atom.indexOf("(");
			int closePerentesisIndex = atom.indexOf(")");
			String atomType = atom.substring(0, openPerentesisIndex);
			
			atomType = atomType.replace(" ", "");
			atomType = atomType.replace("\n", "");
			
			String[] variables = atom.substring(openPerentesisIndex+1, closePerentesisIndex).split(",");
			
			AtomString atomString = new AtomString();
			atomString.setAtomType(atomType);
			atomString.setVariables(variables);
			atoms.add(atomString);
		} else {
			String atomPieces[] = atom.split(" ");
			boolean isValidLength = atomPieces.length == 4;
			boolean isText = atomPieces[0].matches("[\\w]*");
			boolean isMaxMin = atomPieces[1].matches("max|min");
			boolean isNumber = atomPieces[2].matches("[\\d]*");
			boolean singleAtom = isSingleAtom(atomPieces[3]);
			
			boolean isValidCardinality = !isValidLength ? false : isText && isMaxMin && isNumber && singleAtom;
			
			if (isValidCardinality) {
				atom = atomPieces[3];
				
				int openPerentesisIndex = atom.indexOf("(");
				int closePerentesisIndex = atom.indexOf(")");
				String atomType = atom.substring(0, openPerentesisIndex);
				
				atomType = atomType.replace(" ", "");
				atomType = atomType.replace("\n", "");
				
				String[] variables = atom.substring(openPerentesisIndex+1, closePerentesisIndex).split(",");
				
				AtomString atomString = new AtomString();
				atomString.setAtomType(atomType);
				atomString.setVariables(variables);
				
				StringCardinality stringCardinality = new StringCardinality();
				stringCardinality.setAtomType(atomPieces[0]);
				stringCardinality.setCardinality(atomPieces[1]);
				stringCardinality.setValue(atomPieces[2]);
				
				atomString.setStringCardinality(stringCardinality);
				
				atoms.add(atomString);
			} else {
				throw new RuntimeException("What?");
			}
		}
		
	}


	private boolean isSingleAtom(String atom) {
		return atom.split(" ").length == 1;
	}


	public String getRule() {
		return rule;
	}


	public List<AtomString> getAntecedentAtoms() {
		return antecedentAtoms;
	}


	public List<AtomString> getConsequentAtoms() {
		return consequentAtoms;
	}
	
}
