package org.matrix.sigma.prajakta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyRead {

    //readProperty method read a file ... config.properties
    //Using FileInputStream class
    public static String readProperty(String key) throws IOException {
        FileInputStream fin = new FileInputStream("D:\\Automation\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\sigma\\prajakta\\selenium\\config.properties");
        Properties prop = new Properties();
        prop.load(fin);
        String value = prop.getProperty(key);
        return value;
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get(readProperty("url")); //driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.id("user-name")).sendKeys(readProperty("user_name")); //sendkeys("standard_user");
        Thread.sleep(2000);

        driver.findElement(By.id("password")).sendKeys(readProperty("password")); //sendkeys("secret_sauce");
        Thread.sleep(2000);

        driver.close();
    }

}
