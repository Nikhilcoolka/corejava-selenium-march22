package org.matrix.lambda.akashgupta.selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static String getKey(String key) throws IOException {
        FileInputStream fin = new FileInputStream("C:\\automationcourse\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\lambda\\akashgupta\\selenium\\config.properties");
        Properties prop = new Properties();
        prop.load(fin);

        return prop.getProperty(key);


    }


}
