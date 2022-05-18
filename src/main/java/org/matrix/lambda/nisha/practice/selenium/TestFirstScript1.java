package org.matrix.lambda.nisha.practice.selenium;

// Using Google Chrome Driver

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirstScript1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Ni\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();           // Driver Drives the chrome page for Intellij
        // WebDriver is used for all web browsers like chrome, firefox, internet explorer

        // WebDriver driver = new FirefoxDriver();
        // WebDriver driver = new EdgeDriver();

        driver.get("https://www.browserstack.com/");        // Chrome website

        driver.manage().window().maximize();                // Maximize the window

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();           // Click on login

        Thread.sleep(2000);
        driver.findElement(By.id("user_email_login")).sendKeys("nishavsingam@gmail.com");          // Enter your email

        Thread.sleep(2000);
        driver.findElement(By.id("user_password")).sendKeys("Nisha@123");                    // Enter password

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Sign me in']")).click();                           // Click on login


        WebElement signInMsg = driver.findElement(By.xpath("//h2"));
        boolean status = signInMsg.isDisplayed();

        if (status) {
            System.out.println("Test case passed.");
        } else {
            System.out.println("Test case failed.");
        }

        Thread.sleep(2000);
        driver.close();
    }
}



