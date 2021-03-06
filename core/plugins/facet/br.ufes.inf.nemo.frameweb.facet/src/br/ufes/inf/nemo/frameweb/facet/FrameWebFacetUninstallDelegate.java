package br.ufes.inf.nemo.frameweb.facet;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.wst.common.project.facet.core.IDelegate;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;

public class FrameWebFacetUninstallDelegate implements IDelegate {

	@Override
	public void execute(IProject project, IProjectFacetVersion version, Object config, IProgressMonitor monitor)
			throws CoreException {
		
		/**
		 * A barra de carregamento tera dois estagios, remocao da natureza do Sirius e remocao do arquivo .aird
		 */
		monitor.beginTask("", 3);
		
		FrameWebFacet webProject = new FrameWebFacet(project);
		
		try {
			webProject.removeSiriusModelingNature();
			
			monitor.worked(1);
			
			Thread.sleep(500);
			
			/**
			 * Revisar se remover o representation.aird e realmente necessario
			 */
			webProject.removeRepresentationsFile();
			
			monitor.worked(1);
			
			Thread.sleep(500);
			
			webProject.removeConfigurationFile();
			
			monitor.worked(1);
			
			Thread.sleep(500);
			
		} catch (InterruptedException e) {
			e.printStackTrace();

		} finally {
			monitor.done();
		}
	}
}
