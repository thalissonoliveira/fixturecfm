/**
 */
package caracteristica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Caracteristica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.Caracteristica#getCaracteristicaPai <em>Caracteristica Pai</em>}</li>
 *   <li>{@link caracteristica.Caracteristica#getCaracteristicaFilha <em>Caracteristica Filha</em>}</li>
 *   <li>{@link caracteristica.Caracteristica#getVariacoes <em>Variacoes</em>}</li>
 *   <li>{@link caracteristica.Caracteristica#getAtributo <em>Atributo</em>}</li>
 * </ul>
 *
 * @see caracteristica.CaracteristicaPackage#getCaracteristica()
 * @model
 * @generated
 */
public interface Caracteristica extends Elemento
{
  /**
	 * Returns the value of the '<em><b>Caracteristica Pai</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link caracteristica.Caracteristica#getCaracteristicaFilha <em>Caracteristica Filha</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caracteristica Pai</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Caracteristica Pai</em>' reference.
	 * @see #setCaracteristicaPai(Caracteristica)
	 * @see caracteristica.CaracteristicaPackage#getCaracteristica_CaracteristicaPai()
	 * @see caracteristica.Caracteristica#getCaracteristicaFilha
	 * @model opposite="caracteristicaFilha"
	 * @generated
	 */
  Caracteristica getCaracteristicaPai();

  /**
	 * Sets the value of the '{@link caracteristica.Caracteristica#getCaracteristicaPai <em>Caracteristica Pai</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caracteristica Pai</em>' reference.
	 * @see #getCaracteristicaPai()
	 * @generated
	 */
  void setCaracteristicaPai(Caracteristica value);

  /**
	 * Returns the value of the '<em><b>Caracteristica Filha</b></em>' reference list.
	 * The list contents are of type {@link caracteristica.Caracteristica}.
	 * It is bidirectional and its opposite is '{@link caracteristica.Caracteristica#getCaracteristicaPai <em>Caracteristica Pai</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caracteristica Filha</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Caracteristica Filha</em>' reference list.
	 * @see caracteristica.CaracteristicaPackage#getCaracteristica_CaracteristicaFilha()
	 * @see caracteristica.Caracteristica#getCaracteristicaPai
	 * @model opposite="caracteristicaPai"
	 *        annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' width='3'"
	 * @generated
	 */
  EList<Caracteristica> getCaracteristicaFilha();

  /**
	 * Returns the value of the '<em><b>Variacoes</b></em>' reference list.
	 * The list contents are of type {@link caracteristica.Variacao}.
	 * It is bidirectional and its opposite is '{@link caracteristica.Variacao#getCaracteristicaPai <em>Caracteristica Pai</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variacoes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variacoes</em>' reference list.
	 * @see caracteristica.CaracteristicaPackage#getCaracteristica_Variacoes()
	 * @see caracteristica.Variacao#getCaracteristicaPai
	 * @model opposite="caracteristicaPai"
	 *        annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' width='3'"
	 * @generated
	 */
  EList<Variacao> getVariacoes();

  /**
	 * Returns the value of the '<em><b>Atributo</b></em>' reference list.
	 * The list contents are of type {@link caracteristica.Atributo}.
	 * It is bidirectional and its opposite is '{@link caracteristica.Atributo#getCaracteristicaPai <em>Caracteristica Pai</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atributo</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributo</em>' reference list.
	 * @see caracteristica.CaracteristicaPackage#getCaracteristica_Atributo()
	 * @see caracteristica.Atributo#getCaracteristicaPai
	 * @model opposite="caracteristicaPai"
	 *        annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' width='3'"
	 * @generated
	 */
  EList<Atributo> getAtributo();

} // Caracteristica
