package org.matrix.sigma.ashish.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFacebookLogin  {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.30.0-win32\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

        //WebDriver driver= new FirefoxDriver();

        driver.get("https://www.facebook.com/login/");

        driver.findElement(By.id("email")).sendKeys("Asssssss");

        driver.findElement(By.id("pass")).sendKeys("As");

       // driver.findElement(By.id("loginbutton")).click();

        driver.findElement(By.tagName("button")).click();
        Thread.sleep(20000);
        String str="The password that you've entered is incorrect. ";
        boolean flag =driver.findElement(By.xpath("//*[text()='The password that you've entered is incorrect. ']")).isDisplayed();
        Thread.sleep(2000);
        System.out.println(flag);

    }
}
