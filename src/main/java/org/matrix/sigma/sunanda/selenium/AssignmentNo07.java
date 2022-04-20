package org.matrix.sigma.sunanda.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AssignmentNo07 {
    public static String readProperty(String key) throws IOException {
        FileInputStream fin = new FileInputStream("F:\\Automation\\src\\main\\java\\org\\matrix\\sigma\\sunanda\\selenium\\configure.properties.properties");
        Properties prop = new Properties();
        prop.load(fin);
        String value = prop.getProperty(key);
        return value;
    }
    public static void main(String[] args)
            throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        String expectedTitle = readProperty("title");

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test case pass and user login successfully");
        } else {
            System.out.println("Test case fail");
        }

        Thread.sleep(2000);
        driver.close();

    }
}
