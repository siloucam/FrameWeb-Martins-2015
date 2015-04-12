/**
 *
 * $Id$
 */
package uml2.validation;

import org.eclipse.emf.common.util.EList;

import uml2.Element;
import uml2.Namespace;
import uml2.ValueSpecification;

/**
 * A sample validator interface for {@link uml2.Constraint}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConstraintValidator {
	boolean validate();

	boolean validateConstrainedElement(EList<Element> value);
	boolean validateSpecification(ValueSpecification value);
	boolean validateContext(Namespace value);
}
