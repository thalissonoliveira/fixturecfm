/**
 */
package caracteristica.util;

import caracteristica.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see caracteristica.CaracteristicaPackage
 * @generated
 */
public class CaracteristicaAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static CaracteristicaPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CaracteristicaAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = CaracteristicaPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  
  
  @Override
		public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CaracteristicaSwitch<Adapter> modelSwitch =
    new CaracteristicaSwitch<Adapter>() {
			@Override
			public Adapter caseLPS(LPS object) {
				return createLPSAdapter();
			}
			@Override
			public Adapter caseElemento(Elemento object) {
				return createElementoAdapter();
			}
			@Override
			public Adapter caseElementoCaracteristico(ElementoCaracteristico object) {
				return createElementoCaracteristicoAdapter();
			}
			@Override
			public Adapter caseAtributo(Atributo object) {
				return createAtributoAdapter();
			}
			@Override
			public Adapter caseCaracteristica(Caracteristica object) {
				return createCaracteristicaAdapter();
			}
			@Override
			public Adapter caseCaracteristicaRaiz(CaracteristicaRaiz object) {
				return createCaracteristicaRaizAdapter();
			}
			@Override
			public Adapter caseCaracteristicaOpcional(CaracteristicaOpcional object) {
				return createCaracteristicaOpcionalAdapter();
			}
			@Override
			public Adapter caseCaracteristicaAgrupada(CaracteristicaAgrupada object) {
				return createCaracteristicaAgrupadaAdapter();
			}
			@Override
			public Adapter caseCaracteristicaMandatoria(CaracteristicaMandatoria object) {
				return createCaracteristicaMandatoriaAdapter();
			}
			@Override
			public Adapter caseVariacaoDois(VariacaoDois object) {
				return createVariacaoDoisAdapter();
			}
			@Override
			public Adapter casePontoDeVariacao(PontoDeVariacao object) {
				return createPontoDeVariacaoAdapter();
			}
			@Override
			public Adapter caseVariacao(Variacao object) {
				return createVariacaoAdapter();
			}
			@Override
			public Adapter caseVariante(Variante object) {
				return createVarianteAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  
  
  @Override
		public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link caracteristica.LPS <em>LPS</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caracteristica.LPS
	 * @generated
	 */
  public Adapter createLPSAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link caracteristica.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caracteristica.Elemento
	 * @generated
	 */
  public Adapter createElementoAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link caracteristica.ElementoCaracteristico <em>Elemento Caracteristico</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caracteristica.ElementoCaracteristico
	 * @generated
	 */
  public Adapter createElementoCaracteristicoAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link caracteristica.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caracteristica.Atributo
	 * @generated
	 */
  public Adapter createAtributoAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link caracteristica.Caracteristica <em>Caracteristica</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caracteristica.Caracteristica
	 * @generated
	 */
  public Adapter createCaracteristicaAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link caracteristica.CaracteristicaRaiz <em>Raiz</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caracteristica.CaracteristicaRaiz
	 * @generated
	 */
  public Adapter createCaracteristicaRaizAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link caracteristica.CaracteristicaOpcional <em>Opcional</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caracteristica.CaracteristicaOpcional
	 * @generated
	 */
  public Adapter createCaracteristicaOpcionalAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link caracteristica.CaracteristicaAgrupada <em>Agrupada</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caracteristica.CaracteristicaAgrupada
	 * @generated
	 */
  public Adapter createCaracteristicaAgrupadaAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link caracteristica.CaracteristicaMandatoria <em>Mandatoria</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caracteristica.CaracteristicaMandatoria
	 * @generated
	 */
  public Adapter createCaracteristicaMandatoriaAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link caracteristica.VariacaoDois <em>Variacao Dois</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caracteristica.VariacaoDois
	 * @generated
	 */
  public Adapter createVariacaoDoisAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link caracteristica.PontoDeVariacao <em>Ponto De Variacao</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caracteristica.PontoDeVariacao
	 * @generated
	 */
  public Adapter createPontoDeVariacaoAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link caracteristica.Variacao <em>Variacao</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caracteristica.Variacao
	 * @generated
	 */
  public Adapter createVariacaoAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link caracteristica.Variante <em>Variante</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caracteristica.Variante
	 * @generated
	 */
  public Adapter createVarianteAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //CaracteristicaAdapterFactory
