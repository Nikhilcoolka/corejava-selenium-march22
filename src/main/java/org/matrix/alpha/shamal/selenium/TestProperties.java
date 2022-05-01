package org.matrix.alpha.shamal.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

    public static String readProperty(String key) throws IOException {
        FileInputStream fin = new FileInputStream("F:\\Seleliam-2022\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\alpha\\shamal\\selenium\\config.properties");
        Properties prop = new Properties();
        prop.load(fin);
        String value = prop.getProperty(key); //prop.getProperty("url"); //prop.getProperty("username");
        return value;

        //return value =  prop.getProperty(key);
    }

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get(readProperty("url")); // driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys(readProperty("username")); // sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys(readProperty("password"));  // sendkeys("secret_sauce");

    }
}
