package org.matrix.sigma.prajakta.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AssignmentNo9 {

    public static String readProperty(String key) throws IOException {
        FileInputStream fin = new FileInputStream("D:\\Automation\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\sigma\\prajakta\\selenium\\assignments\\read.properties");
        Properties prop = new Properties();
        prop.load(fin);
        String value = prop.getProperty(key);
        return value;
    }

    @Test
    public void verify() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(readProperty("orange_url"));
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("securityAuthentication_userName")).sendKeys("abcd");
        Thread.sleep(2000);

        driver.findElement(By.id("btnSearchValues")).click();
        Thread.sleep(2000);

        WebElement element = driver.findElement(By.xpath("//div[@class='message warning fadable']"));
        boolean status = element.isDisplayed();

        Assert.assertTrue(status);

        driver.close();
    }

}
