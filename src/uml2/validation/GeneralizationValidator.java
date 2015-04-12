/**
 *
 * $Id$
 */
package uml2.validation;

import org.eclipse.emf.common.util.EList;

import uml2.Classifier;
import uml2.GeneralizationSet;

/**
 * A sample validator interface for {@link uml2.Generalization}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GeneralizationValidator {
	boolean validate();

	boolean validateGeneral(Classifier value);
	boolean validateGeneralizationSet(EList<GeneralizationSet> value);
	boolean validateIsSubstitutable(Boolean value);
	boolean validateSpecific(Classifier value);
}
