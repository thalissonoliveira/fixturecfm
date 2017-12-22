/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raiz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.CaracteristicaRaiz#getLpsDoSistema <em>Lps Do Sistema</em>}</li>
 * </ul>
 *
 * @see caracteristica.CaracteristicaPackage#getCaracteristicaRaiz()
 * @model annotation="gmf.node label='nome'"
 * @generated
 */
public interface CaracteristicaRaiz extends Caracteristica
{
  /**
	 * Returns the value of the '<em><b>Lps Do Sistema</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lps Do Sistema</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Lps Do Sistema</em>' reference.
	 * @see #setLpsDoSistema(LPS)
	 * @see caracteristica.CaracteristicaPackage#getCaracteristicaRaiz_LpsDoSistema()
	 * @model required="true"
	 * @generated
	 */
  LPS getLpsDoSistema();

  /**
	 * Sets the value of the '{@link caracteristica.CaracteristicaRaiz#getLpsDoSistema <em>Lps Do Sistema</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lps Do Sistema</em>' reference.
	 * @see #getLpsDoSistema()
	 * @generated
	 */
  void setLpsDoSistema(LPS value);

} // CaracteristicaRaiz
