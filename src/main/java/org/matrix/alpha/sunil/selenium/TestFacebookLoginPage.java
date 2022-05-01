package org.matrix.alpha.sunil.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFacebookLoginPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("sunil@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Sunil@12");
        driver.findElement(By.id("loginbutton")).click();
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
