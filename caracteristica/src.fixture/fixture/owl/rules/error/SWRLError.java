package fixture.owl.rules.error;

import fixture.owl.enumeration.RulesConstraintsOWLClassTypeEnum;

public class SWRLError {
	
	private String name;
	
	private String description;
	
	private RulesConstraintsOWLClassTypeEnum rulesConstraintsOWLClassTypeEnum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public RulesConstraintsOWLClassTypeEnum getRulesConstraintsOWLClassTypeEnum() {
		return rulesConstraintsOWLClassTypeEnum;
	}

	public void setRulesConstraintsOWLClassTypeEnum(
			RulesConstraintsOWLClassTypeEnum rulesConstraintsOWLClassTypeEnum) {
		this.rulesConstraintsOWLClassTypeEnum = rulesConstraintsOWLClassTypeEnum;
	}
	
}
