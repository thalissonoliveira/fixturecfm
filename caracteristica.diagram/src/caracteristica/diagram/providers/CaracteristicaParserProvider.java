/*
 * 
 */
package caracteristica.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import caracteristica.CaracteristicaPackage;
import caracteristica.diagram.edit.parts.AtributoNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaRaizNomeEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisNomeCardinalidadeMaximaEditPart;
import caracteristica.diagram.parsers.MessageFormatParser;
import caracteristica.diagram.part.CaracteristicaVisualIDRegistry;

/**
 * @generated
 */
public class CaracteristicaParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser caracteristicaOpcionalNome_5001Parser;

	/**
	 * @generated
	 */
	private IParser getCaracteristicaOpcionalNome_5001Parser() {
		if (caracteristicaOpcionalNome_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE.getElemento_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caracteristicaOpcionalNome_5001Parser = parser;
		}
		return caracteristicaOpcionalNome_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser caracteristicaAgrupadaNome_5034Parser;

	/**
	 * @generated
	 */
	private IParser getCaracteristicaAgrupadaNome_5034Parser() {
		if (caracteristicaAgrupadaNome_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE.getElemento_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caracteristicaAgrupadaNome_5034Parser = parser;
		}
		return caracteristicaAgrupadaNome_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser variacaoDoisNomeCardinalidadeMaxima_5002Parser;

	/**
	 * @generated
	 */
	private IParser getVariacaoDoisNomeCardinalidadeMaxima_5002Parser() {
		if (variacaoDoisNomeCardinalidadeMaxima_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE.getElemento_Nome(),
					CaracteristicaPackage.eINSTANCE.getVariacaoDois_CardinalidadeMaxima() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Variation {0} : {1} "); //$NON-NLS-1$
			parser.setEditorPattern("Variation {0} : {1} "); //$NON-NLS-1$
			parser.setEditPattern("Variation {0} : {1} "); //$NON-NLS-1$
			variacaoDoisNomeCardinalidadeMaxima_5002Parser = parser;
		}
		return variacaoDoisNomeCardinalidadeMaxima_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser caracteristicaRaizNome_5003Parser;

	/**
	 * @generated
	 */
	private IParser getCaracteristicaRaizNome_5003Parser() {
		if (caracteristicaRaizNome_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE.getElemento_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caracteristicaRaizNome_5003Parser = parser;
		}
		return caracteristicaRaizNome_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser caracteristicaMandatoriaNome_5004Parser;

	/**
	 * @generated
	 */
	private IParser getCaracteristicaMandatoriaNome_5004Parser() {
		if (caracteristicaMandatoriaNome_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE.getElemento_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caracteristicaMandatoriaNome_5004Parser = parser;
		}
		return caracteristicaMandatoriaNome_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser atributoNome_5017Parser;

	/**
	 * @generated
	 */
	private IParser getAtributoNome_5017Parser() {
		if (atributoNome_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE.getElemento_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Attribute {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Attribute {0}"); //$NON-NLS-1$
			parser.setEditPattern("Attribute {0}"); //$NON-NLS-1$
			atributoNome_5017Parser = parser;
		}
		return atributoNome_5017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CaracteristicaOpcionalNomeEditPart.VISUAL_ID:
			return getCaracteristicaOpcionalNome_5001Parser();
		case CaracteristicaAgrupadaNomeEditPart.VISUAL_ID:
			return getCaracteristicaAgrupadaNome_5034Parser();
		case VariacaoDoisNomeCardinalidadeMaximaEditPart.VISUAL_ID:
			return getVariacaoDoisNomeCardinalidadeMaxima_5002Parser();
		case CaracteristicaRaizNomeEditPart.VISUAL_ID:
			return getCaracteristicaRaizNome_5003Parser();
		case CaracteristicaMandatoriaNomeEditPart.VISUAL_ID:
			return getCaracteristicaMandatoriaNome_5004Parser();
		case AtributoNomeEditPart.VISUAL_ID:
			return getAtributoNome_5017Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(CaracteristicaVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CaracteristicaVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CaracteristicaElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
