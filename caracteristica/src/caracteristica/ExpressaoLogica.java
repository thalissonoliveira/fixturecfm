/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expressao Logica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.ExpressaoLogica#getLadoDireitoComposicao <em>Lado Direito Composicao</em>}</li>
 *   <li>{@link caracteristica.ExpressaoLogica#getOperadorLogico <em>Operador Logico</em>}</li>
 *   <li>{@link caracteristica.ExpressaoLogica#getLadoEsquerdoComposicao <em>Lado Esquerdo Composicao</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getExpressaoLogica()
 * @model annotation="gmf.node label='operadorLogico'"
 * @generated
 */
public interface ExpressaoLogica extends Antecedente
{
  /**
   * Returns the value of the '<em><b>Lado Direito Composicao</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lado Direito Composicao</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lado Direito Composicao</em>' reference.
   * @see #setLadoDireitoComposicao(Antecedente)
   * @see caracteristica.CaracteristicaPackage#getExpressaoLogica_LadoDireitoComposicao()
   * @model annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' width='3'"
   * @generated
   */
  Antecedente getLadoDireitoComposicao();

  /**
   * Sets the value of the '{@link caracteristica.ExpressaoLogica#getLadoDireitoComposicao <em>Lado Direito Composicao</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lado Direito Composicao</em>' reference.
   * @see #getLadoDireitoComposicao()
   * @generated
   */
  void setLadoDireitoComposicao(Antecedente value);

  /**
   * Returns the value of the '<em><b>Operador Logico</b></em>' attribute.
   * The literals are from the enumeration {@link caracteristica.OperadorLogico}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operador Logico</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operador Logico</em>' attribute.
   * @see caracteristica.OperadorLogico
   * @see #setOperadorLogico(OperadorLogico)
   * @see caracteristica.CaracteristicaPackage#getExpressaoLogica_OperadorLogico()
   * @model
   * @generated
   */
  OperadorLogico getOperadorLogico();

  /**
   * Sets the value of the '{@link caracteristica.ExpressaoLogica#getOperadorLogico <em>Operador Logico</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operador Logico</em>' attribute.
   * @see caracteristica.OperadorLogico
   * @see #getOperadorLogico()
   * @generated
   */
  void setOperadorLogico(OperadorLogico value);

  /**
   * Returns the value of the '<em><b>Lado Esquerdo Composicao</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lado Esquerdo Composicao</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lado Esquerdo Composicao</em>' reference.
   * @see #setLadoEsquerdoComposicao(Antecedente)
   * @see caracteristica.CaracteristicaPackage#getExpressaoLogica_LadoEsquerdoComposicao()
   * @model annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' width='3'"
   * @generated
   */
  Antecedente getLadoEsquerdoComposicao();

  /**
   * Sets the value of the '{@link caracteristica.ExpressaoLogica#getLadoEsquerdoComposicao <em>Lado Esquerdo Composicao</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lado Esquerdo Composicao</em>' reference.
   * @see #getLadoEsquerdoComposicao()
   * @generated
   */
  void setLadoEsquerdoComposicao(Antecedente value);

} // ExpressaoLogica
