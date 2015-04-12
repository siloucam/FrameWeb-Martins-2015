/**
 *
 * $Id$
 */
package uml2.validation;

import org.eclipse.emf.common.util.EList;

import uml2.Behavior;
import uml2.Constraint;
import uml2.Region;
import uml2.Transition;
import uml2.TransitionKind;
import uml2.Trigger;
import uml2.Vertex;

/**
 * A sample validator interface for {@link uml2.Transition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TransitionValidator {
	boolean validate();

	boolean validateEffect(Behavior value);
	boolean validateGuard(Constraint value);
	boolean validateKind(TransitionKind value);
	boolean validateRedefinedTransition(Transition value);
	boolean validateSource(Vertex value);
	boolean validateTarget(Vertex value);
	boolean validateTrigger(EList<Trigger> value);
	boolean validateContainer(Region value);
}
