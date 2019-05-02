package br.ufes.inf.nemo.frameweb.codegenerator.e4;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import br.ufes.inf.nemo.frameweb.codegenerator.e4.models.ApplicationModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.models.EntityModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.models.NavigationModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.models.PersistenceModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration;
import br.ufes.inf.nemo.frameweb.utils.IProjectUtils;

public class CodeGenerator implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		boolean canExecute = selections
			.stream()
			.anyMatch(DSemanticDiagram.class::isInstance);
		
		return canExecute;
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		ProjectRepresentation representation = new ProjectRepresentation(selections);

		IProject project = IProjectUtils.getSelectedProject();
		
		FrameWebConfiguration fwConfig = representation.getFrameWebConfiguration();
		
		IFolder srcFolder = project.getFolder(fwConfig.getSrcPath());
		IFolder templatesFolder = project.getFolder(fwConfig.getTemplatePath());
		IFolder viewsFolder = project.getFolder(fwConfig.getViewPath());
		
		if (representation.hasEntityModel() && representation.hasORMTemplate()) {
			EntityModelCodeGenerator entityModelCodeGenerator = new EntityModelCodeGenerator(
					representation.getEntityModel(),
					representation.getORMTemplate()
			);

			entityModelCodeGenerator.generate(srcFolder, templatesFolder);
		}

		if (representation.hasNavigationModel() && representation.hasFrontControllerTemplate()) {
			NavigationModelCodeGenerator navigationModelCodeGenerator = new NavigationModelCodeGenerator(
					representation.getNavigationModel(),
					representation.getFrontControllerTemplate()
			);

			navigationModelCodeGenerator.generate(srcFolder, templatesFolder);
			navigationModelCodeGenerator.generateViews(viewsFolder, templatesFolder);
		}
		
		if (representation.hasApplicationModel() && representation.hasDITemplate()) {
			ApplicationModelCodeGenerator applicationModelCodeGenerator = new ApplicationModelCodeGenerator(
					representation.getApplicationModel(),
					representation.getDITemplate()
			);
			
			applicationModelCodeGenerator.generate(srcFolder, templatesFolder);
		}
		
		if (representation.hasPersistenceModel() && representation.hasDAOTemplate()) {
			PersistenceModelCodeGenerator persistenceModelCodeGenerator = new PersistenceModelCodeGenerator(
					representation.getPersistenceModel(),
					representation.getDAOTemplate()
			);
		
			persistenceModelCodeGenerator.generate(srcFolder, templatesFolder);
		}
	}

}