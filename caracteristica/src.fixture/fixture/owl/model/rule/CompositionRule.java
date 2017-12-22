package fixture.owl.model.rule;


public class CompositionRule extends Rule {
	
	private Antecedent antecedent;
	
	private Antecedent consequent;
	
	
	public CompositionRule() {
		super();
	}

	public CompositionRule(String id, String name) {
		super(id, name);
	}

	public Antecedent getAntecedent() {
		return antecedent;
	}

	public void setAntecedent(Antecedent antecedent) {
		this.antecedent = antecedent;
	}

	public Antecedent getConsequent() {
		return consequent;
	}

	public void setConsequent(Antecedent consequent) {
		this.consequent = consequent;
	}

	
	public boolean isCompositionRule() {
		return true;
	}
	
	
	public boolean isContextRule() {
		return false;
	}

} // RegraDeComposicao
