/**
 */
package caracteristica.impl;

import caracteristica.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CaracteristicaFactoryImpl extends EFactoryImpl implements CaracteristicaFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static CaracteristicaFactory init()
  {
		try {
			CaracteristicaFactory theCaracteristicaFactory = (CaracteristicaFactory)EPackage.Registry.INSTANCE.getEFactory(CaracteristicaPackage.eNS_URI);
			if (theCaracteristicaFactory != null) {
				return theCaracteristicaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CaracteristicaFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CaracteristicaFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case CaracteristicaPackage.LPS: return createLPS();
			case CaracteristicaPackage.ELEMENTO: return createElemento();
			case CaracteristicaPackage.ELEMENTO_CARACTERISTICO: return createElementoCaracteristico();
			case CaracteristicaPackage.ATRIBUTO: return createAtributo();
			case CaracteristicaPackage.CARACTERISTICA: return createCaracteristica();
			case CaracteristicaPackage.CARACTERISTICA_RAIZ: return createCaracteristicaRaiz();
			case CaracteristicaPackage.CARACTERISTICA_OPCIONAL: return createCaracteristicaOpcional();
			case CaracteristicaPackage.CARACTERISTICA_AGRUPADA: return createCaracteristicaAgrupada();
			case CaracteristicaPackage.CARACTERISTICA_MANDATORIA: return createCaracteristicaMandatoria();
			case CaracteristicaPackage.VARIACAO_DOIS: return createVariacaoDois();
			case CaracteristicaPackage.PONTO_DE_VARIACAO: return createPontoDeVariacao();
			case CaracteristicaPackage.VARIACAO: return createVariacao();
			case CaracteristicaPackage.VARIANTE: return createVariante();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case CaracteristicaPackage.ORIGEM:
				return createOrigemFromString(eDataType, initialValue);
			case CaracteristicaPackage.VALIDADE:
				return createValidadeFromString(eDataType, initialValue);
			case CaracteristicaPackage.QUALIDADE:
				return createQualidadeFromString(eDataType, initialValue);
			case CaracteristicaPackage.TIPO_VALOR:
				return createTipoValorFromString(eDataType, initialValue);
			case CaracteristicaPackage.OPERADOR_LOGICO:
				return createOperadorLogicoFromString(eDataType, initialValue);
			case CaracteristicaPackage.OPERADOR_ACAO_LOGICO:
				return createOperadorAcaoLogicoFromString(eDataType, initialValue);
			case CaracteristicaPackage.CARDINALIDADE_MAXIMA:
				return createCardinalidadeMaximaFromString(eDataType, initialValue);
			case CaracteristicaPackage.OPERADOR_RELACIONAL:
				return createOperadorRelacionalFromString(eDataType, initialValue);
			case CaracteristicaPackage.PRESENCA:
				return createPresencaFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case CaracteristicaPackage.ORIGEM:
				return convertOrigemToString(eDataType, instanceValue);
			case CaracteristicaPackage.VALIDADE:
				return convertValidadeToString(eDataType, instanceValue);
			case CaracteristicaPackage.QUALIDADE:
				return convertQualidadeToString(eDataType, instanceValue);
			case CaracteristicaPackage.TIPO_VALOR:
				return convertTipoValorToString(eDataType, instanceValue);
			case CaracteristicaPackage.OPERADOR_LOGICO:
				return convertOperadorLogicoToString(eDataType, instanceValue);
			case CaracteristicaPackage.OPERADOR_ACAO_LOGICO:
				return convertOperadorAcaoLogicoToString(eDataType, instanceValue);
			case CaracteristicaPackage.CARDINALIDADE_MAXIMA:
				return convertCardinalidadeMaximaToString(eDataType, instanceValue);
			case CaracteristicaPackage.OPERADOR_RELACIONAL:
				return convertOperadorRelacionalToString(eDataType, instanceValue);
			case CaracteristicaPackage.PRESENCA:
				return convertPresencaToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LPS createLPS()
  {
		LPSImpl lps = new LPSImpl();
		return lps;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Elemento createElemento()
  {
		ElementoImpl elemento = new ElementoImpl();
		return elemento;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ElementoCaracteristico createElementoCaracteristico()
  {
		ElementoCaracteristicoImpl elementoCaracteristico = new ElementoCaracteristicoImpl();
		return elementoCaracteristico;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Atributo createAtributo()
  {
		AtributoImpl atributo = new AtributoImpl();
		return atributo;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Caracteristica createCaracteristica()
  {
		CaracteristicaImpl caracteristica = new CaracteristicaImpl();
		return caracteristica;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CaracteristicaRaiz createCaracteristicaRaiz()
  {
		CaracteristicaRaizImpl caracteristicaRaiz = new CaracteristicaRaizImpl();
		return caracteristicaRaiz;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CaracteristicaOpcional createCaracteristicaOpcional()
  {
		CaracteristicaOpcionalImpl caracteristicaOpcional = new CaracteristicaOpcionalImpl();
		return caracteristicaOpcional;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CaracteristicaAgrupada createCaracteristicaAgrupada()
  {
		CaracteristicaAgrupadaImpl caracteristicaAgrupada = new CaracteristicaAgrupadaImpl();
		return caracteristicaAgrupada;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CaracteristicaMandatoria createCaracteristicaMandatoria()
  {
		CaracteristicaMandatoriaImpl caracteristicaMandatoria = new CaracteristicaMandatoriaImpl();
		return caracteristicaMandatoria;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariacaoDois createVariacaoDois()
  {
		VariacaoDoisImpl variacaoDois = new VariacaoDoisImpl();
		return variacaoDois;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PontoDeVariacao createPontoDeVariacao()
  {
		PontoDeVariacaoImpl pontoDeVariacao = new PontoDeVariacaoImpl();
		return pontoDeVariacao;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variacao createVariacao()
  {
		VariacaoImpl variacao = new VariacaoImpl();
		return variacao;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variante createVariante()
  {
		VarianteImpl variante = new VarianteImpl();
		return variante;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Origem createOrigemFromString(EDataType eDataType, String initialValue)
  {
		Origem result = Origem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertOrigemToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Validade createValidadeFromString(EDataType eDataType, String initialValue)
  {
		Validade result = Validade.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertValidadeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Qualidade createQualidadeFromString(EDataType eDataType, String initialValue)
  {
		Qualidade result = Qualidade.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertQualidadeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TipoValor createTipoValorFromString(EDataType eDataType, String initialValue)
  {
		TipoValor result = TipoValor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertTipoValorToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperadorLogico createOperadorLogicoFromString(EDataType eDataType, String initialValue)
  {
		OperadorLogico result = OperadorLogico.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertOperadorLogicoToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperadorAcaoLogico createOperadorAcaoLogicoFromString(EDataType eDataType, String initialValue)
  {
		OperadorAcaoLogico result = OperadorAcaoLogico.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertOperadorAcaoLogicoToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CardinalidadeMaxima createCardinalidadeMaximaFromString(EDataType eDataType, String initialValue)
  {
		CardinalidadeMaxima result = CardinalidadeMaxima.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertCardinalidadeMaximaToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperadorRelacional createOperadorRelacionalFromString(EDataType eDataType, String initialValue)
  {
		OperadorRelacional result = OperadorRelacional.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertOperadorRelacionalToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Presenca createPresencaFromString(EDataType eDataType, String initialValue)
  {
		Presenca result = Presenca.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertPresencaToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CaracteristicaPackage getCaracteristicaPackage()
  {
		return (CaracteristicaPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static CaracteristicaPackage getPackage()
  {
		return CaracteristicaPackage.eINSTANCE;
	}

} //CaracteristicaFactoryImpl
