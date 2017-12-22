/*
 * 
 */
package caracteristica.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import caracteristica.diagram.part.CaracteristicaVisualIDRegistry;

/**
 * @generated
 */
public class CaracteristicaEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CaracteristicaVisualIDRegistry.getVisualID(view)) {

			case LPSEditPart.VISUAL_ID:
				return new LPSEditPart(view);

			case CaracteristicaOpcionalEditPart.VISUAL_ID:
				return new CaracteristicaOpcionalEditPart(view);

			case CaracteristicaOpcionalNomeEditPart.VISUAL_ID:
				return new CaracteristicaOpcionalNomeEditPart(view);

			case CaracteristicaAgrupadaEditPart.VISUAL_ID:
				return new CaracteristicaAgrupadaEditPart(view);

			case CaracteristicaAgrupadaNomeEditPart.VISUAL_ID:
				return new CaracteristicaAgrupadaNomeEditPart(view);

			case VariacaoDoisEditPart.VISUAL_ID:
				return new VariacaoDoisEditPart(view);

			case VariacaoDoisNomeCardinalidadeMaximaEditPart.VISUAL_ID:
				return new VariacaoDoisNomeCardinalidadeMaximaEditPart(view);

			case CaracteristicaRaizEditPart.VISUAL_ID:
				return new CaracteristicaRaizEditPart(view);

			case CaracteristicaRaizNomeEditPart.VISUAL_ID:
				return new CaracteristicaRaizNomeEditPart(view);

			case CaracteristicaMandatoriaEditPart.VISUAL_ID:
				return new CaracteristicaMandatoriaEditPart(view);

			case CaracteristicaMandatoriaNomeEditPart.VISUAL_ID:
				return new CaracteristicaMandatoriaNomeEditPart(view);

			case AtributoEditPart.VISUAL_ID:
				return new AtributoEditPart(view);

			case AtributoNomeEditPart.VISUAL_ID:
				return new AtributoNomeEditPart(view);

			case CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID:
				return new CaracteristicaCaracteristicaFilhaEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case CaracteristicaVariacoesEditPart.VISUAL_ID:
				return new CaracteristicaVariacoesEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case CaracteristicaAtributoEditPart.VISUAL_ID:
				return new CaracteristicaAtributoEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case VariacaoVariantesEditPart.VISUAL_ID:
				return new VariacaoVariantesEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
