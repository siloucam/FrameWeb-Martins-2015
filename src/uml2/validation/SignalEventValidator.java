/**
 *
 * $Id$
 */
package uml2.validation;

import uml2.Signal;

/**
 * A sample validator interface for {@link uml2.SignalEvent}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SignalEventValidator {
	boolean validate();

	boolean validateSignal(Signal value);
}
