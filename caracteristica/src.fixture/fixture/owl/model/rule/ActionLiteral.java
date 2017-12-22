package fixture.owl.model.rule;

import fixture.owl.model.enumeration.Presence;
import fixture.owl.model.intefaces.FeaturedElement;

public class ActionLiteral extends Action {
	
	private Presence presence;
	
	private FeaturedElement featuredElement;
	
	public ActionLiteral() {
		super();
	}

	public ActionLiteral(String id, String name) {
		super(id, name);
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

	
	public boolean isActionLiteral() {
		return true;
	}

	
	public boolean isDesignate() {
		return false;
	}

	
	public boolean isLogicalAction() {
		return false;
	}
	
	
} // LiteralAcao
