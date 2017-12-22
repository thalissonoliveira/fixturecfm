/*
 * 
 */
package caracteristica.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import caracteristica.diagram.providers.CaracteristicaElementTypes;

/**
 * @generated
 */
public class CaracteristicaAtributoItemSemanticEditPolicy extends CaracteristicaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CaracteristicaAtributoItemSemanticEditPolicy() {
		super(CaracteristicaElementTypes.CaracteristicaAtributo_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
