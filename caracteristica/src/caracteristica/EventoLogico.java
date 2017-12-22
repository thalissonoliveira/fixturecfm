/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evento Logico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.EventoLogico#getLadoDireitoEvento <em>Lado Direito Evento</em>}</li>
 *   <li>{@link caracteristica.EventoLogico#getOperadorLogico <em>Operador Logico</em>}</li>
 *   <li>{@link caracteristica.EventoLogico#getLadoEsquerdoEvento <em>Lado Esquerdo Evento</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getEventoLogico()
 * @model annotation="gmf.node label='operadorLogico'"
 * @generated
 */
public interface EventoLogico extends Evento
{
  /**
   * Returns the value of the '<em><b>Lado Direito Evento</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lado Direito Evento</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lado Direito Evento</em>' reference.
   * @see #setLadoDireitoEvento(Evento)
   * @see caracteristica.CaracteristicaPackage#getEventoLogico_LadoDireitoEvento()
   * @model annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' width='3'"
   * @generated
   */
  Evento getLadoDireitoEvento();

  /**
   * Sets the value of the '{@link caracteristica.EventoLogico#getLadoDireitoEvento <em>Lado Direito Evento</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lado Direito Evento</em>' reference.
   * @see #getLadoDireitoEvento()
   * @generated
   */
  void setLadoDireitoEvento(Evento value);

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
   * @see caracteristica.CaracteristicaPackage#getEventoLogico_OperadorLogico()
   * @model required="true"
   * @generated
   */
  OperadorLogico getOperadorLogico();

  /**
   * Sets the value of the '{@link caracteristica.EventoLogico#getOperadorLogico <em>Operador Logico</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operador Logico</em>' attribute.
   * @see caracteristica.OperadorLogico
   * @see #getOperadorLogico()
   * @generated
   */
  void setOperadorLogico(OperadorLogico value);

  /**
   * Returns the value of the '<em><b>Lado Esquerdo Evento</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lado Esquerdo Evento</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lado Esquerdo Evento</em>' reference.
   * @see #setLadoEsquerdoEvento(Evento)
   * @see caracteristica.CaracteristicaPackage#getEventoLogico_LadoEsquerdoEvento()
   * @model annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' width='3'"
   * @generated
   */
  Evento getLadoEsquerdoEvento();

  /**
   * Sets the value of the '{@link caracteristica.EventoLogico#getLadoEsquerdoEvento <em>Lado Esquerdo Evento</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lado Esquerdo Evento</em>' reference.
   * @see #getLadoEsquerdoEvento()
   * @generated
   */
  void setLadoEsquerdoEvento(Evento value);

} // EventoLogico
