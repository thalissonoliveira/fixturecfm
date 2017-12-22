/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acao Logico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.AcaoLogico#getLadoEsquerdoAcao <em>Lado Esquerdo Acao</em>}</li>
 *   <li>{@link caracteristica.AcaoLogico#getOperadorAcaoLogico <em>Operador Acao Logico</em>}</li>
 *   <li>{@link caracteristica.AcaoLogico#getLadoDireitoAcao <em>Lado Direito Acao</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getAcaoLogico()
 * @model annotation="gmf.node label='operadorAcaoLogico'"
 * @generated
 */
public interface AcaoLogico extends Acao
{
  /**
   * Returns the value of the '<em><b>Lado Esquerdo Acao</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lado Esquerdo Acao</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lado Esquerdo Acao</em>' reference.
   * @see #setLadoEsquerdoAcao(Acao)
   * @see caracteristica.CaracteristicaPackage#getAcaoLogico_LadoEsquerdoAcao()
   * @model required="true"
   *        annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' width='3'"
   * @generated
   */
  Acao getLadoEsquerdoAcao();

  /**
   * Sets the value of the '{@link caracteristica.AcaoLogico#getLadoEsquerdoAcao <em>Lado Esquerdo Acao</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lado Esquerdo Acao</em>' reference.
   * @see #getLadoEsquerdoAcao()
   * @generated
   */
  void setLadoEsquerdoAcao(Acao value);

  /**
   * Returns the value of the '<em><b>Operador Acao Logico</b></em>' attribute.
   * The literals are from the enumeration {@link caracteristica.OperadorAcaoLogico}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operador Acao Logico</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operador Acao Logico</em>' attribute.
   * @see caracteristica.OperadorAcaoLogico
   * @see #setOperadorAcaoLogico(OperadorAcaoLogico)
   * @see caracteristica.CaracteristicaPackage#getAcaoLogico_OperadorAcaoLogico()
   * @model
   * @generated
   */
  OperadorAcaoLogico getOperadorAcaoLogico();

  /**
   * Sets the value of the '{@link caracteristica.AcaoLogico#getOperadorAcaoLogico <em>Operador Acao Logico</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operador Acao Logico</em>' attribute.
   * @see caracteristica.OperadorAcaoLogico
   * @see #getOperadorAcaoLogico()
   * @generated
   */
  void setOperadorAcaoLogico(OperadorAcaoLogico value);

  /**
   * Returns the value of the '<em><b>Lado Direito Acao</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lado Direito Acao</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lado Direito Acao</em>' reference.
   * @see #setLadoDireitoAcao(Acao)
   * @see caracteristica.CaracteristicaPackage#getAcaoLogico_LadoDireitoAcao()
   * @model required="true"
   *        annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' width='3'"
   * @generated
   */
  Acao getLadoDireitoAcao();

  /**
   * Sets the value of the '{@link caracteristica.AcaoLogico#getLadoDireitoAcao <em>Lado Direito Acao</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lado Direito Acao</em>' reference.
   * @see #getLadoDireitoAcao()
   * @generated
   */
  void setLadoDireitoAcao(Acao value);

} // AcaoLogico
