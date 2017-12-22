package fixture.owl.model.element;

import fixture.owl.model.intefaces.FeaturedElement;

public class GroupedFeature extends Feature implements FeaturedElement {

	public GroupedFeature() {
		super();
	}

	public GroupedFeature(String id, String name) {
		super(id, name);
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
		return true;
	}
	
}
