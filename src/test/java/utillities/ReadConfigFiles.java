package utillities;

import org.apache.logging.log4j.LogManager;
import org.testng.log4testng.Logger;

import java.util.Properties;

public class ReadConfigFiles {
    private static final Logger LOGGER = (Logger) LogManager.getLogger(ReadConfigFiles.class);
    public static String getPropertyValues(String propName) {
        Properties prop;
        String propValue = null;
        try {
            prop = new LoadConfigFiles().readPropertyValues();
            propValue = prop.getProperty(propName);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
       return propValue;
    }
}
