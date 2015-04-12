/**
 *
 * $Id$
 */
package uml2.validation;

import uml2.UseCase;

/**
 * A sample validator interface for {@link uml2.ExtensionPoint}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExtensionPointValidator {
	boolean validate();

	boolean validateUseCase(UseCase value);
}
