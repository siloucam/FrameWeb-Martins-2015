/**
 *
 * $Id$
 */
package uml2.validation;

import org.eclipse.emf.common.util.EList;

import uml2.TemplateParameterSubstitution;
import uml2.TemplateSignature;
import uml2.TemplateableElement;

/**
 * A sample validator interface for {@link uml2.TemplateBinding}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TemplateBindingValidator {
	boolean validate();

	boolean validateParameterSubstitution(EList<TemplateParameterSubstitution> value);
	boolean validateSignature(TemplateSignature value);
	boolean validateBoundElement(TemplateableElement value);
}
