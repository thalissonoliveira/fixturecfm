package fixture.owl.model.element;


public class MandatoryFeature extends Feature {

	public MandatoryFeature() {
		super();
	}
	
	public MandatoryFeature(String id, String name) {
		super(id, name);
	}

	
	public boolean isMandatoryFeature() {
		return true;
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
	
	
} // CaracteristicaMandatoria
