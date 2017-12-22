package fixture.owl.model.externalelement;

import fixture.owl.model.intefaces.ExternalElement;

public abstract class ExternalElementImpl implements ExternalElement {
	
	private String name;
	
	private String id;
	
	public ExternalElementImpl() {}
	
	public ExternalElementImpl(String id, String name) {
		this.id = id;
		this.name = name;
	}


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
	
} // Elemento
