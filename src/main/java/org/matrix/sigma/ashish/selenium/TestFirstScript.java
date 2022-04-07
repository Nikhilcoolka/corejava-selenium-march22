package org.matrix.sigma.ashish.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirstScript {

    public static void main(String[] args) {
       System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.30.0-win32\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        driver.findElement(By.id("Email")).sendKeys("Ashish@gmail.com");

        driver.findElement(By.id("Password")).sendKeys("Ashish123");

        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        WebElement errorMessage = driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));

        boolean status=errorMessage.isDisplayed();//true or false

        if(status){
            System.out.println("Test Case Pass");
        }
        else{
            System.out.println("Test Case fail");
        }
    }
}
