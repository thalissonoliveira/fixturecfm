/*
 * 
 */
package caracteristica.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import caracteristica.CaracteristicaPackage;
import caracteristica.diagram.edit.parts.AtributoEditPart;
import caracteristica.diagram.edit.parts.AtributoNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAtributoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaCaracteristicaFilhaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaElementosExternosEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaRaizEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaRaizNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaVariacoesEditPart;
import caracteristica.diagram.edit.parts.LPSEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisNomeCardinalidadeMaximaEditPart;
import caracteristica.diagram.edit.parts.VariacaoVariantesEditPart;
import caracteristica.diagram.edit.parts.WrappingLabel2EditPart;
import caracteristica.diagram.edit.parts.WrappingLabel3EditPart;
import caracteristica.diagram.edit.parts.WrappingLabel4EditPart;
import caracteristica.diagram.edit.parts.WrappingLabel5EditPart;
import caracteristica.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CaracteristicaVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "caracteristica.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (LPSEditPart.MODEL_ID.equals(view.getType())) {
				return LPSEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return caracteristica.diagram.part.CaracteristicaVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				CaracteristicaDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CaracteristicaPackage.eINSTANCE.getLPS().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((caracteristica.LPS) domainElement)) {
			return LPSEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = caracteristica.diagram.part.CaracteristicaVisualIDRegistry.getModelID(containerView);
		if (!LPSEditPart.MODEL_ID.equals(containerModelID) && !"caracteristica".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (LPSEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = caracteristica.diagram.part.CaracteristicaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = LPSEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case LPSEditPart.VISUAL_ID:
			if (CaracteristicaPackage.eINSTANCE.getCaracteristicaOpcional().isSuperTypeOf(domainElement.eClass())) {
				return CaracteristicaOpcionalEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getCaracteristicaAgrupada().isSuperTypeOf(domainElement.eClass())) {
				return CaracteristicaAgrupadaEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getVariacaoDois().isSuperTypeOf(domainElement.eClass())) {
				return VariacaoDoisEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getCaracteristicaRaiz().isSuperTypeOf(domainElement.eClass())) {
				return CaracteristicaRaizEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getCaracteristicaMandatoria().isSuperTypeOf(domainElement.eClass())) {
				return CaracteristicaMandatoriaEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getAtributo().isSuperTypeOf(domainElement.eClass())) {
				return AtributoEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = caracteristica.diagram.part.CaracteristicaVisualIDRegistry.getModelID(containerView);
		if (!LPSEditPart.MODEL_ID.equals(containerModelID) && !"caracteristica".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (LPSEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = caracteristica.diagram.part.CaracteristicaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = LPSEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case LPSEditPart.VISUAL_ID:
			if (CaracteristicaOpcionalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaracteristicaAgrupadaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (VariacaoDoisEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaracteristicaRaizEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaracteristicaMandatoriaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaOpcionalEditPart.VISUAL_ID:
			if (CaracteristicaOpcionalNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaAgrupadaEditPart.VISUAL_ID:
			if (CaracteristicaAgrupadaNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VariacaoDoisEditPart.VISUAL_ID:
			if (VariacaoDoisNomeCardinalidadeMaximaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaRaizEditPart.VISUAL_ID:
			if (CaracteristicaRaizNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaMandatoriaEditPart.VISUAL_ID:
			if (CaracteristicaMandatoriaNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributoEditPart.VISUAL_ID:
			if (AtributoNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaVariacoesEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaAtributoEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VariacaoVariantesEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(caracteristica.LPS element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case LPSEditPart.VISUAL_ID:
			return false;
		case CaracteristicaOpcionalEditPart.VISUAL_ID:
		case VariacaoDoisEditPart.VISUAL_ID:
		case CaracteristicaRaizEditPart.VISUAL_ID:
		case CaracteristicaMandatoriaEditPart.VISUAL_ID:
		case AtributoEditPart.VISUAL_ID:
		case CaracteristicaAgrupadaEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return caracteristica.diagram.part.CaracteristicaVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return caracteristica.diagram.part.CaracteristicaVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return caracteristica.diagram.part.CaracteristicaVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return caracteristica.diagram.part.CaracteristicaVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return caracteristica.diagram.part.CaracteristicaVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return caracteristica.diagram.part.CaracteristicaVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
