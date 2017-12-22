package fixture.owl.model.element;


public class ContextInfo extends ElementImpl {
	
	private ContextEntity fatherContextEntity;
	
	public ContextInfo() {
		super();
	}

	public ContextInfo(String id, String name) {
		super(id, name);
	}
	
	public ContextEntity getFatherContextEntity() {
		return fatherContextEntity;
	}

	public void setFatherContextEntity(ContextEntity fatherContextEntity) {
		this.fatherContextEntity = fatherContextEntity;
	}

	
	public boolean isMandatoryFeature() {
		return false;
	}

	
	public boolean isOptionalFeature() {
		return false;
	}

	
	public boolean isVariatioTwoFeature() {
		return false;
	}

	
	public boolean isRootFeature() {
		return false;
	}

	
	public boolean isAttribute() {
		return false;
	}
	
	
	public boolean isContextRoot() {
		return false;
	}
	
	
	public boolean isGroupedFeature() {
		return false;
	}
	
} // InformacaodeContexto
