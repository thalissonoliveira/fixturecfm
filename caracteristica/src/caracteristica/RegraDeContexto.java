/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regra De Contexto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.RegraDeContexto#getEvento <em>Evento</em>}</li>
 *   <li>{@link caracteristica.RegraDeContexto#getAcao <em>Acao</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getRegraDeContexto()
 * @model annotation="gmf.node label='nome' label.pattern='Regra de Contexto {0}'"
 * @generated
 */
public interface RegraDeContexto extends Regra
{
  /**
   * Returns the value of the '<em><b>Evento</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evento</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evento</em>' reference.
   * @see #setEvento(Evento)
   * @see caracteristica.CaracteristicaPackage#getRegraDeContexto_Evento()
   * @model annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' label='evento' width='3'"
   * @generated
   */
  Evento getEvento();

  /**
   * Sets the value of the '{@link caracteristica.RegraDeContexto#getEvento <em>Evento</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evento</em>' reference.
   * @see #getEvento()
   * @generated
   */
  void setEvento(Evento value);

  /**
   * Returns the value of the '<em><b>Acao</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acao</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acao</em>' reference.
   * @see #setAcao(Acao)
   * @see caracteristica.CaracteristicaPackage#getRegraDeContexto_Acao()
   * @model annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' label='a\347\343o' width='3'"
   * @generated
   */
  Acao getAcao();

  /**
   * Sets the value of the '{@link caracteristica.RegraDeContexto#getAcao <em>Acao</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acao</em>' reference.
   * @see #getAcao()
   * @generated
   */
  void setAcao(Acao value);

} // RegraDeContexto
