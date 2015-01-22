package restlet.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import restlet.resources.StudentResource;

public class RestletApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		Set<Class<?>> resources = new HashSet<Class<?>>();
		resources.add(StudentResource.class);
		return resources;
	}

}
