package fixture.owl.swrl;

import com.clarkparsia.pellet.rules.BindingHelper;
import com.clarkparsia.pellet.rules.builtins.BuiltIn;
import com.clarkparsia.pellet.rules.model.BuiltInAtom;

public class FixtureBuiltin implements BuiltIn {
	
	
	private FixtureBuiltinHelper fixtureBuiltinHelper;
	
	public FixtureBuiltin(FixtureBuiltinHelper fixtureBuiltinHelper) {
		this.fixtureBuiltinHelper = fixtureBuiltinHelper;
	}

	
    public BindingHelper createHelper(BuiltInAtom atom) {
		this.fixtureBuiltinHelper.setAtom(atom);
        return this.fixtureBuiltinHelper;
    }

}