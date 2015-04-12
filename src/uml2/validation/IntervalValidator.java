/**
 *
 * $Id$
 */
package uml2.validation;

import uml2.ValueSpecification;

/**
 * A sample validator interface for {@link uml2.Interval}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IntervalValidator {
	boolean validate();

	boolean validateMax(ValueSpecification value);
	boolean validateMin(ValueSpecification value);
}
