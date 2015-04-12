/**
 */
package uml2.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import uml2.Interface;
import uml2.Port;
import uml2.ProtocolStateMachine;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.PortImpl#getIsBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link uml2.impl.PortImpl#getIsConjugated <em>Is Conjugated</em>}</li>
 *   <li>{@link uml2.impl.PortImpl#getIsService <em>Is Service</em>}</li>
 *   <li>{@link uml2.impl.PortImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link uml2.impl.PortImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link uml2.impl.PortImpl#getRedefinedPort <em>Redefined Port</em>}</li>
 *   <li>{@link uml2.impl.PortImpl#getRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends PropertyImpl implements Port {
	/**
	 * The default value of the '{@link #getIsBehavior() <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_BEHAVIOR_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsBehavior() <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBehavior()
	 * @generated
	 * @ordered
	 */
	protected Boolean isBehavior = IS_BEHAVIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsConjugated() <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConjugated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONJUGATED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsConjugated() <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConjugated()
	 * @generated
	 * @ordered
	 */
	protected Boolean isConjugated = IS_CONJUGATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsService()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SERVICE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsService()
	 * @generated
	 * @ordered
	 */
	protected Boolean isService = IS_SERVICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ProtocolStateMachine protocol;

	/**
	 * The cached value of the '{@link #getRedefinedPort() <em>Redefined Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> redefinedPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsBehavior() {
		return isBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBehavior(Boolean newIsBehavior) {
		Boolean oldIsBehavior = isBehavior;
		isBehavior = newIsBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.PORT__IS_BEHAVIOR, oldIsBehavior, isBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsConjugated() {
		return isConjugated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConjugated(Boolean newIsConjugated) {
		Boolean oldIsConjugated = isConjugated;
		isConjugated = newIsConjugated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.PORT__IS_CONJUGATED, oldIsConjugated, isConjugated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsService() {
		return isService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsService(Boolean newIsService) {
		Boolean oldIsService = isService;
		isService = newIsService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.PORT__IS_SERVICE, oldIsService, isService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine getProtocol() {
		if (protocol != null && protocol.eIsProxy()) {
			InternalEObject oldProtocol = (InternalEObject)protocol;
			protocol = (ProtocolStateMachine)eResolveProxy(oldProtocol);
			if (protocol != oldProtocol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2Package.PORT__PROTOCOL, oldProtocol, protocol));
			}
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine basicGetProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProtocolStateMachine newProtocol) {
		ProtocolStateMachine oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.PORT__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getProvided() {
		// TODO: implement this method to return the 'Provided' reference list
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
	public EList<Port> getRedefinedPort() {
		if (redefinedPort == null) {
			redefinedPort = new EObjectResolvingEList<Port>(Port.class, this, Uml2Package.PORT__REDEFINED_PORT);
		}
		return redefinedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRequired() {
		// TODO: implement this method to return the 'Required' reference list
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
	public boolean portDestroyed(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.PORT__PORT_DESTROYED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "portDestroyed", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean defaultValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.PORT__DEFAULT_VALUE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "defaultValue", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean portAggregation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.PORT__PORT_AGGREGATION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "portAggregation", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> provided() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> required() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Uml2Package.PORT__IS_BEHAVIOR:
				return getIsBehavior();
			case Uml2Package.PORT__IS_CONJUGATED:
				return getIsConjugated();
			case Uml2Package.PORT__IS_SERVICE:
				return getIsService();
			case Uml2Package.PORT__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case Uml2Package.PORT__PROVIDED:
				return getProvided();
			case Uml2Package.PORT__REDEFINED_PORT:
				return getRedefinedPort();
			case Uml2Package.PORT__REQUIRED:
				return getRequired();
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
			case Uml2Package.PORT__IS_BEHAVIOR:
				setIsBehavior((Boolean)newValue);
				return;
			case Uml2Package.PORT__IS_CONJUGATED:
				setIsConjugated((Boolean)newValue);
				return;
			case Uml2Package.PORT__IS_SERVICE:
				setIsService((Boolean)newValue);
				return;
			case Uml2Package.PORT__PROTOCOL:
				setProtocol((ProtocolStateMachine)newValue);
				return;
			case Uml2Package.PORT__REDEFINED_PORT:
				getRedefinedPort().clear();
				getRedefinedPort().addAll((Collection<? extends Port>)newValue);
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
			case Uml2Package.PORT__IS_BEHAVIOR:
				setIsBehavior(IS_BEHAVIOR_EDEFAULT);
				return;
			case Uml2Package.PORT__IS_CONJUGATED:
				setIsConjugated(IS_CONJUGATED_EDEFAULT);
				return;
			case Uml2Package.PORT__IS_SERVICE:
				setIsService(IS_SERVICE_EDEFAULT);
				return;
			case Uml2Package.PORT__PROTOCOL:
				setProtocol((ProtocolStateMachine)null);
				return;
			case Uml2Package.PORT__REDEFINED_PORT:
				getRedefinedPort().clear();
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
			case Uml2Package.PORT__IS_BEHAVIOR:
				return IS_BEHAVIOR_EDEFAULT == null ? isBehavior != null : !IS_BEHAVIOR_EDEFAULT.equals(isBehavior);
			case Uml2Package.PORT__IS_CONJUGATED:
				return IS_CONJUGATED_EDEFAULT == null ? isConjugated != null : !IS_CONJUGATED_EDEFAULT.equals(isConjugated);
			case Uml2Package.PORT__IS_SERVICE:
				return IS_SERVICE_EDEFAULT == null ? isService != null : !IS_SERVICE_EDEFAULT.equals(isService);
			case Uml2Package.PORT__PROTOCOL:
				return protocol != null;
			case Uml2Package.PORT__PROVIDED:
				return !getProvided().isEmpty();
			case Uml2Package.PORT__REDEFINED_PORT:
				return redefinedPort != null && !redefinedPort.isEmpty();
			case Uml2Package.PORT__REQUIRED:
				return !getRequired().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Uml2Package.PORT___PORT_DESTROYED__DIAGNOSTICCHAIN_MAP:
				return portDestroyed((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.PORT___DEFAULT_VALUE__DIAGNOSTICCHAIN_MAP:
				return defaultValue((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.PORT___PORT_AGGREGATION__DIAGNOSTICCHAIN_MAP:
				return portAggregation((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.PORT___PROVIDED:
				return provided();
			case Uml2Package.PORT___REQUIRED:
				return required();
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
		result.append(" (isBehavior: ");
		result.append(isBehavior);
		result.append(", isConjugated: ");
		result.append(isConjugated);
		result.append(", isService: ");
		result.append(isService);
		result.append(')');
		return result.toString();
	}

} //PortImpl
