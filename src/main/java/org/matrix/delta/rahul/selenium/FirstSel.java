package org.matrix.delta.rahul.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSel {

        public static void main(String[] args) throws InterruptedException {

            //System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
            // we have created environment  path for chromedriver
            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.nopcommerce.com/");
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


