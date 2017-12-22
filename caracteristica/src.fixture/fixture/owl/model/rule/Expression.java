package fixture.owl.model.rule;

import fixture.owl.model.intefaces.Nameable;


public class Expression implements Nameable {
	
	private String id;
	
	private String name;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
} // Expressao
