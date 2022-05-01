package org.matrix.sigma.prajakta.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SauceDemoValidateLogin {

    public static String readProperty(String key) throws IOException {
        FileInputStream fin = new FileInputStream("D:\\Automation\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\sigma\\prajakta\\selenium\\assignments\\read.properties");
        Properties pro = new Properties();
        pro.load(fin);
        String value = pro.getProperty(key);
        return value;
    }

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(readProperty("sauce_url"));
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys(readProperty("user_name"));

        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys(readProperty("password"));

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
