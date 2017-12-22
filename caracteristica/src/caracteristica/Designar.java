/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Designar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.Designar#getValor <em>Valor</em>}</li>
 *   <li>{@link caracteristica.Designar#getAtributo <em>Atributo</em>}</li>
 *   <li>{@link caracteristica.Designar#getTipoValor <em>Tipo Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getDesignar()
 * @model annotation="gmf.node label='nome'"
 * @generated
 */
public interface Designar extends Acao
{
  /**
   * Returns the value of the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor</em>' attribute.
   * @see #setValor(String)
   * @see caracteristica.CaracteristicaPackage#getDesignar_Valor()
   * @model
   * @generated
   */
  String getValor();

  /**
   * Sets the value of the '{@link caracteristica.Designar#getValor <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor</em>' attribute.
   * @see #getValor()
   * @generated
   */
  void setValor(String value);

  /**
   * Returns the value of the '<em><b>Atributo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atributo</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atributo</em>' reference.
   * @see #setAtributo(Atributo)
   * @see caracteristica.CaracteristicaPackage#getDesignar_Atributo()
   * @model
   * @generated
   */
  Atributo getAtributo();

  /**
   * Sets the value of the '{@link caracteristica.Designar#getAtributo <em>Atributo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atributo</em>' reference.
   * @see #getAtributo()
   * @generated
   */
  void setAtributo(Atributo value);

  /**
   * Returns the value of the '<em><b>Tipo Valor</b></em>' attribute.
   * The literals are from the enumeration {@link caracteristica.TipoValor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo Valor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo Valor</em>' attribute.
   * @see caracteristica.TipoValor
   * @see #setTipoValor(TipoValor)
   * @see caracteristica.CaracteristicaPackage#getDesignar_TipoValor()
   * @model
   * @generated
   */
  TipoValor getTipoValor();

  /**
   * Sets the value of the '{@link caracteristica.Designar#getTipoValor <em>Tipo Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo Valor</em>' attribute.
   * @see caracteristica.TipoValor
   * @see #getTipoValor()
   * @generated
   */
  void setTipoValor(TipoValor value);

} // Designar
