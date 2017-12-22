package fixture.owl.model.element;

import java.util.HashSet;
import java.util.Set;

public class ContextRoot extends ElementImpl {
	
	private Set<ContextEntity> contextEntities;
	
	public ContextRoot() {
		contextEntities = new HashSet<ContextEntity>();
	}
	
	public ContextRoot(String id, String name) {
		super(id, name);
		contextEntities = new HashSet<ContextEntity>();
	}

	public Set<ContextEntity> getContextEntities() {
		return contextEntities;
	}

	public void setContextEntities(Set<ContextEntity> contextEntities) {
		this.contextEntities = contextEntities;
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
		return true;
	}
	
	
	public boolean isGroupedFeature() {
		return false;
	}
	
} // RaizDeContexto
