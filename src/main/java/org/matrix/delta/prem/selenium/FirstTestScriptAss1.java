package org.matrix.delta.prem.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestScriptAss1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "F:\\automation new\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.get("http://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        driver.findElement(By.id("Email")).sendKeys("prem74729@gmail.com");

        driver.findElement(By.id("Password")).sendKeys("prem7416");

        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        WebElement errorMessage =driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        boolean status =errorMessage.isDisplayed(); // True or False

        if(status){
            System.out.println("Test Case Pass");
        }else{
            System.out.println("Test Case Fail");
        }

    }
}
