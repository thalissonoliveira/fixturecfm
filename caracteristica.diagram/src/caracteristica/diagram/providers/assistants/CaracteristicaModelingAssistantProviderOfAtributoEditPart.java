/*
 * 
 */
package caracteristica.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import caracteristica.diagram.edit.parts.AtributoEditPart;
import caracteristica.diagram.providers.CaracteristicaElementTypes;
import caracteristica.diagram.providers.CaracteristicaModelingAssistantProvider;

/**
 * @generated
 */
public class CaracteristicaModelingAssistantProviderOfAtributoEditPart extends CaracteristicaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((AtributoEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(AtributoEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CaracteristicaElementTypes.CaracteristicaAtributo_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((AtributoEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(AtributoEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CaracteristicaElementTypes.CaracteristicaAtributo_4004) {
			types.add(CaracteristicaElementTypes.CaracteristicaOpcional_2001);
			types.add(CaracteristicaElementTypes.CaracteristicaAgrupada_2033);
			types.add(CaracteristicaElementTypes.VariacaoDois_2002);
			types.add(CaracteristicaElementTypes.CaracteristicaRaiz_2003);
			types.add(CaracteristicaElementTypes.CaracteristicaMandatoria_2004);
		}
		return types;
	}

}
