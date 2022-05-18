package org.matrix.lambda.nisha.selenium.testcases;

// Using Microsoft Edge Driver - msedgedriver

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestFirstScript2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "D:\\Ni\\Downloads\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

      /*
        Driver Drives the chrome page for Intellij
        WebDriver is used for all web browsers like chrome, firefox, internet explorer
        WebDriver driver = new FirefoxDriver();
        WebDriver driver = new EdgeDriver();
*/
        driver.get("https://demo.nopcommerce.com/");        // Chrome website

        driver.manage().window().maximize();                // Maximize the window

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Log in']")).click();           // Click on login

        Thread.sleep(2000);
        driver.findElement(By.id("Email")).sendKeys("nishavsingam@gmail.com");          // Enter your email

        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("Nisha@123");                    // Enter password

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();                           // Click on login

        //WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]"));
        WebElement errorMessage = driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        boolean status = errorMessage.isDisplayed();

        if (status) {
            System.out.println("Test case passed.");
        } else {
            System.out.println("Test case failed.");
        }

        Thread.sleep(2000);
        driver.close();

    }
}





/*
    ChromeDriver driver = new ChromeDriver();
    FirefoxDriver driver = new FirefoxDriver();
*/



