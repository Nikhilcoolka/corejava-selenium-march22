package org.matrix.alpha.kamlesh.selenium;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties readdata() throws IOException {
            FileInputStream ip=new FileInputStream("src/main/java/org/matrix/alpha/kamlesh/selenium/config.properties");
            Properties prop=new Properties();
            prop.load(ip);
            return prop;
    }
    public static String getUrl() throws IOException {
            return readdata().getProperty("url");
    }
    public static String getUsername() throws IOException {
            return readdata().getProperty("username");
    }
    public static String getPass() throws IOException {
            return readdata().getProperty("password");
    }
}
