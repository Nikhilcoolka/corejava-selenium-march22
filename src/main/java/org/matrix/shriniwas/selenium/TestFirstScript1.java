package org.matrix.shriniwas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirstScript1 {
   static WebDriver driver;

   public static void main(String[] args) throws InterruptedException {
        String browser = "Firefox";

        if(browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "E:\\chromedriver_win32\\firefoxdriver.exe");
            driver = new FirefoxDriver();
        } else if(browser.equals("Edge")) {
            System.setProperty("webdriver.edge.driver", "E:\\chromedriver_win32\\edgedriver.exe");
            driver = new EdgeDriver();
        }

        // ChromeDriver driver = new ChromeDriver();
        // FirefoxDriver driver1 = new FirefoxDriver();
        // EdgeDriver driver2 = new EdgeDriver();

        driver.get("https://demo.nopcommerce.com/");
//        Options op = driver.manage();
//        Window win = op.window();
//        win.maximize();

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("Email")).sendKeys("shriniwas@gmail.com");

        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("shri123");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        WebElement errorMessage = driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        boolean status = errorMessage.isDisplayed(); // True/False

        if(status) {
            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }

        Thread.sleep(4000);
        driver.close();
    }
}
