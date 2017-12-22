package fixture.owl.swrl.interfaces;

import org.mindswap.pellet.ABox;
import org.mindswap.pellet.Node;

/**
 * Interface for a SWRL built-in implementation.
 */
public interface FixtureSWRLFunction {

    /**
     * Implements a SWRL built-in function on Literals or Individuals.
     *
     * @param abox ABox
     * @param args array of Individual or Literal
     * @return true on success, false otherwise
     */
    public boolean apply(ABox abox, Node[] args);

    public boolean isApplicable(boolean[] boundPositions);

}
