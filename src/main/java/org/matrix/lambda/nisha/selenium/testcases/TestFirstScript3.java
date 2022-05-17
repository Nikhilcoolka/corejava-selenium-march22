package org.matrix.lambda.nisha.selenium.testcases;

// Using Mozilla Firefox driver - geckodriver

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirstScript3 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "D:\\Ni\\Downloads\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
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


