package org.matrix.sigma.ashish.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Assignment7SauceDemo {

    public static String readProperties(String key) throws IOException {

        FileInputStream fin=new FileInputStream("C:\\Users\\Ashish\\auto\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\sigma\\ashish\\selenium\\config.properties");

        Properties prop=new Properties();
        prop.load(fin);

        String value=prop.getProperty(key);
        return value;

    }

    public static void main(String[] args) throws IOException {



        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.30.0-win32\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get(readProperties("url"));  //driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys(readProperties("user-name"));

         driver.findElement(By.id("password")).sendKeys(readProperties("password"));

        driver.findElement(By.id("login-button")).click();

     }
}
