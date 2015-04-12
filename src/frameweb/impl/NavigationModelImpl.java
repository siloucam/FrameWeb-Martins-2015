/**
 */
package frameweb.impl;

import frameweb.ControllerPackage;
import frameweb.NavigationComposition;
import frameweb.NavigationDependency;
import frameweb.NavigationModel;
import frameweb.ViewPackage;
import frameweb.framewebPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.NavigationModelImpl#getNavigationUMLDependence <em>Navigation UML Dependence</em>}</li>
 *   <li>{@link frameweb.impl.NavigationModelImpl#getViewUMLPackage <em>View UML Package</em>}</li>
 *   <li>{@link frameweb.impl.NavigationModelImpl#getControllerUMLPackage <em>Controller UML Package</em>}</li>
 *   <li>{@link frameweb.impl.NavigationModelImpl#getNavigationUMLComposition <em>Navigation UML Composition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NavigationModelImpl extends FrameWebModelImpl implements NavigationModel {
	/**
	 * The cached value of the '{@link #getNavigationUMLDependence() <em>Navigation UML Dependence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationUMLDependence()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigationDependency> navigationUMLDependence;

	/**
	 * The cached value of the '{@link #getViewUMLPackage() <em>View UML Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewUMLPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewPackage> viewUMLPackage;

	/**
	 * The cached value of the '{@link #getControllerUMLPackage() <em>Controller UML Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerUMLPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ControllerPackage> controllerUMLPackage;

	/**
	 * The cached value of the '{@link #getNavigationUMLComposition() <em>Navigation UML Composition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationUMLComposition()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigationComposition> navigationUMLComposition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return framewebPackage.Literals.NAVIGATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NavigationDependency> getNavigationUMLDependence() {
		if (navigationUMLDependence == null) {
			navigationUMLDependence = new EObjectContainmentEList<NavigationDependency>(NavigationDependency.class, this, framewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_DEPENDENCE);
		}
		return navigationUMLDependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewPackage> getViewUMLPackage() {
		if (viewUMLPackage == null) {
			viewUMLPackage = new EObjectContainmentEList<ViewPackage>(ViewPackage.class, this, framewebPackage.NAVIGATION_MODEL__VIEW_UML_PACKAGE);
		}
		return viewUMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControllerPackage> getControllerUMLPackage() {
		if (controllerUMLPackage == null) {
			controllerUMLPackage = new EObjectContainmentEList<ControllerPackage>(ControllerPackage.class, this, framewebPackage.NAVIGATION_MODEL__CONTROLLER_UML_PACKAGE);
		}
		return controllerUMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NavigationComposition> getNavigationUMLComposition() {
		if (navigationUMLComposition == null) {
			navigationUMLComposition = new EObjectContainmentEList<NavigationComposition>(NavigationComposition.class, this, framewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_COMPOSITION);
		}
		return navigationUMLComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case framewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_DEPENDENCE:
				return ((InternalEList<?>)getNavigationUMLDependence()).basicRemove(otherEnd, msgs);
			case framewebPackage.NAVIGATION_MODEL__VIEW_UML_PACKAGE:
				return ((InternalEList<?>)getViewUMLPackage()).basicRemove(otherEnd, msgs);
			case framewebPackage.NAVIGATION_MODEL__CONTROLLER_UML_PACKAGE:
				return ((InternalEList<?>)getControllerUMLPackage()).basicRemove(otherEnd, msgs);
			case framewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_COMPOSITION:
				return ((InternalEList<?>)getNavigationUMLComposition()).basicRemove(otherEnd, msgs);
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
			case framewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_DEPENDENCE:
				return getNavigationUMLDependence();
			case framewebPackage.NAVIGATION_MODEL__VIEW_UML_PACKAGE:
				return getViewUMLPackage();
			case framewebPackage.NAVIGATION_MODEL__CONTROLLER_UML_PACKAGE:
				return getControllerUMLPackage();
			case framewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_COMPOSITION:
				return getNavigationUMLComposition();
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
			case framewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_DEPENDENCE:
				getNavigationUMLDependence().clear();
				getNavigationUMLDependence().addAll((Collection<? extends NavigationDependency>)newValue);
				return;
			case framewebPackage.NAVIGATION_MODEL__VIEW_UML_PACKAGE:
				getViewUMLPackage().clear();
				getViewUMLPackage().addAll((Collection<? extends ViewPackage>)newValue);
				return;
			case framewebPackage.NAVIGATION_MODEL__CONTROLLER_UML_PACKAGE:
				getControllerUMLPackage().clear();
				getControllerUMLPackage().addAll((Collection<? extends ControllerPackage>)newValue);
				return;
			case framewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_COMPOSITION:
				getNavigationUMLComposition().clear();
				getNavigationUMLComposition().addAll((Collection<? extends NavigationComposition>)newValue);
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
			case framewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_DEPENDENCE:
				getNavigationUMLDependence().clear();
				return;
			case framewebPackage.NAVIGATION_MODEL__VIEW_UML_PACKAGE:
				getViewUMLPackage().clear();
				return;
			case framewebPackage.NAVIGATION_MODEL__CONTROLLER_UML_PACKAGE:
				getControllerUMLPackage().clear();
				return;
			case framewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_COMPOSITION:
				getNavigationUMLComposition().clear();
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
			case framewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_DEPENDENCE:
				return navigationUMLDependence != null && !navigationUMLDependence.isEmpty();
			case framewebPackage.NAVIGATION_MODEL__VIEW_UML_PACKAGE:
				return viewUMLPackage != null && !viewUMLPackage.isEmpty();
			case framewebPackage.NAVIGATION_MODEL__CONTROLLER_UML_PACKAGE:
				return controllerUMLPackage != null && !controllerUMLPackage.isEmpty();
			case framewebPackage.NAVIGATION_MODEL__NAVIGATION_UML_COMPOSITION:
				return navigationUMLComposition != null && !navigationUMLComposition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NavigationModelImpl
