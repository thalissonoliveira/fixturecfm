/**
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.CaracteristicaRaiz;
import caracteristica.LPS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raiz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.impl.CaracteristicaRaizImpl#getLpsDoSistema <em>Lps Do Sistema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaracteristicaRaizImpl extends CaracteristicaImpl implements CaracteristicaRaiz
{
  /**
	 * The cached value of the '{@link #getLpsDoSistema() <em>Lps Do Sistema</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLpsDoSistema()
	 * @generated
	 * @ordered
	 */
  protected LPS lpsDoSistema;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CaracteristicaRaizImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		protected EClass eStaticClass()
  {
		return CaracteristicaPackage.Literals.CARACTERISTICA_RAIZ;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LPS getLpsDoSistema()
  {
		if (lpsDoSistema != null && lpsDoSistema.eIsProxy()) {
			InternalEObject oldLpsDoSistema = (InternalEObject)lpsDoSistema;
			lpsDoSistema = (LPS)eResolveProxy(oldLpsDoSistema);
			if (lpsDoSistema != oldLpsDoSistema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.CARACTERISTICA_RAIZ__LPS_DO_SISTEMA, oldLpsDoSistema, lpsDoSistema));
			}
		}
		return lpsDoSistema;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LPS basicGetLpsDoSistema()
  {
		return lpsDoSistema;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLpsDoSistema(LPS newLpsDoSistema)
  {
		LPS oldLpsDoSistema = lpsDoSistema;
		lpsDoSistema = newLpsDoSistema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.CARACTERISTICA_RAIZ__LPS_DO_SISTEMA, oldLpsDoSistema, lpsDoSistema));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case CaracteristicaPackage.CARACTERISTICA_RAIZ__LPS_DO_SISTEMA:
				if (resolve) return getLpsDoSistema();
				return basicGetLpsDoSistema();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case CaracteristicaPackage.CARACTERISTICA_RAIZ__LPS_DO_SISTEMA:
				setLpsDoSistema((LPS)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public void eUnset(int featureID)
  {
		switch (featureID) {
			case CaracteristicaPackage.CARACTERISTICA_RAIZ__LPS_DO_SISTEMA:
				setLpsDoSistema((LPS)null);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case CaracteristicaPackage.CARACTERISTICA_RAIZ__LPS_DO_SISTEMA:
				return lpsDoSistema != null;
		}
		return super.eIsSet(featureID);
	}

} //CaracteristicaRaizImpl
