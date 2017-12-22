/**
 */
package caracteristica;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transicao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.Transicao#getEAntigo <em>EAntigo</em>}</li>
 *   <li>{@link caracteristica.Transicao#getENovo <em>ENovo</em>}</li>
 *   <li>{@link caracteristica.Transicao#getRegrasQuebradas <em>Regras Quebradas</em>}</li>
 *   <li>{@link caracteristica.Transicao#getAcoes <em>Acoes</em>}</li>
 *   <li>{@link caracteristica.Transicao#isSafe <em>Safe</em>}</li>
 *   <li>{@link caracteristica.Transicao#getEtiqueta <em>Etiqueta</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getTransicao()
 * @model annotation="gmf.link source='eAntigo' target='eNovo' target.decoration='closedarrow' width='2' label='etiqueta'"
 * @generated
 */
public interface Transicao extends EObject
{
  /**
   * Returns the value of the '<em><b>EAntigo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EAntigo</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EAntigo</em>' reference.
   * @see #setEAntigo(Estado)
   * @see caracteristica.CaracteristicaPackage#getTransicao_EAntigo()
   * @model
   * @generated
   */
  Estado getEAntigo();

  /**
   * Sets the value of the '{@link caracteristica.Transicao#getEAntigo <em>EAntigo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EAntigo</em>' reference.
   * @see #getEAntigo()
   * @generated
   */
  void setEAntigo(Estado value);

  /**
   * Returns the value of the '<em><b>ENovo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ENovo</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ENovo</em>' reference.
   * @see #setENovo(Estado)
   * @see caracteristica.CaracteristicaPackage#getTransicao_ENovo()
   * @model
   * @generated
   */
  Estado getENovo();

  /**
   * Sets the value of the '{@link caracteristica.Transicao#getENovo <em>ENovo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ENovo</em>' reference.
   * @see #getENovo()
   * @generated
   */
  void setENovo(Estado value);

  /**
   * Returns the value of the '<em><b>Regras Quebradas</b></em>' reference list.
   * The list contents are of type {@link caracteristica.RegraDeComposicao}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regras Quebradas</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regras Quebradas</em>' reference list.
   * @see caracteristica.CaracteristicaPackage#getTransicao_RegrasQuebradas()
   * @model
   * @generated
   */
  EList<RegraDeComposicao> getRegrasQuebradas();

  /**
   * Returns the value of the '<em><b>Acoes</b></em>' reference list.
   * The list contents are of type {@link caracteristica.Acao}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acoes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acoes</em>' reference list.
   * @see caracteristica.CaracteristicaPackage#getTransicao_Acoes()
   * @model
   * @generated
   */
  EList<Acao> getAcoes();

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
   * @see caracteristica.CaracteristicaPackage#getTransicao_Safe()
   * @model
   * @generated
   */
  boolean isSafe();

  /**
   * Sets the value of the '{@link caracteristica.Transicao#isSafe <em>Safe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Safe</em>' attribute.
   * @see #isSafe()
   * @generated
   */
  void setSafe(boolean value);

  /**
   * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Etiqueta</em>' attribute.
   * @see #setEtiqueta(String)
   * @see caracteristica.CaracteristicaPackage#getTransicao_Etiqueta()
   * @model
   * @generated
   */
  String getEtiqueta();

  /**
   * Sets the value of the '{@link caracteristica.Transicao#getEtiqueta <em>Etiqueta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Etiqueta</em>' attribute.
   * @see #getEtiqueta()
   * @generated
   */
  void setEtiqueta(String value);

} // Transicao
