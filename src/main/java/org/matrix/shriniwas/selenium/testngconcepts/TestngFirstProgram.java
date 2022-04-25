package org.matrix.shriniwas.selenium.testngconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestngFirstProgram {

    public static String readProperty(String key) throws IOException {
        FileInputStream fin = new FileInputStream("E:\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\shriniwas\\selenium\\config.properties");
        Properties prop = new Properties();
        prop.load(fin);
        String value = prop.getProperty(key); //prop.getProperty("url"); //prop.getProperty("username");
        return value;
    }

    @Test
    public void verifyLogin() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(TestngFirstProgram.readProperty("url")); // driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys(TestngFirstProgram.readProperty("username")); // sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys(TestngFirstProgram.readProperty("password"));  // sendkeys("secret_sauce");
    }

    @Test
    public void test() {
        Assert.assertEquals(true, false);
    }
}
