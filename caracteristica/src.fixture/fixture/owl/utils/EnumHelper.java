package fixture.owl.utils;

import fixture.owl.enumeration.RulesConstraintsOWLClassTypeEnum;
import fixture.owl.enumeration.interfaces.FixtureOWLConceptEnumInterface;


public class EnumHelper {
	
	public static void main(String[] args) {
		System.out.println(EnumHelper.findByLabel(RulesConstraintsOWLClassTypeEnum.class, "GFR2"));
	}
	
	public static <O extends FixtureOWLConceptEnumInterface> O findByLabel(Class<O> enumKlass, String label) {
		O[] enumConstants = enumKlass.getEnumConstants();
		for (O o : enumConstants) {
			if (o.getLabel().equals(label)) {
				return o;
			}
		}
		return null;
		
	}
		
}
