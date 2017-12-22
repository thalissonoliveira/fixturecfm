/**
 */
package caracteristica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raiz De Contexto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.RaizDeContexto#getEntidadesDeContexto <em>Entidades De Contexto</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getRaizDeContexto()
 * @model annotation="gmf.node label='nome'"
 * @generated
 */
public interface RaizDeContexto extends Elemento
{
  /**
   * Returns the value of the '<em><b>Entidades De Contexto</b></em>' reference list.
   * The list contents are of type {@link caracteristica.EntidadeDeContexto}.
   * It is bidirectional and its opposite is '{@link caracteristica.EntidadeDeContexto#getRaiz <em>Raiz</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entidades De Contexto</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entidades De Contexto</em>' reference list.
   * @see caracteristica.CaracteristicaPackage#getRaizDeContexto_EntidadesDeContexto()
   * @see caracteristica.EntidadeDeContexto#getRaiz
   * @model opposite="raiz"
   *        annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' width='3'"
   * @generated
   */
  EList<EntidadeDeContexto> getEntidadesDeContexto();

} // RaizDeContexto
