/**
 */
package uml2.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.Action;
import uml2.Classifier;
import uml2.Constraint;
import uml2.InputPin;
import uml2.OutputPin;
import uml2.Uml2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.ActionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link uml2.impl.ActionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link uml2.impl.ActionImpl#getIsLocallyReentrant <em>Is Locally Reentrant</em>}</li>
 *   <li>{@link uml2.impl.ActionImpl#getLocalPostcondition <em>Local Postcondition</em>}</li>
 *   <li>{@link uml2.impl.ActionImpl#getLocalPrecondition <em>Local Precondition</em>}</li>
 *   <li>{@link uml2.impl.ActionImpl#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActionImpl extends ExecutableNodeImpl implements Action {
	/**
	 * The default value of the '{@link #getIsLocallyReentrant() <em>Is Locally Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLocallyReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_LOCALLY_REENTRANT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsLocallyReentrant() <em>Is Locally Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLocallyReentrant()
	 * @generated
	 * @ordered
	 */
	protected Boolean isLocallyReentrant = IS_LOCALLY_REENTRANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocalPostcondition() <em>Local Postcondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPostcondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> localPostcondition;

	/**
	 * The cached value of the '{@link #getLocalPrecondition() <em>Local Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> localPrecondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getContext() {
		Classifier context = basicGetContext();
		return context != null && context.eIsProxy() ? (Classifier)eResolveProxy((InternalEObject)context) : context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetContext() {
		// TODO: implement this method to return the 'Context' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getInput() {
		// TODO: implement this method to return the 'Input' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsLocallyReentrant() {
		return isLocallyReentrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLocallyReentrant(Boolean newIsLocallyReentrant) {
		Boolean oldIsLocallyReentrant = isLocallyReentrant;
		isLocallyReentrant = newIsLocallyReentrant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.ACTION__IS_LOCALLY_REENTRANT, oldIsLocallyReentrant, isLocallyReentrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getLocalPostcondition() {
		if (localPostcondition == null) {
			localPostcondition = new EObjectContainmentEList<Constraint>(Constraint.class, this, Uml2Package.ACTION__LOCAL_POSTCONDITION);
		}
		return localPostcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getLocalPrecondition() {
		if (localPrecondition == null) {
			localPrecondition = new EObjectContainmentEList<Constraint>(Constraint.class, this, Uml2Package.ACTION__LOCAL_PRECONDITION);
		}
		return localPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getOutput() {
		// TODO: implement this method to return the 'Output' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier context() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.ACTION__LOCAL_POSTCONDITION:
				return ((InternalEList<?>)getLocalPostcondition()).basicRemove(otherEnd, msgs);
			case Uml2Package.ACTION__LOCAL_PRECONDITION:
				return ((InternalEList<?>)getLocalPrecondition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Uml2Package.ACTION__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case Uml2Package.ACTION__INPUT:
				return getInput();
			case Uml2Package.ACTION__IS_LOCALLY_REENTRANT:
				return getIsLocallyReentrant();
			case Uml2Package.ACTION__LOCAL_POSTCONDITION:
				return getLocalPostcondition();
			case Uml2Package.ACTION__LOCAL_PRECONDITION:
				return getLocalPrecondition();
			case Uml2Package.ACTION__OUTPUT:
				return getOutput();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Uml2Package.ACTION__IS_LOCALLY_REENTRANT:
				setIsLocallyReentrant((Boolean)newValue);
				return;
			case Uml2Package.ACTION__LOCAL_POSTCONDITION:
				getLocalPostcondition().clear();
				getLocalPostcondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case Uml2Package.ACTION__LOCAL_PRECONDITION:
				getLocalPrecondition().clear();
				getLocalPrecondition().addAll((Collection<? extends Constraint>)newValue);
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
			case Uml2Package.ACTION__IS_LOCALLY_REENTRANT:
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case Uml2Package.ACTION__LOCAL_POSTCONDITION:
				getLocalPostcondition().clear();
				return;
			case Uml2Package.ACTION__LOCAL_PRECONDITION:
				getLocalPrecondition().clear();
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
			case Uml2Package.ACTION__CONTEXT:
				return basicGetContext() != null;
			case Uml2Package.ACTION__INPUT:
				return !getInput().isEmpty();
			case Uml2Package.ACTION__IS_LOCALLY_REENTRANT:
				return IS_LOCALLY_REENTRANT_EDEFAULT == null ? isLocallyReentrant != null : !IS_LOCALLY_REENTRANT_EDEFAULT.equals(isLocallyReentrant);
			case Uml2Package.ACTION__LOCAL_POSTCONDITION:
				return localPostcondition != null && !localPostcondition.isEmpty();
			case Uml2Package.ACTION__LOCAL_PRECONDITION:
				return localPrecondition != null && !localPrecondition.isEmpty();
			case Uml2Package.ACTION__OUTPUT:
				return !getOutput().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Uml2Package.ACTION___CONTEXT:
				return context();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (isLocallyReentrant: ");
		result.append(isLocallyReentrant);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
