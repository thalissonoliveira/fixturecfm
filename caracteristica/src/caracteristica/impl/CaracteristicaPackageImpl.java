/**
 */
package caracteristica.impl;

import caracteristica.Acao;
import caracteristica.AcaoLogico;
import caracteristica.Antecedente;
import caracteristica.Atributo;
import caracteristica.AtributoProduto;
import caracteristica.Caracteristica;
import caracteristica.CaracteristicaAgrupada;
import caracteristica.CaracteristicaAgrupadaProduto;
import caracteristica.CaracteristicaFactory;
import caracteristica.CaracteristicaMandatoria;
import caracteristica.CaracteristicaMandatoriaProduto;
import caracteristica.CaracteristicaOpcional;
import caracteristica.CaracteristicaOpcionalProduto;
import caracteristica.CaracteristicaPackage;
import caracteristica.CaracteristicaProduto;
import caracteristica.CaracteristicaRaiz;
import caracteristica.CardinalidadeMaxima;
import caracteristica.CasoDeTeste;
import caracteristica.CasoDeUso;
import caracteristica.Designar;
import caracteristica.Elemento;
import caracteristica.ElementoCaracteristico;
import caracteristica.ElementoDeProduto;
import caracteristica.ElementoDeProduto;
import caracteristica.ElementoExterno;
import caracteristica.EntidadeDeContexto;
import caracteristica.EntidadeDeContexto;
import caracteristica.Estado;
import caracteristica.Evento;
import caracteristica.EventoLogico;
import caracteristica.EventoRelacional;
import caracteristica.Expressao;
import caracteristica.ExpressaoLogica;
import caracteristica.ExpressaoRelacional;
import caracteristica.InconsistenciaRegraAdaptacao;
import caracteristica.InformacaoDeContexto;
import caracteristica.InformacaoDeContexto;
import caracteristica.LiteralAcao;
import caracteristica.LiteralComposicao;
import caracteristica.OperadorAcaoLogico;
import caracteristica.OperadorLogico;
import caracteristica.OperadorRelacional;
import caracteristica.Origem;
import caracteristica.PontoDeVariacao;
import caracteristica.PontoDeVariacao;
import caracteristica.Presenca;
import caracteristica.Produto;
import caracteristica.Qualidade;
import caracteristica.RaizDeContexto;
import caracteristica.Regra;
import caracteristica.RegraDeComposicao;
import caracteristica.RegraDeContexto;
import caracteristica.Simulacao;
import caracteristica.TipoValor;
import caracteristica.Transicao;
import caracteristica.Validade;
import caracteristica.Variacao;
import caracteristica.VariacaoDois;
import caracteristica.VariacaoDoisProduto;
import caracteristica.VariacaoProduto;
import caracteristica.Variante;
import caracteristica.VarianteProduto;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CaracteristicaPackageImpl extends EPackageImpl implements CaracteristicaPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass lpsEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass elementoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass elementoCaracteristicoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass atributoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass caracteristicaEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass caracteristicaRaizEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass caracteristicaOpcionalEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass caracteristicaAgrupadaEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass caracteristicaMandatoriaEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass variacaoDoisEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass pontoDeVariacaoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass variacaoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass varianteEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum origemEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum validadeEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum qualidadeEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum tipoValorEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum operadorLogicoEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum operadorAcaoLogicoEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum cardinalidadeMaximaEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum operadorRelacionalEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum presencaEEnum = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see caracteristica.CaracteristicaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private CaracteristicaPackageImpl()
  {
		super(eNS_URI, CaracteristicaFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CaracteristicaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static CaracteristicaPackage init()
  {
		if (isInited) return (CaracteristicaPackage)EPackage.Registry.INSTANCE.getEPackage(CaracteristicaPackage.eNS_URI);

		// Obtain or create and register package
		CaracteristicaPackageImpl theCaracteristicaPackage = (CaracteristicaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CaracteristicaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CaracteristicaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCaracteristicaPackage.createPackageContents();

		// Initialize created meta-data
		theCaracteristicaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCaracteristicaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CaracteristicaPackage.eNS_URI, theCaracteristicaPackage);
		return theCaracteristicaPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLPS()
  {
		return lpsEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLPS_Elementos()
  {
		return (EReference)lpsEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLPS_Nome()
  {
		return (EAttribute)lpsEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getElemento()
  {
		return elementoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getElemento_Nome()
  {
		return (EAttribute)elementoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getElementoCaracteristico()
  {
		return elementoCaracteristicoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAtributo()
  {
		return atributoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAtributo_TipoValor()
  {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAtributo_CaracteristicaPai()
  {
		return (EReference)atributoEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCaracteristica()
  {
		return caracteristicaEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCaracteristica_CaracteristicaPai()
  {
		return (EReference)caracteristicaEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCaracteristica_CaracteristicaFilha()
  {
		return (EReference)caracteristicaEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCaracteristica_Variacoes()
  {
		return (EReference)caracteristicaEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCaracteristica_Atributo()
  {
		return (EReference)caracteristicaEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCaracteristicaRaiz()
  {
		return caracteristicaRaizEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCaracteristicaRaiz_LpsDoSistema()
  {
		return (EReference)caracteristicaRaizEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCaracteristicaOpcional()
  {
		return caracteristicaOpcionalEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCaracteristicaAgrupada()
  {
		return caracteristicaAgrupadaEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCaracteristicaMandatoria()
  {
		return caracteristicaMandatoriaEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVariacaoDois()
  {
		return variacaoDoisEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVariacaoDois_CardinalidadeMaxima()
  {
		return (EAttribute)variacaoDoisEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVariacaoDois_CardinalidadeMinimaOr()
  {
		return (EAttribute)variacaoDoisEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVariacaoDois_CardinalidadeMaximaOr()
  {
		return (EAttribute)variacaoDoisEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPontoDeVariacao()
  {
		return pontoDeVariacaoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVariacao()
  {
		return variacaoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVariacao_CardinalidadeMinima()
  {
		return (EAttribute)variacaoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVariacao_CardinalidadeMaxima()
  {
		return (EAttribute)variacaoEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariacao_Variantes()
  {
		return (EReference)variacaoEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariacao_CaracteristicaPai()
  {
		return (EReference)variacaoEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVariante()
  {
		return varianteEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariante_VariacaoPai()
  {
		return (EReference)varianteEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getOrigem()
  {
		return origemEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getValidade()
  {
		return validadeEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getQualidade()
  {
		return qualidadeEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getTipoValor()
  {
		return tipoValorEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getOperadorLogico()
  {
		return operadorLogicoEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getOperadorAcaoLogico()
  {
		return operadorAcaoLogicoEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getCardinalidadeMaxima()
  {
		return cardinalidadeMaximaEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getOperadorRelacional()
  {
		return operadorRelacionalEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getPresenca()
  {
		return presencaEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CaracteristicaFactory getCaracteristicaFactory()
  {
		return (CaracteristicaFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		lpsEClass = createEClass(LPS);
		createEReference(lpsEClass, LPS__ELEMENTOS);
		createEAttribute(lpsEClass, LPS__NOME);

		elementoEClass = createEClass(ELEMENTO);
		createEAttribute(elementoEClass, ELEMENTO__NOME);

		elementoCaracteristicoEClass = createEClass(ELEMENTO_CARACTERISTICO);

		atributoEClass = createEClass(ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__TIPO_VALOR);
		createEReference(atributoEClass, ATRIBUTO__CARACTERISTICA_PAI);

		caracteristicaEClass = createEClass(CARACTERISTICA);
		createEReference(caracteristicaEClass, CARACTERISTICA__CARACTERISTICA_PAI);
		createEReference(caracteristicaEClass, CARACTERISTICA__CARACTERISTICA_FILHA);
		createEReference(caracteristicaEClass, CARACTERISTICA__VARIACOES);
		createEReference(caracteristicaEClass, CARACTERISTICA__ATRIBUTO);

		caracteristicaRaizEClass = createEClass(CARACTERISTICA_RAIZ);
		createEReference(caracteristicaRaizEClass, CARACTERISTICA_RAIZ__LPS_DO_SISTEMA);

		caracteristicaOpcionalEClass = createEClass(CARACTERISTICA_OPCIONAL);

		caracteristicaAgrupadaEClass = createEClass(CARACTERISTICA_AGRUPADA);

		caracteristicaMandatoriaEClass = createEClass(CARACTERISTICA_MANDATORIA);

		variacaoDoisEClass = createEClass(VARIACAO_DOIS);
		createEAttribute(variacaoDoisEClass, VARIACAO_DOIS__CARDINALIDADE_MAXIMA);
		createEAttribute(variacaoDoisEClass, VARIACAO_DOIS__CARDINALIDADE_MINIMA_OR);
		createEAttribute(variacaoDoisEClass, VARIACAO_DOIS__CARDINALIDADE_MAXIMA_OR);

		pontoDeVariacaoEClass = createEClass(PONTO_DE_VARIACAO);

		variacaoEClass = createEClass(VARIACAO);
		createEAttribute(variacaoEClass, VARIACAO__CARDINALIDADE_MINIMA);
		createEAttribute(variacaoEClass, VARIACAO__CARDINALIDADE_MAXIMA);
		createEReference(variacaoEClass, VARIACAO__VARIANTES);
		createEReference(variacaoEClass, VARIACAO__CARACTERISTICA_PAI);

		varianteEClass = createEClass(VARIANTE);
		createEReference(varianteEClass, VARIANTE__VARIACAO_PAI);

		// Create enums
		origemEEnum = createEEnum(ORIGEM);
		validadeEEnum = createEEnum(VALIDADE);
		qualidadeEEnum = createEEnum(QUALIDADE);
		tipoValorEEnum = createEEnum(TIPO_VALOR);
		operadorLogicoEEnum = createEEnum(OPERADOR_LOGICO);
		operadorAcaoLogicoEEnum = createEEnum(OPERADOR_ACAO_LOGICO);
		cardinalidadeMaximaEEnum = createEEnum(CARDINALIDADE_MAXIMA);
		operadorRelacionalEEnum = createEEnum(OPERADOR_RELACIONAL);
		presencaEEnum = createEEnum(PRESENCA);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementoCaracteristicoEClass.getESuperTypes().add(this.getElemento());
		atributoEClass.getESuperTypes().add(this.getElemento());
		caracteristicaEClass.getESuperTypes().add(this.getElemento());
		caracteristicaRaizEClass.getESuperTypes().add(this.getCaracteristica());
		caracteristicaOpcionalEClass.getESuperTypes().add(this.getCaracteristica());
		caracteristicaOpcionalEClass.getESuperTypes().add(this.getElementoCaracteristico());
		caracteristicaAgrupadaEClass.getESuperTypes().add(this.getCaracteristica());
		caracteristicaAgrupadaEClass.getESuperTypes().add(this.getElementoCaracteristico());
		caracteristicaMandatoriaEClass.getESuperTypes().add(this.getCaracteristica());
		variacaoDoisEClass.getESuperTypes().add(this.getCaracteristica());
		variacaoDoisEClass.getESuperTypes().add(this.getElementoCaracteristico());
		variacaoEClass.getESuperTypes().add(this.getPontoDeVariacao());
		variacaoEClass.getESuperTypes().add(this.getElemento());
		varianteEClass.getESuperTypes().add(this.getPontoDeVariacao());
		varianteEClass.getESuperTypes().add(this.getElementoCaracteristico());
		varianteEClass.getESuperTypes().add(this.getCaracteristica());

		// Initialize classes and features; add operations and parameters
		initEClass(lpsEClass, caracteristica.LPS.class, "LPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPS_Elementos(), this.getElemento(), null, "elementos", null, 0, -1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLPS_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoEClass, Elemento.class, "Elemento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElemento_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Elemento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoCaracteristicoEClass, ElementoCaracteristico.class, "ElementoCaracteristico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributo_TipoValor(), this.getTipoValor(), "tipoValor", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtributo_CaracteristicaPai(), this.getCaracteristica(), this.getCaracteristica_Atributo(), "caracteristicaPai", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caracteristicaEClass, Caracteristica.class, "Caracteristica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaracteristica_CaracteristicaPai(), this.getCaracteristica(), this.getCaracteristica_CaracteristicaFilha(), "caracteristicaPai", null, 0, 1, Caracteristica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaracteristica_CaracteristicaFilha(), this.getCaracteristica(), this.getCaracteristica_CaracteristicaPai(), "caracteristicaFilha", null, 0, -1, Caracteristica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaracteristica_Variacoes(), this.getVariacao(), this.getVariacao_CaracteristicaPai(), "variacoes", null, 0, -1, Caracteristica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaracteristica_Atributo(), this.getAtributo(), this.getAtributo_CaracteristicaPai(), "atributo", null, 0, -1, Caracteristica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caracteristicaRaizEClass, CaracteristicaRaiz.class, "CaracteristicaRaiz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaracteristicaRaiz_LpsDoSistema(), this.getLPS(), null, "LpsDoSistema", null, 1, 1, CaracteristicaRaiz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caracteristicaOpcionalEClass, CaracteristicaOpcional.class, "CaracteristicaOpcional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(caracteristicaAgrupadaEClass, CaracteristicaAgrupada.class, "CaracteristicaAgrupada", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(caracteristicaMandatoriaEClass, CaracteristicaMandatoria.class, "CaracteristicaMandatoria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variacaoDoisEClass, VariacaoDois.class, "VariacaoDois", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariacaoDois_CardinalidadeMaxima(), this.getCardinalidadeMaxima(), "cardinalidadeMaxima", null, 0, 1, VariacaoDois.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariacaoDois_CardinalidadeMinimaOr(), ecorePackage.getEIntegerObject(), "cardinalidadeMinimaOr", null, 0, 1, VariacaoDois.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariacaoDois_CardinalidadeMaximaOr(), ecorePackage.getEIntegerObject(), "cardinalidadeMaximaOr", null, 0, 1, VariacaoDois.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pontoDeVariacaoEClass, PontoDeVariacao.class, "PontoDeVariacao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variacaoEClass, Variacao.class, "Variacao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariacao_CardinalidadeMinima(), ecorePackage.getEIntegerObject(), "cardinalidadeMinima", null, 0, 1, Variacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariacao_CardinalidadeMaxima(), ecorePackage.getEIntegerObject(), "cardinalidadeMaxima", null, 0, 1, Variacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariacao_Variantes(), this.getVariante(), this.getVariante_VariacaoPai(), "variantes", null, 0, -1, Variacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariacao_CaracteristicaPai(), this.getCaracteristica(), this.getCaracteristica_Variacoes(), "caracteristicaPai", null, 0, 1, Variacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varianteEClass, Variante.class, "Variante", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariante_VariacaoPai(), this.getVariacao(), this.getVariacao_Variantes(), "variacaoPai", null, 0, 1, Variante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(origemEEnum, Origem.class, "Origem");
		addEEnumLiteral(origemEEnum, Origem.SENTIDA);
		addEEnumLiteral(origemEEnum, Origem.USUARIO);
		addEEnumLiteral(origemEEnum, Origem.PERFIL);
		addEEnumLiteral(origemEEnum, Origem.DERIVADA);

		initEEnum(validadeEEnum, Validade.class, "Validade");
		addEEnumLiteral(validadeEEnum, Validade.VOLATIL);
		addEEnumLiteral(validadeEEnum, Validade.FREQUENTE);
		addEEnumLiteral(validadeEEnum, Validade.RARAMENTE);
		addEEnumLiteral(validadeEEnum, Validade.PERMANENTE);

		initEEnum(qualidadeEEnum, Qualidade.class, "Qualidade");
		addEEnumLiteral(qualidadeEEnum, Qualidade.BAIXO);
		addEEnumLiteral(qualidadeEEnum, Qualidade.ALTO);

		initEEnum(tipoValorEEnum, TipoValor.class, "TipoValor");
		addEEnumLiteral(tipoValorEEnum, TipoValor.TINTEGER);
		addEEnumLiteral(tipoValorEEnum, TipoValor.TSTRING);
		addEEnumLiteral(tipoValorEEnum, TipoValor.TFLOAT);
		addEEnumLiteral(tipoValorEEnum, TipoValor.TBOOLEAN);

		initEEnum(operadorLogicoEEnum, OperadorLogico.class, "OperadorLogico");
		addEEnumLiteral(operadorLogicoEEnum, OperadorLogico.AND);
		addEEnumLiteral(operadorLogicoEEnum, OperadorLogico.OR);

		initEEnum(operadorAcaoLogicoEEnum, OperadorAcaoLogico.class, "OperadorAcaoLogico");
		addEEnumLiteral(operadorAcaoLogicoEEnum, OperadorAcaoLogico.AND);

		initEEnum(cardinalidadeMaximaEEnum, CardinalidadeMaxima.class, "CardinalidadeMaxima");
		addEEnumLiteral(cardinalidadeMaximaEEnum, CardinalidadeMaxima.OR);
		addEEnumLiteral(cardinalidadeMaximaEEnum, CardinalidadeMaxima.XOR);

		initEEnum(operadorRelacionalEEnum, OperadorRelacional.class, "OperadorRelacional");
		addEEnumLiteral(operadorRelacionalEEnum, OperadorRelacional.MAIOR);
		addEEnumLiteral(operadorRelacionalEEnum, OperadorRelacional.MENOR);
		addEEnumLiteral(operadorRelacionalEEnum, OperadorRelacional.IGUAL);
		addEEnumLiteral(operadorRelacionalEEnum, OperadorRelacional.MAIORIGUAL);
		addEEnumLiteral(operadorRelacionalEEnum, OperadorRelacional.MENORIGUAL);
		addEEnumLiteral(operadorRelacionalEEnum, OperadorRelacional.DIFERENTE);

		initEEnum(presencaEEnum, Presenca.class, "Presenca");
		addEEnumLiteral(presencaEEnum, Presenca.PRESENTE);
		addEEnumLiteral(presencaEEnum, Presenca.AUSENTE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.link
		createGmf_2Annotations();
	}

  /**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmfAnnotations()
  {
		String source = "gmf.diagram";	
		addAnnotation
		  (lpsEClass, 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });
	}

  /**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_1Annotations()
  {
		String source = "gmf.node";	
		addAnnotation
		  (atributoEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "figure", "utils.TriangleFigure",
			 "label.pattern", "Attribute {0}"
		   });	
		addAnnotation
		  (caracteristicaRaizEClass, 
		   source, 
		   new String[] {
			 "label", "nome"
		   });	
		addAnnotation
		  (caracteristicaOpcionalEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "figure", "ellipse",
			 "border.style", "dash",
			 "border.width", "2"
		   });	
		addAnnotation
		  (caracteristicaAgrupadaEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "figure", "utils.TriangleFigure",
			 "border.style", "dash",
			 "border.width", "2"
		   });	
		addAnnotation
		  (caracteristicaMandatoriaEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "figure", "rectangle",
			 "border.style", "solid",
			 "border.width", "2"
		   });	
		addAnnotation
		  (variacaoDoisEClass, 
		   source, 
		   new String[] {
			 "label", "nome,cardinalidadeMaxima",
			 "label.pattern", "Variation {0} : {1} ",
			 "figure", "utils.DiamondFigure"
		   });
	}

  /**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_2Annotations()
  {
		String source = "gmf.link";	
		addAnnotation
		  (getCaracteristica_CaracteristicaFilha(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getCaracteristica_Variacoes(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getCaracteristica_Atributo(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getVariacao_Variantes(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });
	}

} //CaracteristicaPackageImpl
