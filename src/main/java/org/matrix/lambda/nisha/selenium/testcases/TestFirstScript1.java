package org.matrix.lambda.nisha.selenium.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestFirstScript1 {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        String browser = "Chrome";

       /*
        Driver Drives the chrome page for Intellij
        WebDriver is used for all web browsers like chrome, firefox, internet explorer
        WebDriver driver = new FirefoxDriver();
        WebDriver driver = new EdgeDriver();
        */

        if (browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Ni\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browser.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "D:\\Ni\\Downloads\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (browser.equals("Edge")) {
            System.setProperty("webdriver.edge.driver", "D:\\Ni\\Downloads\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        else if (browser.equals("Safari")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Ni\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new SafariDriver();
        }
        else if (browser.equals("Opera")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Ni\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new OperaDriver();
        }

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





