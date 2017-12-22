/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expressao Relacional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.ExpressaoRelacional#getVariaveldaExpressao <em>Variavelda Expressao</em>}</li>
 *   <li>{@link caracteristica.ExpressaoRelacional#getOperadorRelacional <em>Operador Relacional</em>}</li>
 *   <li>{@link caracteristica.ExpressaoRelacional#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getExpressaoRelacional()
 * @model annotation="gmf.node label='nome'"
 * @generated
 */
public interface ExpressaoRelacional extends Antecedente
{
  /**
   * Returns the value of the '<em><b>Variavelda Expressao</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variavelda Expressao</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variavelda Expressao</em>' reference.
   * @see #setVariaveldaExpressao(Atributo)
   * @see caracteristica.CaracteristicaPackage#getExpressaoRelacional_VariaveldaExpressao()
   * @model
   * @generated
   */
  Atributo getVariaveldaExpressao();

  /**
   * Sets the value of the '{@link caracteristica.ExpressaoRelacional#getVariaveldaExpressao <em>Variavelda Expressao</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variavelda Expressao</em>' reference.
   * @see #getVariaveldaExpressao()
   * @generated
   */
  void setVariaveldaExpressao(Atributo value);

  /**
   * Returns the value of the '<em><b>Operador Relacional</b></em>' attribute.
   * The literals are from the enumeration {@link caracteristica.OperadorRelacional}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operador Relacional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operador Relacional</em>' attribute.
   * @see caracteristica.OperadorRelacional
   * @see #setOperadorRelacional(OperadorRelacional)
   * @see caracteristica.CaracteristicaPackage#getExpressaoRelacional_OperadorRelacional()
   * @model
   * @generated
   */
  OperadorRelacional getOperadorRelacional();

  /**
   * Sets the value of the '{@link caracteristica.ExpressaoRelacional#getOperadorRelacional <em>Operador Relacional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operador Relacional</em>' attribute.
   * @see caracteristica.OperadorRelacional
   * @see #getOperadorRelacional()
   * @generated
   */
  void setOperadorRelacional(OperadorRelacional value);

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
   * @see caracteristica.CaracteristicaPackage#getExpressaoRelacional_Valor()
   * @model
   * @generated
   */
  String getValor();

  /**
   * Sets the value of the '{@link caracteristica.ExpressaoRelacional#getValor <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor</em>' attribute.
   * @see #getValor()
   * @generated
   */
  void setValor(String value);

} // ExpressaoRelacional
