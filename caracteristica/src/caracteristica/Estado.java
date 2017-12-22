/**
 */
package caracteristica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Estado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.Estado#getNome <em>Nome</em>}</li>
 *   <li>{@link caracteristica.Estado#getProduto <em>Produto</em>}</li>
 *   <li>{@link caracteristica.Estado#isSafe <em>Safe</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getEstado()
 * @model annotation="gmf.node label='nome'"
 * @generated
 */
public interface Estado extends EObject
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
   * @see caracteristica.CaracteristicaPackage#getEstado_Nome()
   * @model
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link caracteristica.Estado#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

  /**
   * Returns the value of the '<em><b>Produto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Produto</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Produto</em>' reference.
   * @see #setProduto(CaracteristicaProduto)
   * @see caracteristica.CaracteristicaPackage#getEstado_Produto()
   * @model
   * @generated
   */
  CaracteristicaProduto getProduto();

  /**
   * Sets the value of the '{@link caracteristica.Estado#getProduto <em>Produto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Produto</em>' reference.
   * @see #getProduto()
   * @generated
   */
  void setProduto(CaracteristicaProduto value);

  /**
   * Returns the value of the '<em><b>Safe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Safe</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Safe</em>' attribute.
   * @see #setSafe(boolean)
   * @see caracteristica.CaracteristicaPackage#getEstado_Safe()
   * @model
   * @generated
   */
  boolean isSafe();

  /**
   * Sets the value of the '{@link caracteristica.Estado#isSafe <em>Safe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Safe</em>' attribute.
   * @see #isSafe()
   * @generated
   */
  void setSafe(boolean value);

} // Estado
