package br.ufes.inf.nemo.frameweb.codegenerator.entity;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;

import br.ufes.inf.nemo.frameweb.codegenerator.engine.EntityClassTemplateEngine;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;

public class EntityClassCodeGenerator {
	private DomainClass entityClass;
	private ORMTemplate ormTemplate;

	public EntityClassCodeGenerator(DomainClass entityClass, ORMTemplate ormTemplate) {
		this.entityClass = entityClass;
		this.ormTemplate = ormTemplate;
	}

	public void generate(IFolder packageFolder) {
		EntityClassTemplateEngine templateEngine = new EntityClassTemplateEngine(entityClass, ormTemplate);
		
		String classCode = templateEngine.newRender();
		
		String fileName = entityClass.getName() + ormTemplate.getClassExtension();
		IFile file = packageFolder.getFile(fileName);
		
		try {
			InputStream inputStream = IOUtils.toInputStream(classCode, "UTF-8");
			
			// TODO atualizar o conteudo do arquivo ao inves de sobrescrever o codigo
			if (file.exists()) {
				file.delete(true, null);
			}
			
			file.create(inputStream, true, null);
			
		// TODO decidir uma forma de tratamento para os Exceptions de EntityClassCodeGenerator::generate
		} catch (CoreException | IOException e) {
			e.printStackTrace();
		}
		
	}
}
