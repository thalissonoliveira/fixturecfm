package fixture.owl.model.element;

import fixture.owl.model.enumeration.MaximalCardinality;
import fixture.owl.model.intefaces.FeaturedElement;

public class VariationTwo extends Feature implements FeaturedElement {
	
	private MaximalCardinality maximalCardinality;
	private Integer orMininalCardinality;
	private Integer orMaximalCardinality;
	

	public VariationTwo() {
		super();
	}

	public VariationTwo(String id, String name) {
		super(id, name);
	}
	
	public VariationTwo(String id, String name, Integer maximalCardinality, Integer minimalCardinalityOr, Integer maximalCardinalityOr) {
		super(id, name);
		setMaximalCardinality(maximalCardinality);
		setOrMininalCardinality(minimalCardinalityOr);
		setOrMaximalCardinality(maximalCardinalityOr);
	}
	
	public MaximalCardinality getMaximalCardinality() {
		return maximalCardinality;
	}

	public void setMaximalCardinality(MaximalCardinality maximalCardinality) {
		this.maximalCardinality = maximalCardinality;
	}
	
	public void setMaximalCardinality(int maximalCardinalityInteger) {
		MaximalCardinality maximalCardinality = MaximalCardinality.get(maximalCardinalityInteger);
		
		if (maximalCardinality != null) {
			this.maximalCardinality = maximalCardinality;
		} else {
			throw new RuntimeException("Cardinality can't be set.");
		}
	}

	public Integer getOrMininalCardinality() {
		return orMininalCardinality;
	}

	public void setOrMininalCardinality(Integer orMininalCardinality) {
		this.orMininalCardinality = orMininalCardinality;
	}

	public Integer getOrMaximalCardinality() {
		return orMaximalCardinality;
	}

	public void setOrMaximalCardinality(Integer orMaximalCardinality) {
		this.orMaximalCardinality = orMaximalCardinality;
	}

	
	public boolean isMandatoryFeature() {
		return false;
	}

	
	public boolean isOptionalFeature() {
		return false;
	}

	
	public boolean isVariatioTwoFeature() {
		return true;
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
	
} // VariacaoDois
