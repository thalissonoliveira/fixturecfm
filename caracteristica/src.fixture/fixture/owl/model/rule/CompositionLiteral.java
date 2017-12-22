package fixture.owl.model.rule;

import fixture.owl.model.enumeration.Presence;
import fixture.owl.model.intefaces.FeaturedElement;
import fixture.owl.model.intefaces.Nameable;



public class CompositionLiteral extends Antecedent {
	
	private Presence presence;
	
	private FeaturedElement featuredElement;
	
	public CompositionLiteral() {
		super();
	}

	public CompositionLiteral(String id, String name) {
		super(id, name);
	}
	
	public void setFeaturedElement(Nameable featuredElement) {
		this.featuredElement = (FeaturedElement) featuredElement;
	}

	public void setPresence(int presence) {
		this.presence = Presence.get(presence);
	}

	public Presence getPresence() {
		return presence;
	}

	public void setPresence(Presence presence) {
		this.presence = presence;
	}

	public FeaturedElement getFeaturedElement() {
		return featuredElement;
	}

	public void setFeaturedElement(FeaturedElement featuredElement) {
		this.featuredElement = featuredElement;
	}

	
	public boolean isCompositionLiteral() {
		return true;
	}

	
	public boolean isLogicalExpression() {
		return false;
	}

	
	public boolean isRelationalExpression() {
		return false;
	}
	
} // LiteralComposicao
