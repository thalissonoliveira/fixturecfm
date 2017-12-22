package fixture.owl.model.externalelement;

public class TestCase extends ExternalElementImpl {
	

	public TestCase() {
		super();
	}

	public TestCase(String id, String name) {
		super(id, name);
	}

	
	public boolean isTestCase() {
		return true;
	}

	
	public boolean isUseCase() {
		return false;
	}

}
