package fixture.owl.model.element;

import java.util.HashSet;
import java.util.Set;

public class ContextEntity extends ElementImpl {
	
	private Set<ContextInfo> contextInfos;
	private ContextRoot fatherContextRoot;
	
	public ContextEntity() {
		contextInfos = new HashSet<ContextInfo>();
	}

	public ContextEntity(String id, String name) {
		super(id, name);
		contextInfos = new HashSet<ContextInfo>();
	}
	
	public Set<ContextInfo> getContextInfos() {
		return contextInfos;
	}

	public void setContextInfos(Set<ContextInfo> contextInfos) {
		this.contextInfos = contextInfos;
	}
	
	public ContextRoot getFatherContextRoot() {
		return fatherContextRoot;
	}

	public void setFatherContextRoot(ContextRoot fatherContextRoot) {
		this.fatherContextRoot = fatherContextRoot;
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
	
} // EntidadedeContexto
