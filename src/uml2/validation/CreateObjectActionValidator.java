/**
 *
 * $Id$
 */
package uml2.validation;

import uml2.Classifier;
import uml2.OutputPin;

/**
 * A sample validator interface for {@link uml2.CreateObjectAction}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CreateObjectActionValidator {
	boolean validate();

	boolean validateClassifier(Classifier value);
	boolean validateResult(OutputPin value);
}
