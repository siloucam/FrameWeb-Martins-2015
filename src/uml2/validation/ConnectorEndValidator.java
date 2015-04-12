/**
 *
 * $Id$
 */
package uml2.validation;

import uml2.ConnectableElement;
import uml2.Property;

/**
 * A sample validator interface for {@link uml2.ConnectorEnd}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConnectorEndValidator {
	boolean validate();

	boolean validateDefiningEnd(Property value);
	boolean validatePartWithPort(Property value);
	boolean validateRole(ConnectableElement value);
}
