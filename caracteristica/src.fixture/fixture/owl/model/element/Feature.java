package fixture.owl.model.element;

import java.util.HashSet;
import java.util.Set;

import fixture.owl.model.intefaces.ExternalElement;

public abstract class Feature extends ElementImpl {
	
	private Feature fatherFeature;
	
	private Set<Feature> childrenFeatures;
	
	private Set<Variation> variations;
	
	private Set<Attribute> attributes;
	
	private Set<ExternalElement> externalElements;
	

	public Feature() {
		this.childrenFeatures = new HashSet<Feature>();
		this.variations = new HashSet<Variation>();
		this.attributes = new HashSet<Attribute>();
		this.externalElements = new HashSet<ExternalElement>();
	}
	
	public Feature(String id, String name) {
		this();
		setId(id);
		setName(name);
	}
	
	public void addChild(Feature childFeature) {
		this.getChildrenFeatures().add(childFeature);
		childFeature.setFatherFeature(this);
	}
	
	public void addAttribute(Attribute attribute) {
		this.getAttributes().add(attribute);
		attribute.setFatherFeature(this);
	}
	
	public void addExternalElement(ExternalElement externalElement) {
		this.getExternalElements().add(externalElement);
	}
	
	public Feature getFatherFeature() {
		return fatherFeature;
	}

	public void setFatherFeature(Feature fatherFeature) {
		this.fatherFeature = fatherFeature;
	}

	public Set<Feature> getChildrenFeatures() {
		return childrenFeatures;
	}

	public void setChildrenFeatures(Set<Feature> childrenFeatures) {
		this.childrenFeatures = childrenFeatures;
	}

	public Set<Variation> getVariations() {
		return variations;
	}

	public void setVariations(Set<Variation> variations) {
		this.variations = variations;
	}

	public Set<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<Attribute> attributes) {
		this.attributes = attributes;
	}

	public Set<ExternalElement> getExternalElements() {
		return externalElements;
	}

	public void setExternalElements(Set<ExternalElement> externalElements) {
		this.externalElements = externalElements;
	}
	
	
} // Caracteristica
