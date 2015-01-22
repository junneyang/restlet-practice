package restlet.application;

import org.restlet.Context;
import org.restlet.ext.jaxrs.JaxRsApplication;


public class RestletJaxRsApplication extends JaxRsApplication {

	public RestletJaxRsApplication() {
		// TODO Auto-generated constructor stub
	}

	public RestletJaxRsApplication(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		this.add(new RestletApplication());
	}

}
