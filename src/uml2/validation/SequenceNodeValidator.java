/**
 *
 * $Id$
 */
package uml2.validation;

import org.eclipse.emf.common.util.EList;

import uml2.ExecutableNode;

/**
 * A sample validator interface for {@link uml2.SequenceNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SequenceNodeValidator {
	boolean validate();

	boolean validateExecutableNode(EList<ExecutableNode> value);
}
