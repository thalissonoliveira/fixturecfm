/*
 * 
 */
package caracteristica.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import caracteristica.diagram.edit.commands.AtributoCreateCommand;
import caracteristica.diagram.edit.commands.CaracteristicaAgrupadaCreateCommand;
import caracteristica.diagram.edit.commands.CaracteristicaMandatoriaCreateCommand;
import caracteristica.diagram.edit.commands.CaracteristicaOpcionalCreateCommand;
import caracteristica.diagram.edit.commands.CaracteristicaRaizCreateCommand;
import caracteristica.diagram.edit.commands.VariacaoDoisCreateCommand;
import caracteristica.diagram.providers.CaracteristicaElementTypes;

/**
 * @generated
 */
public class LPSItemSemanticEditPolicy extends CaracteristicaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LPSItemSemanticEditPolicy() {
		super(CaracteristicaElementTypes.LPS_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CaracteristicaElementTypes.CaracteristicaOpcional_2001 == req.getElementType()) {
			return getGEFWrapper(new CaracteristicaOpcionalCreateCommand(req));
		}
		if (CaracteristicaElementTypes.CaracteristicaAgrupada_2033 == req.getElementType()) {
			return getGEFWrapper(new CaracteristicaAgrupadaCreateCommand(req));
		}
		if (CaracteristicaElementTypes.VariacaoDois_2002 == req.getElementType()) {
			return getGEFWrapper(new VariacaoDoisCreateCommand(req));
		}
		if (CaracteristicaElementTypes.CaracteristicaRaiz_2003 == req.getElementType()) {
			return getGEFWrapper(new CaracteristicaRaizCreateCommand(req));
		}
		if (CaracteristicaElementTypes.CaracteristicaMandatoria_2004 == req.getElementType()) {
			return getGEFWrapper(new CaracteristicaMandatoriaCreateCommand(req));
		}
		if (CaracteristicaElementTypes.Atributo_2017 == req.getElementType()) {
			return getGEFWrapper(new AtributoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
