/**
 *
 * $Id$
 */
package uml2.validation;

import org.eclipse.emf.common.util.EList;

import uml2.Constraint;
import uml2.ExtensionPoint;
import uml2.UseCase;

/**
 * A sample validator interface for {@link uml2.Extend}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExtendValidator {
	boolean validate();

	boolean validateCondition(Constraint value);
	boolean validateExtendedCase(UseCase value);
	boolean validateExtensionLocation(EList<ExtensionPoint> value);
	boolean validateExtension(UseCase value);
}
