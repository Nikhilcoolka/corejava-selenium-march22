package org.matrix.sigma.sunanda.Assgnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo02 {
    public static void main(String[] args)
            throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F/");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.findElement(By.id("Email")).sendKeys("sunandamathapati1994@gmail.com");

            Thread.sleep(2000);
            driver.findElement(By.id("Password")).sendKeys("sona1312");

            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[text()='Log in']")).click();
            WebElement errorMessage = driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
            boolean status = errorMessage.isDisplayed(); // True/False

            if (status) {
                System.out.println("Test case pass");
            } else {
                System.out.println("Test case fail");
            }

            Thread.sleep(4000);
            driver.close();
        }

    }