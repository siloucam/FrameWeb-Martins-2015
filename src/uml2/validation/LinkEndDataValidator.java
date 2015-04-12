/**
 *
 * $Id$
 */
package uml2.validation;

import org.eclipse.emf.common.util.EList;

import uml2.InputPin;
import uml2.Property;
import uml2.QualifierValue;

/**
 * A sample validator interface for {@link uml2.LinkEndData}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LinkEndDataValidator {
	boolean validate();

	boolean validateEnd(Property value);
	boolean validateQualifier(EList<QualifierValue> value);
	boolean validateValue(InputPin value);
}
