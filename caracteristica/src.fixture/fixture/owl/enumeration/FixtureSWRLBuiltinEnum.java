package fixture.owl.enumeration;

import org.semanticweb.owlapi.model.IRI;

import fixture.owl.utils.Utils;

public enum FixtureSWRLBuiltinEnum {
	
	
	EQUAL_NAME("equalname", Utils.BUILT_IN_BASE_URL + "equalname", Utils.BUILT_IN_PREFIX + "equalname");
	
	private String name;
	private String pathUri;
	private String pathUriOnlyPrefix;
	
	private FixtureSWRLBuiltinEnum(String name, String pathUri, String pathUriOnlyPrefix) {
		this.name = name;
		this.pathUri = pathUri;
		this.pathUriOnlyPrefix = pathUriOnlyPrefix;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPathUri() {
		return pathUri;
	}

	public IRI getIri() {
		return IRI.create(this.pathUri);
	}

	public String getPathUriOnlyPrefix() {
		return pathUriOnlyPrefix;
	}
	
	public static FixtureSWRLBuiltinEnum getByBuitinName(String builtinName) {
		for (FixtureSWRLBuiltinEnum fixtureSWRLBuiltinEnum : FixtureSWRLBuiltinEnum.values()) {
			if (fixtureSWRLBuiltinEnum.getPathUriOnlyPrefix().equals(builtinName) || fixtureSWRLBuiltinEnum.getPathUri().equals(builtinName)) {
				return fixtureSWRLBuiltinEnum;
			}
			
		}
		return null;
	}
	
	
	
	
}
