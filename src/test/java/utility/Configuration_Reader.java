package utility;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
    private static Properties properties;

    static {

        try {
            // This is the path I created to access the configuration.properties file where my browser is located.
            String path = "configuration.properties";
            // This path will read the file in java, finds the file using the string path
            FileInputStream input = new FileInputStream(path);
            // properties --> class that store properties in key / value format
            properties = new Properties();
            // the values from the file input is loaded / fed in to the properties object
            properties.load(input);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static String get(String browser) {
        return properties.getProperty(browser);
    }

}
