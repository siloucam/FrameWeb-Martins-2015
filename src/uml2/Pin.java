/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A pin is an object node for inputs and outputs to actions.
 * A pin is a typed element and multiplicity element that provides values to actions and accept result values from them.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Pin#getIsControl <em>Is Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getPin()
 * @model abstract="true"
 * @generated
 */
public interface Pin extends MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Is Control</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether the pins provide data to the actions, or just controls when it executes it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Control</em>' attribute.
	 * @see #setIsControl(Boolean)
	 * @see uml2.Uml2Package#getPin_IsControl()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsControl();

	/**
	 * Sets the value of the '{@link uml2.Pin#getIsControl <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Control</em>' attribute.
	 * @see #getIsControl()
	 * @generated
	 */
	void setIsControl(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control pins have a control type
	 * isControl implies isControlType
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isControl implies isControlType'"
	 * @generated
	 */
	boolean controlPins(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Pin
