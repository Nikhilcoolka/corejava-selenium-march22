package org.matrix.sigma.ashish.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Assignment8 extends Assignment7SauceDemo{

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.30.0-win32\\geckodriver.exe");

        WebDriver driver= new FirefoxDriver();

        driver.get(readProperties("url1"));

       // driver.findElement(By.xpath("//*[@class='form-hint']")).sendKeys(readProperties("Username"));

        driver.findElement(By.xpath("//*[text()='Username']")).sendKeys("Username1");

        driver.findElement(By.xpath("//*[text()='Username']")).sendKeys("Password1");

        driver.findElement(By.xpath("//*[@id='btnLogin']")).click();

    }
}
