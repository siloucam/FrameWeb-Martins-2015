/**
 */
package frameweb.impl;

import frameweb.Generation;
import frameweb.IdAttribute;
import frameweb.framewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Id Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.IdAttributeImpl#getGeneration <em>Generation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdAttributeImpl extends DomainAttributeImpl implements IdAttribute {
	/**
	 * The default value of the '{@link #getGeneration() <em>Generation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneration()
	 * @generated
	 * @ordered
	 */
	protected static final Generation GENERATION_EDEFAULT = Generation.AUTO;

	/**
	 * The cached value of the '{@link #getGeneration() <em>Generation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneration()
	 * @generated
	 * @ordered
	 */
	protected Generation generation = GENERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return framewebPackage.Literals.ID_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generation getGeneration() {
		return generation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneration(Generation newGeneration) {
		Generation oldGeneration = generation;
		generation = newGeneration == null ? GENERATION_EDEFAULT : newGeneration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.ID_ATTRIBUTE__GENERATION, oldGeneration, generation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case framewebPackage.ID_ATTRIBUTE__GENERATION:
				return getGeneration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case framewebPackage.ID_ATTRIBUTE__GENERATION:
				setGeneration((Generation)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case framewebPackage.ID_ATTRIBUTE__GENERATION:
				setGeneration(GENERATION_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case framewebPackage.ID_ATTRIBUTE__GENERATION:
				return generation != GENERATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (generation: ");
		result.append(generation);
		result.append(')');
		return result.toString();
	}

} //IdAttributeImpl
