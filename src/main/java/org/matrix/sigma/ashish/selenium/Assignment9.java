package org.matrix.sigma.ashish.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Assignment9 extends Assignment7SauceDemo {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.30.0-win32\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get(readProperties("url1"));

        Thread.sleep(4000);

        driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
        driver.findElement(By.id("securityAuthentication_userName")).sendKeys("Admin");
        driver.findElement(By.id("btnSearchValues")).click();
        WebElement element = driver.findElement(By.xpath("//div//child::div//div[3]/div[1]"));
        System.out.println(element.getText());


    }
}
