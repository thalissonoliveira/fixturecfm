package fixture.owl.model.element;

import fixture.owl.model.intefaces.VariationPoint;

public class Variation extends ElementImpl implements VariationPoint {

	
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
	
} // Variacao
