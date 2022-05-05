package org.matrix.shriniwas.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestScreenshot {

    @Test
    public void getScreenshot() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        TakesScreenshot screenshot = (TakesScreenshot)driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        String dateTime = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        System.out.println("DateTime: " +dateTime);

        File destFile = new File("E:\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\shriniwas\\selenium\\screenshots\\Test_" +dateTime +".jpg");
        // Test_20220503_215144.jpg
        // Test_20220503_215201.jpg

        FileUtils.copyFile(srcFile, destFile);
    }

    @Test
    public void verifyInvalidLogin() {
        // sendKeys("invalid");
        // sendkey("invalid pass");
        // click(); // Going to homepage

        // PageActions.captureScreenshot(driver);
        Assert.assertEquals("Error", "Error");
    }
}
