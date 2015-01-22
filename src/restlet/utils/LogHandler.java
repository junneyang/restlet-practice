package restlet.utils;

import java.io.FileInputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;

public class LogHandler {
	public static void logInit() {
        ConfigurationSource source;
        try {
            /*String user_dir = System.getProperty("user.dir");
            String conf_file = "\\conf\\log4j2.xml";
            String conf_file_path = user_dir + conf_file;
            System.out.println(conf_file_path);
            source = new ConfigurationSource(new FileInputStream(conf_file_path));
            Configurator.initialize(null, source);*/
            String user_dir = System.getProperty("user.dir");
            String conf_file = "/conf/log4j2.xml";
            String conf_file_path = user_dir + conf_file;
            //System.out.println(conf_file_path);
            source = new ConfigurationSource(new FileInputStream(conf_file_path));
            Configurator.initialize(null, source);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogHandler.logInit();
		Logger logger = LogManager.getLogger(LogHandler.class.getName());
		logger.info("this is loghandler");
	}
}
