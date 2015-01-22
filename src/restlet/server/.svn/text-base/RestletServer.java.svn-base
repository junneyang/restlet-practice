package restlet.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.restlet.Component;
import org.restlet.data.Protocol;

import restlet.application.RestletJaxRsApplication;
import restlet.utils.LogHandler;

public class RestletServer {
	private static Logger logger = null;
	public static void main(String[] args) {
		LogHandler.logInit();
		logger = LogManager.getLogger(RestletServer.class.getName());
		// TODO Auto-generated method stub
		if (args.length != 1) {
			String msg = "arguments not enough, missing port !";
			logger.error(msg);
			System.out.println(msg);
			System.exit(-1);
		}
		try {
			int port = Integer.parseInt(args[0]);
			Component component = new Component();
			component.getServers().add(Protocol.HTTP, port);
			component.getDefaultHost().attach(new RestletJaxRsApplication(null));
			component.start();
			String msg = "the restlet server is now ready to listen on port " + port + "...";
			logger.info(msg);
			System.out.println(msg);
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
			e.printStackTrace();
		}
	}

}
