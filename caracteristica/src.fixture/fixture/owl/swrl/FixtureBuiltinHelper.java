package fixture.owl.swrl;

import com.clarkparsia.pellet.rules.BindingHelper;
import com.clarkparsia.pellet.rules.model.BuiltInAtom;

public abstract class FixtureBuiltinHelper implements BindingHelper {
	
	private BuiltInAtom atom;
	
	public BuiltInAtom getAtom() {
		return atom;
	}

	public void setAtom(BuiltInAtom atom) {
		this.atom = atom;
	}
	
}
