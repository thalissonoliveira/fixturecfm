/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regra De Composicao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.RegraDeComposicao#getAntecedente <em>Antecedente</em>}</li>
 *   <li>{@link caracteristica.RegraDeComposicao#getConsequente <em>Consequente</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getRegraDeComposicao()
 * @model annotation="gmf.node label='nome' label.pattern='Composition Rule {0}'"
 * @generated
 */
public interface RegraDeComposicao extends Regra
{
  /**
   * Returns the value of the '<em><b>Antecedente</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Antecedente</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Antecedente</em>' reference.
   * @see #setAntecedente(Antecedente)
   * @see caracteristica.CaracteristicaPackage#getRegraDeComposicao_Antecedente()
   * @model annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' label='antecedent'"
   * @generated
   */
  Antecedente getAntecedente();

  /**
   * Sets the value of the '{@link caracteristica.RegraDeComposicao#getAntecedente <em>Antecedente</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Antecedente</em>' reference.
   * @see #getAntecedente()
   * @generated
   */
  void setAntecedente(Antecedente value);

  /**
   * Returns the value of the '<em><b>Consequente</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Consequente</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Consequente</em>' reference.
   * @see #setConsequente(Antecedente)
   * @see caracteristica.CaracteristicaPackage#getRegraDeComposicao_Consequente()
   * @model annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' label='consequent'"
   * @generated
   */
  Antecedente getConsequente();

  /**
   * Sets the value of the '{@link caracteristica.RegraDeComposicao#getConsequente <em>Consequente</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Consequente</em>' reference.
   * @see #getConsequente()
   * @generated
   */
  void setConsequente(Antecedente value);

} // RegraDeComposicao
