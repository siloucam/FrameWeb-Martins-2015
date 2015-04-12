/**
 *
 * $Id$
 */
package uml2.validation;

import org.eclipse.emf.common.util.EList;

import uml2.ActivityEdge;
import uml2.Classifier;
import uml2.Connector;
import uml2.Message;
import uml2.NamedElement;
import uml2.Relationship;

/**
 * A sample validator interface for {@link uml2.InformationFlow}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InformationFlowValidator {
	boolean validate();

	boolean validateConveyed(EList<Classifier> value);
	boolean validateInformationSource(EList<NamedElement> value);
	boolean validateInformationTarget(EList<NamedElement> value);
	boolean validateRealization(EList<Relationship> value);
	boolean validateRealizingActivityEdge(EList<ActivityEdge> value);
	boolean validateRealizingConnector(EList<Connector> value);
	boolean validateRealizingMessage(EList<Message> value);
}
