/**
 */
package caracteristica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.Elemento#getNome <em>Nome</em>}</li>
 * </ul>
 *
 * @see caracteristica.CaracteristicaPackage#getElemento()
 * @model
 * @generated
 */
public interface Elemento extends EObject
{
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
	 * @see caracteristica.CaracteristicaPackage#getElemento_Nome()
	 * @model
	 * @generated
	 */
  String getNome();

  /**
	 * Sets the value of the '{@link caracteristica.Elemento#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
  void setNome(String value);

} // Elemento
