package org.matrix.lambda.nisha.practice.assignments;

/*
Assignment No 4:
        Scenario: Please verify the error message for invalid credentials
        Link: https://www.facebook.com/login/

        Steps:
        Navigate to https://www.facebook.com/login/
        Enter incorrect Email address
        Enter incorrect password
        Click on Login button
        Verify the error message is displayed or not
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Ni\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

      /*
        Driver Drives the chrome page for Intellij
        WebDriver is used for all web browsers like chrome, firefox, internet explorer
        WebDriver driver = new FirefoxDriver();
        WebDriver driver = new EdgeDriver();
      */
        driver.get("https://www.facebook.com/login/");        // Chrome website
        driver.manage().window().maximize();                // Maximize the window
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("nishavsingam@gmail.com");          // Enter your email
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("Nisha@123");                    // Enter password
        Thread.sleep(2000);
        driver.findElement(By.id("loginbutton")).click();                           // Click on login
        //WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]"));
        WebElement errorMessage = driver.findElement(By.xpath("//*[contains(text(),\"The email address you entered isn't connected to an account. \")]"));
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