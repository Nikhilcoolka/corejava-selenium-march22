package org.matrix.sigma.ashish.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AllinOne {

    public static String readProp(String Key) throws IOException {
        FileInputStream fin = new FileInputStream("C:\\Users\\Ashish\\auto\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\sigma\\ashish\\selenium\\config.properties");
        Properties prop = new Properties();
        prop.load(fin);
        String val = prop.getProperty(Key);
        return val;
    }

    public static WebDriver Driver() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

}

