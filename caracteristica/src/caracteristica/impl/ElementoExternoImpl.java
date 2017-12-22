/**
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.ElementoExterno;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elemento Externo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.ElementoExternoImpl#getNome <em>Nome</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementoExternoImpl extends EObjectImpl implements ElementoExterno
{
  /**
   * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNome()
   * @generated
   * @ordered
   */
  protected static final String NOME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNome()
   * @generated
   * @ordered
   */
  protected String nome = NOME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementoExternoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  
  protected EClass eStaticClass()
  {
    return CaracteristicaPackage.Literals.ELEMENTO_EXTERNO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNome()
  {
    return nome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNome(String newNome)
  {
    String oldNome = nome;
    nome = newNome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ELEMENTO_EXTERNO__NOME, oldNome, nome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CaracteristicaPackage.ELEMENTO_EXTERNO__NOME:
        return getNome();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CaracteristicaPackage.ELEMENTO_EXTERNO__NOME:
        setNome((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CaracteristicaPackage.ELEMENTO_EXTERNO__NOME:
        setNome(NOME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CaracteristicaPackage.ELEMENTO_EXTERNO__NOME:
        return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nome: ");
    result.append(nome);
    result.append(')');
    return result.toString();
  }

} //ElementoExternoImpl
