/**
 *
 * $Id$
 */
package uml2.validation;

import org.eclipse.emf.common.util.EList;

import uml2.GeneralOrdering;
import uml2.Interaction;
import uml2.InteractionOperand;
import uml2.Lifeline;

/**
 * A sample validator interface for {@link uml2.InteractionFragment}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InteractionFragmentValidator {
	boolean validate();

	boolean validateCovered(EList<Lifeline> value);
	boolean validateEnclosingInteraction(Interaction value);
	boolean validateEnclosingOperand(InteractionOperand value);
	boolean validateGeneralOrdering(EList<GeneralOrdering> value);
}
