package org.matrix.delta.prem.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

   public static String readProperty(String key) throws IOException {
       FileInputStream fin = new FileInputStream("F:\\automation new\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\delta\\prem\\selenium\\config.properties");
       Properties prop = new Properties();
       prop.load(fin);
       String value = prop.getProperty(key);
       return value;
    }

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(readProperty("url")); // driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys(readProperty("username")); // sendKeys("standard_user");
       driver.findElement(By.id("password")).sendKeys(readProperty("password"));  // sendkeys("secret_sauce");


    }
}

