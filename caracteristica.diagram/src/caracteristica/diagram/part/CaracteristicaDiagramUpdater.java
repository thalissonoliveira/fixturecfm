/*
 * 
 */
package caracteristica.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import caracteristica.Atributo;
import caracteristica.Caracteristica;
import caracteristica.CaracteristicaAgrupada;
import caracteristica.CaracteristicaMandatoria;
import caracteristica.CaracteristicaOpcional;
import caracteristica.CaracteristicaPackage;
import caracteristica.CaracteristicaRaiz;
import caracteristica.Elemento;
import caracteristica.ElementoExterno;
import caracteristica.Variacao;
import caracteristica.VariacaoDois;
import caracteristica.diagram.edit.parts.AtributoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAtributoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaCaracteristicaFilhaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaElementosExternosEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaRaizEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaVariacoesEditPart;
import caracteristica.diagram.edit.parts.LPSEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisEditPart;
import caracteristica.diagram.providers.CaracteristicaElementTypes;

/**
 * @generated
 */
public class CaracteristicaDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaNodeDescriptor> getSemanticChildren(View view) {
		switch (CaracteristicaVisualIDRegistry.getVisualID(view)) {
		case LPSEditPart.VISUAL_ID:
			return getLPS_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaNodeDescriptor> getLPS_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		caracteristica.LPS modelElement = (caracteristica.LPS) view.getElement();
		LinkedList<CaracteristicaNodeDescriptor> result = new LinkedList<CaracteristicaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElementos().iterator(); it.hasNext();) {
			Elemento childElement = (Elemento) it.next();
			int visualID = CaracteristicaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CaracteristicaOpcionalEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CaracteristicaAgrupadaEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == VariacaoDoisEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CaracteristicaRaizEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CaracteristicaMandatoriaEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtributoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getContainedLinks(View view) {
		switch (CaracteristicaVisualIDRegistry.getVisualID(view)) {
		case LPSEditPart.VISUAL_ID:
			return getLPS_1000ContainedLinks(view);
		case CaracteristicaOpcionalEditPart.VISUAL_ID:
			return getCaracteristicaOpcional_2001ContainedLinks(view);
		case CaracteristicaAgrupadaEditPart.VISUAL_ID:
			return getCaracteristicaAgrupada_2033ContainedLinks(view);
		case VariacaoDoisEditPart.VISUAL_ID:
			return getVariacaoDois_2002ContainedLinks(view);
		case CaracteristicaRaizEditPart.VISUAL_ID:
			return getCaracteristicaRaiz_2003ContainedLinks(view);
		case CaracteristicaMandatoriaEditPart.VISUAL_ID:
			return getCaracteristicaMandatoria_2004ContainedLinks(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_2017ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getIncomingLinks(View view) {
		switch (CaracteristicaVisualIDRegistry.getVisualID(view)) {
		case CaracteristicaOpcionalEditPart.VISUAL_ID:
			return getCaracteristicaOpcional_2001IncomingLinks(view);
		case CaracteristicaAgrupadaEditPart.VISUAL_ID:
			return getCaracteristicaAgrupada_2033IncomingLinks(view);
		case VariacaoDoisEditPart.VISUAL_ID:
			return getVariacaoDois_2002IncomingLinks(view);
		case CaracteristicaRaizEditPart.VISUAL_ID:
			return getCaracteristicaRaiz_2003IncomingLinks(view);
		case CaracteristicaMandatoriaEditPart.VISUAL_ID:
			return getCaracteristicaMandatoria_2004IncomingLinks(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_2017IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getOutgoingLinks(View view) {
		switch (CaracteristicaVisualIDRegistry.getVisualID(view)) {
		case CaracteristicaOpcionalEditPart.VISUAL_ID:
			return getCaracteristicaOpcional_2001OutgoingLinks(view);
		case CaracteristicaAgrupadaEditPart.VISUAL_ID:
			return getCaracteristicaAgrupada_2033OutgoingLinks(view);
		case VariacaoDoisEditPart.VISUAL_ID:
			return getVariacaoDois_2002OutgoingLinks(view);
		case CaracteristicaRaizEditPart.VISUAL_ID:
			return getCaracteristicaRaiz_2003OutgoingLinks(view);
		case CaracteristicaMandatoriaEditPart.VISUAL_ID:
			return getCaracteristicaMandatoria_2004OutgoingLinks(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_2017OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getLPS_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaOpcional_2001ContainedLinks(View view) {
		CaracteristicaOpcional modelElement = (CaracteristicaOpcional) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaAgrupada_2033ContainedLinks(View view) {
		CaracteristicaAgrupada modelElement = (CaracteristicaAgrupada) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getVariacaoDois_2002ContainedLinks(View view) {
		VariacaoDois modelElement = (VariacaoDois) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaRaiz_2003ContainedLinks(View view) {
		CaracteristicaRaiz modelElement = (CaracteristicaRaiz) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaMandatoria_2004ContainedLinks(View view) {
		CaracteristicaMandatoria modelElement = (CaracteristicaMandatoria) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getAtributo_2017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaOpcional_2001IncomingLinks(View view) {
		CaracteristicaOpcional modelElement = (CaracteristicaOpcional) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaAgrupada_2033IncomingLinks(View view) {
		CaracteristicaAgrupada modelElement = (CaracteristicaAgrupada) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getVariacaoDois_2002IncomingLinks(View view) {
		VariacaoDois modelElement = (VariacaoDois) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaRaiz_2003IncomingLinks(View view) {
		CaracteristicaRaiz modelElement = (CaracteristicaRaiz) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaMandatoria_2004IncomingLinks(View view) {
		CaracteristicaMandatoria modelElement = (CaracteristicaMandatoria) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getAtributo_2017IncomingLinks(View view) {
		Atributo modelElement = (Atributo) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaOpcional_2001OutgoingLinks(View view) {
		CaracteristicaOpcional modelElement = (CaracteristicaOpcional) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaAgrupada_2033OutgoingLinks(View view) {
		CaracteristicaAgrupada modelElement = (CaracteristicaAgrupada) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getVariacaoDois_2002OutgoingLinks(View view) {
		VariacaoDois modelElement = (VariacaoDois) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaRaiz_2003OutgoingLinks(View view) {
		CaracteristicaRaiz modelElement = (CaracteristicaRaiz) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaMandatoria_2004OutgoingLinks(View view) {
		CaracteristicaMandatoria modelElement = (CaracteristicaMandatoria) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getAtributo_2017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(
			Caracteristica target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getCaracteristica_CaracteristicaFilha()) {
				result.add(new CaracteristicaLinkDescriptor(setting.getEObject(), target,
						CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002,
						CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_Caracteristica_Atributo_4004(
			Atributo target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE.getCaracteristica_Atributo()) {
				result.add(new CaracteristicaLinkDescriptor(setting.getEObject(), target,
						CaracteristicaElementTypes.CaracteristicaAtributo_4004,
						CaracteristicaAtributoEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(
			Caracteristica source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		for (Iterator<?> destinations = source.getCaracteristicaFilha().iterator(); destinations.hasNext();) {
			Caracteristica destination = (Caracteristica) destinations.next();
			result.add(new CaracteristicaLinkDescriptor(source, destination,
					CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002,
					CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(
			Caracteristica source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		for (Iterator<?> destinations = source.getVariacoes().iterator(); destinations.hasNext();) {
			Variacao destination = (Variacao) destinations.next();
			result.add(new CaracteristicaLinkDescriptor(source, destination,
					CaracteristicaElementTypes.CaracteristicaVariacoes_4003,
					CaracteristicaVariacoesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(
			Caracteristica source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		for (Iterator<?> destinations = source.getAtributo().iterator(); destinations.hasNext();) {
			Atributo destination = (Atributo) destinations.next();
			result.add(new CaracteristicaLinkDescriptor(source, destination,
					CaracteristicaElementTypes.CaracteristicaAtributo_4004, CaracteristicaAtributoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<CaracteristicaNodeDescriptor> getSemanticChildren(View view) {
			return CaracteristicaDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CaracteristicaLinkDescriptor> getContainedLinks(View view) {
			return CaracteristicaDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CaracteristicaLinkDescriptor> getIncomingLinks(View view) {
			return CaracteristicaDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CaracteristicaLinkDescriptor> getOutgoingLinks(View view) {
			return CaracteristicaDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
