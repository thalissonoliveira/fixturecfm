/*
 * 
 */
package caracteristica.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import caracteristica.diagram.edit.parts.AtributoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaRaizEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisEditPart;
import caracteristica.diagram.providers.CaracteristicaElementTypes;
import caracteristica.diagram.providers.CaracteristicaModelingAssistantProvider;

/**
 * @generated
 */
public class CaracteristicaModelingAssistantProviderOfCaracteristicaAgrupadaEditPart
		extends CaracteristicaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((CaracteristicaAgrupadaEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(CaracteristicaAgrupadaEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002);
		types.add(CaracteristicaElementTypes.CaracteristicaAtributo_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((CaracteristicaAgrupadaEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(CaracteristicaAgrupadaEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof CaracteristicaOpcionalEditPart) {
			types.add(CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002);
		}
		if (targetEditPart instanceof CaracteristicaAgrupadaEditPart) {
			types.add(CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002);
		}
		if (targetEditPart instanceof VariacaoDoisEditPart) {
			types.add(CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002);
		}
		if (targetEditPart instanceof CaracteristicaRaizEditPart) {
			types.add(CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002);
		}
		if (targetEditPart instanceof CaracteristicaMandatoriaEditPart) {
			types.add(CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002);
		}
		if (targetEditPart instanceof AtributoEditPart) {
			types.add(CaracteristicaElementTypes.CaracteristicaAtributo_4004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((CaracteristicaAgrupadaEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(CaracteristicaAgrupadaEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002) {
			types.add(CaracteristicaElementTypes.CaracteristicaOpcional_2001);
			types.add(CaracteristicaElementTypes.CaracteristicaAgrupada_2033);
			types.add(CaracteristicaElementTypes.VariacaoDois_2002);
			types.add(CaracteristicaElementTypes.CaracteristicaRaiz_2003);
			types.add(CaracteristicaElementTypes.CaracteristicaMandatoria_2004);
		} else if (relationshipType == CaracteristicaElementTypes.CaracteristicaAtributo_4004) {
			types.add(CaracteristicaElementTypes.Atributo_2017);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((CaracteristicaAgrupadaEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(CaracteristicaAgrupadaEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((CaracteristicaAgrupadaEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(CaracteristicaAgrupadaEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002) {
			types.add(CaracteristicaElementTypes.CaracteristicaOpcional_2001);
			types.add(CaracteristicaElementTypes.CaracteristicaAgrupada_2033);
			types.add(CaracteristicaElementTypes.VariacaoDois_2002);
			types.add(CaracteristicaElementTypes.CaracteristicaRaiz_2003);
			types.add(CaracteristicaElementTypes.CaracteristicaMandatoria_2004);
		}
		return types;
	}

}
