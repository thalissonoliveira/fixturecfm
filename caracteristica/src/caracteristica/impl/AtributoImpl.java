/**
 */
package caracteristica.impl;

import caracteristica.Atributo;
import caracteristica.Caracteristica;
import caracteristica.CaracteristicaPackage;
import caracteristica.TipoValor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.impl.AtributoImpl#getTipoValor <em>Tipo Valor</em>}</li>
 *   <li>{@link caracteristica.impl.AtributoImpl#getCaracteristicaPai <em>Caracteristica Pai</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoImpl extends ElementoImpl implements Atributo
{
  /**
	 * The default value of the '{@link #getTipoValor() <em>Tipo Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTipoValor()
	 * @generated
	 * @ordered
	 */
  protected static final TipoValor TIPO_VALOR_EDEFAULT = TipoValor.TINTEGER;

  /**
	 * The cached value of the '{@link #getTipoValor() <em>Tipo Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTipoValor()
	 * @generated
	 * @ordered
	 */
  protected TipoValor tipoValor = TIPO_VALOR_EDEFAULT;

  /**
	 * The cached value of the '{@link #getCaracteristicaPai() <em>Caracteristica Pai</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCaracteristicaPai()
	 * @generated
	 * @ordered
	 */
  protected Caracteristica caracteristicaPai;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AtributoImpl()
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
		return CaracteristicaPackage.Literals.ATRIBUTO;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TipoValor getTipoValor()
  {
		return tipoValor;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTipoValor(TipoValor newTipoValor)
  {
		TipoValor oldTipoValor = tipoValor;
		tipoValor = newTipoValor == null ? TIPO_VALOR_EDEFAULT : newTipoValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ATRIBUTO__TIPO_VALOR, oldTipoValor, tipoValor));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Caracteristica getCaracteristicaPai()
  {
		if (caracteristicaPai != null && caracteristicaPai.eIsProxy()) {
			InternalEObject oldCaracteristicaPai = (InternalEObject)caracteristicaPai;
			caracteristicaPai = (Caracteristica)eResolveProxy(oldCaracteristicaPai);
			if (caracteristicaPai != oldCaracteristicaPai) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.ATRIBUTO__CARACTERISTICA_PAI, oldCaracteristicaPai, caracteristicaPai));
			}
		}
		return caracteristicaPai;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Caracteristica basicGetCaracteristicaPai()
  {
		return caracteristicaPai;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCaracteristicaPai(Caracteristica newCaracteristicaPai, NotificationChain msgs)
  {
		Caracteristica oldCaracteristicaPai = caracteristicaPai;
		caracteristicaPai = newCaracteristicaPai;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ATRIBUTO__CARACTERISTICA_PAI, oldCaracteristicaPai, newCaracteristicaPai);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCaracteristicaPai(Caracteristica newCaracteristicaPai)
  {
		if (newCaracteristicaPai != caracteristicaPai) {
			NotificationChain msgs = null;
			if (caracteristicaPai != null)
				msgs = ((InternalEObject)caracteristicaPai).eInverseRemove(this, CaracteristicaPackage.CARACTERISTICA__ATRIBUTO, Caracteristica.class, msgs);
			if (newCaracteristicaPai != null)
				msgs = ((InternalEObject)newCaracteristicaPai).eInverseAdd(this, CaracteristicaPackage.CARACTERISTICA__ATRIBUTO, Caracteristica.class, msgs);
			msgs = basicSetCaracteristicaPai(newCaracteristicaPai, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ATRIBUTO__CARACTERISTICA_PAI, newCaracteristicaPai, newCaracteristicaPai));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case CaracteristicaPackage.ATRIBUTO__CARACTERISTICA_PAI:
				if (caracteristicaPai != null)
					msgs = ((InternalEObject)caracteristicaPai).eInverseRemove(this, CaracteristicaPackage.CARACTERISTICA__ATRIBUTO, Caracteristica.class, msgs);
				return basicSetCaracteristicaPai((Caracteristica)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case CaracteristicaPackage.ATRIBUTO__CARACTERISTICA_PAI:
				return basicSetCaracteristicaPai(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case CaracteristicaPackage.ATRIBUTO__TIPO_VALOR:
				return getTipoValor();
			case CaracteristicaPackage.ATRIBUTO__CARACTERISTICA_PAI:
				if (resolve) return getCaracteristicaPai();
				return basicGetCaracteristicaPai();
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
			case CaracteristicaPackage.ATRIBUTO__TIPO_VALOR:
				setTipoValor((TipoValor)newValue);
				return;
			case CaracteristicaPackage.ATRIBUTO__CARACTERISTICA_PAI:
				setCaracteristicaPai((Caracteristica)newValue);
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
			case CaracteristicaPackage.ATRIBUTO__TIPO_VALOR:
				setTipoValor(TIPO_VALOR_EDEFAULT);
				return;
			case CaracteristicaPackage.ATRIBUTO__CARACTERISTICA_PAI:
				setCaracteristicaPai((Caracteristica)null);
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
			case CaracteristicaPackage.ATRIBUTO__TIPO_VALOR:
				return tipoValor != TIPO_VALOR_EDEFAULT;
			case CaracteristicaPackage.ATRIBUTO__CARACTERISTICA_PAI:
				return caracteristicaPai != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tipoValor: ");
		result.append(tipoValor);
		result.append(')');
		return result.toString();
	}

} //AtributoImpl
