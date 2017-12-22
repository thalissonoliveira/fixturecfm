/**
 */
package caracteristica.impl;

import caracteristica.Atributo;
import caracteristica.CaracteristicaPackage;
import caracteristica.CaracteristicaRaiz;
import caracteristica.Elemento;
import caracteristica.ElementoDeProduto;
import caracteristica.ElementoDeProduto;
import caracteristica.ElementoExterno;
import caracteristica.Expressao;
import caracteristica.InconsistenciaRegraAdaptacao;
import caracteristica.LPS;
import caracteristica.PontoDeVariacao;
import caracteristica.PontoDeVariacao;
import caracteristica.Produto;
import caracteristica.Regra;
import caracteristica.Simulacao;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LPS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.impl.LPSImpl#getElementos <em>Elementos</em>}</li>
 *   <li>{@link caracteristica.impl.LPSImpl#getNome <em>Nome</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPSImpl extends EObjectImpl implements LPS
{
  /**
	 * The cached value of the '{@link #getElementos() <em>Elementos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getElementos()
	 * @generated
	 * @ordered
	 */
  protected EList<Elemento> elementos;

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
  protected LPSImpl()
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
		return CaracteristicaPackage.Literals.LPS;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Elemento> getElementos()
  {
		if (elementos == null) {
			elementos = new EObjectContainmentEList<Elemento>(Elemento.class, this, CaracteristicaPackage.LPS__ELEMENTOS);
		}
		return elementos;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.LPS__NOME, oldNome, nome));
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
			case CaracteristicaPackage.LPS__ELEMENTOS:
				return ((InternalEList<?>)getElementos()).basicRemove(otherEnd, msgs);
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
			case CaracteristicaPackage.LPS__ELEMENTOS:
				return getElementos();
			case CaracteristicaPackage.LPS__NOME:
				return getNome();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
		@Override
  
  
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case CaracteristicaPackage.LPS__ELEMENTOS:
				getElementos().clear();
				getElementos().addAll((Collection<? extends Elemento>)newValue);
				return;
			case CaracteristicaPackage.LPS__NOME:
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
  
  
  @Override
		public void eUnset(int featureID)
  {
		switch (featureID) {
			case CaracteristicaPackage.LPS__ELEMENTOS:
				getElementos().clear();
				return;
			case CaracteristicaPackage.LPS__NOME:
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
  
  
  @Override
		public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case CaracteristicaPackage.LPS__ELEMENTOS:
				return elementos != null && !elementos.isEmpty();
			case CaracteristicaPackage.LPS__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
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
		result.append(" (nome: ");
		result.append(nome);
		result.append(')');
		return result.toString();
	}

} //LPSImpl
