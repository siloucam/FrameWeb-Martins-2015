/**
 *
 * $Id$
 */
package frameweb.validation;

import frameweb.ControllerPackage;
import frameweb.NavigationComposition;
import frameweb.NavigationDependency;
import frameweb.ViewPackage;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link frameweb.NavigationModel}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface NavigationModelValidator {
	boolean validate();

	boolean validateNavigationUMLDependence(EList<NavigationDependency> value);
	boolean validateViewUMLPackage(EList<ViewPackage> value);
	boolean validateControllerUMLPackage(EList<ControllerPackage> value);
	boolean validateNavigationUMLComposition(EList<NavigationComposition> value);
}
