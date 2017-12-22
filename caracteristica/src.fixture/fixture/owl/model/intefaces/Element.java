package fixture.owl.model.intefaces;

public interface Element extends Nameable {
	
	boolean isMandatoryFeature();
	boolean isOptionalFeature();
	boolean isVariatioTwoFeature();
	boolean isRootFeature();
	boolean isGroupedFeature();
	boolean isAttribute();
	boolean isContextRoot();

}
