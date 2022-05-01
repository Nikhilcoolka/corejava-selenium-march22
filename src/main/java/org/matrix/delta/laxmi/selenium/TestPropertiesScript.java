package org.matrix.delta.laxmi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestPropertiesScript {
    public static String readPropertyDemo(String key) throws IOException {
        FileInputStream fis = new FileInputStream("H:\\Selenium\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\delta\\laxmi\\selenium\\config.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String value = prop.getProperty(key);
        return value;
    }

    public static void main(String[] args) throws IOException {


        WebDriver driver = new ChromeDriver();

        driver.get(readPropertyDemo("url"));

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("laxmikurhade@rediffmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("laxmikurhade123");

        driver.findElement(By.xpath("//input[@class='signinbtn']")).click();

        WebElement errorMsg = driver.findElement(By.xpath("//b[text()='Temporary Issue. Please try again later. [#5002]']"));
        boolean status = errorMsg.isDisplayed();

        if (status) {
            System.out.println("Test is pass");
        } else {
            System.out.println("Test is Fail");
        }
        driver.close();
    }
}
