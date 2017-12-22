/**
 */
package caracteristica;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.LPS#getElementos <em>Elementos</em>}</li>
 *   <li>{@link caracteristica.LPS#getNome <em>Nome</em>}</li>
 * </ul>
 *
 * @see caracteristica.CaracteristicaPackage#getLPS()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface LPS extends EObject
{
  /**
	 * Returns the value of the '<em><b>Elementos</b></em>' containment reference list.
	 * The list contents are of type {@link caracteristica.Elemento}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elementos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementos</em>' containment reference list.
	 * @see caracteristica.CaracteristicaPackage#getLPS_Elementos()
	 * @model containment="true"
	 * @generated
	 */
  EList<Elemento> getElementos();

  /**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see caracteristica.CaracteristicaPackage#getLPS_Nome()
	 * @model
	 * @generated
	 */
  String getNome();

  /**
	 * Sets the value of the '{@link caracteristica.LPS#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
  void setNome(String value);

} // LPS
