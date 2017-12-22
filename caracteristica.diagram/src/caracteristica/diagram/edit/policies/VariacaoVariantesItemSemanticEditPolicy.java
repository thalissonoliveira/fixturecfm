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
public class VariacaoVariantesItemSemanticEditPolicy extends CaracteristicaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public VariacaoVariantesItemSemanticEditPolicy() {
		super(CaracteristicaElementTypes.VariacaoVariantes_4005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
