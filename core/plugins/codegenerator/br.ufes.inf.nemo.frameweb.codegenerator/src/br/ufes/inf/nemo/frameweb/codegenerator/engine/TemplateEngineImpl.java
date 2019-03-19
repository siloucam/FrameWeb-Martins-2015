package br.ufes.inf.nemo.frameweb.codegenerator.engine;

import java.io.StringReader;
import java.io.StringWriter;

import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.runtime.RuntimeServices;
import org.apache.velocity.runtime.RuntimeSingleton;
import org.apache.velocity.runtime.parser.ParseException;
import org.apache.velocity.runtime.parser.node.SimpleNode;

public class TemplateEngineImpl implements TemplateEngine{
	
	private Template velocityTemplate;
	private VelocityContext velocityContext;
	
	public TemplateEngineImpl(String template) {
		RuntimeServices runtimeServices = RuntimeSingleton.getRuntimeServices();
		StringReader stringReader = new StringReader(template);
		velocityTemplate = new Template();
		velocityTemplate.setRuntimeServices(runtimeServices);
		
		try {
			SimpleNode simpleNode = runtimeServices.parse(stringReader, "Generated Code");
			velocityTemplate.setData(simpleNode);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		velocityTemplate.initDocument();

		this.velocityContext = new VelocityContext();
	}
	
	public TemplateEngine addParameter(String key, Object value) {
		velocityContext.put(key, value);
		
		return this;
	}
	
	public String getCode() {
		StringWriter stringWriter = new StringWriter();
		velocityTemplate.merge(velocityContext, stringWriter);
		return stringWriter.toString();
	}

	public TemplateEngine addBasicLibs() {
		velocityContext.put("STRING", new StringUtils());
		velocityContext.put("NULL", new NullUtils());
		velocityContext.put("NEWLINE", System.getProperty("line.separator"));
		velocityContext.put("WHITESPACE", " ");
		velocityContext.put("TAB", "	");
		
		return this;
	}
	
}
