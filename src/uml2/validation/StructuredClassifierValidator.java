/**
 *
 * $Id$
 */
package uml2.validation;

import org.eclipse.emf.common.util.EList;

import uml2.ConnectableElement;
import uml2.Connector;
import uml2.Property;

/**
 * A sample validator interface for {@link uml2.StructuredClassifier}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StructuredClassifierValidator {
	boolean validate();

	boolean validateOwnedAttribute(EList<Property> value);
	boolean validateOwnedConnector(EList<Connector> value);
	boolean validatePart(EList<Property> value);
	boolean validateRole(EList<ConnectableElement> value);
}
