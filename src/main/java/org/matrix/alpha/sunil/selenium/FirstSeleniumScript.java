package org.matrix.alpha.sunil.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://demo.nopcommerce.com/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//a[text ()='Log in']")).click();
            driver.findElement(By.id("Email")).sendKeys("sunil@gmail.com");
            driver.findElement(By.id("Password")).sendKeys("Sunil123");
            driver.findElement(By.xpath("//button [text ()='Log in']")).click();

            WebElement errorMessage = driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
            boolean status = errorMessage.isDisplayed();
            if(status) {
                System.out.println("Test case pass");
            } else {
                System.out.println("Test case fail");
            }
            driver.close();
        }
    }