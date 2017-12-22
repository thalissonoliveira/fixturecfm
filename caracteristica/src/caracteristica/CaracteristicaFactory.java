/**
 */
package caracteristica;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see caracteristica.CaracteristicaPackage
 * @generated
 */
public interface CaracteristicaFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  CaracteristicaFactory eINSTANCE = caracteristica.impl.CaracteristicaFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>LPS</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>LPS</em>'.
	 * @generated
	 */
  LPS createLPS();

  /**
	 * Returns a new object of class '<em>Elemento</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elemento</em>'.
	 * @generated
	 */
  Elemento createElemento();

  /**
	 * Returns a new object of class '<em>Elemento Caracteristico</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elemento Caracteristico</em>'.
	 * @generated
	 */
  ElementoCaracteristico createElementoCaracteristico();

  /**
	 * Returns a new object of class '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo</em>'.
	 * @generated
	 */
  Atributo createAtributo();

  /**
	 * Returns a new object of class '<em>Caracteristica</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caracteristica</em>'.
	 * @generated
	 */
  Caracteristica createCaracteristica();

  /**
	 * Returns a new object of class '<em>Raiz</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raiz</em>'.
	 * @generated
	 */
  CaracteristicaRaiz createCaracteristicaRaiz();

  /**
	 * Returns a new object of class '<em>Opcional</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opcional</em>'.
	 * @generated
	 */
  CaracteristicaOpcional createCaracteristicaOpcional();

  /**
	 * Returns a new object of class '<em>Agrupada</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agrupada</em>'.
	 * @generated
	 */
  CaracteristicaAgrupada createCaracteristicaAgrupada();

  /**
	 * Returns a new object of class '<em>Mandatoria</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mandatoria</em>'.
	 * @generated
	 */
  CaracteristicaMandatoria createCaracteristicaMandatoria();

  /**
	 * Returns a new object of class '<em>Variacao Dois</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variacao Dois</em>'.
	 * @generated
	 */
  VariacaoDois createVariacaoDois();

  /**
	 * Returns a new object of class '<em>Ponto De Variacao</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ponto De Variacao</em>'.
	 * @generated
	 */
  PontoDeVariacao createPontoDeVariacao();

  /**
	 * Returns a new object of class '<em>Variacao</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variacao</em>'.
	 * @generated
	 */
  Variacao createVariacao();

  /**
	 * Returns a new object of class '<em>Variante</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variante</em>'.
	 * @generated
	 */
  Variante createVariante();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  CaracteristicaPackage getCaracteristicaPackage();

} //CaracteristicaFactory
