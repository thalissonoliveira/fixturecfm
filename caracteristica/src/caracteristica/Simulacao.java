/**
 */
package caracteristica;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulacao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.Simulacao#getNome <em>Nome</em>}</li>
 *   <li>{@link caracteristica.Simulacao#getTransicoes <em>Transicoes</em>}</li>
 *   <li>{@link caracteristica.Simulacao#getEstados <em>Estados</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getSimulacao()
 * @model annotation="gmf.node label='nome' label.pattern='Simulation {0}'"
 * @generated
 */
public interface Simulacao extends EObject
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
   * @see caracteristica.CaracteristicaPackage#getSimulacao_Nome()
   * @model
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link caracteristica.Simulacao#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

  /**
   * Returns the value of the '<em><b>Transicoes</b></em>' containment reference list.
   * The list contents are of type {@link caracteristica.Transicao}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transicoes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transicoes</em>' containment reference list.
   * @see caracteristica.CaracteristicaPackage#getSimulacao_Transicoes()
   * @model containment="true"
   * @generated
   */
  EList<Transicao> getTransicoes();

  /**
   * Returns the value of the '<em><b>Estados</b></em>' containment reference list.
   * The list contents are of type {@link caracteristica.Estado}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estados</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estados</em>' containment reference list.
   * @see caracteristica.CaracteristicaPackage#getSimulacao_Estados()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<Estado> getEstados();

} // Simulacao
