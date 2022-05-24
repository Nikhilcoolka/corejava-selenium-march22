package org.matrix.sigma.niksangli.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshotprogram {

    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        //Convert web driver object to TakeScreenshot
        TakesScreenshot f1=(TakesScreenshot) driver;

        File sourcefile =f1.getScreenshotAs(OutputType.FILE);
        File Destfile=new File("D:\\D-Drive-Study comapny\\Shriniwas selenium automation\\corejava-selenium-march22" +
                "\\src\\main\\java\\org\\matrix\\sigma\\niksangli\\corejava\\Screenshot\\test1.jpg");

        FileUtils.copyFile(sourcefile,Destfile);



    }
}

