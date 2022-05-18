package org.matrix.lambda.nisha.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrowserStack {

    public static void main(String[] args) {

        // Test case will be running in Google Chrome
        System.setProperty("webdriver.chrome.driver", "D:\\Ni\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/users/sign_in");
        driver.findElement(By.id("user_email_login")).sendKeys("nishavsingam@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("Nishu123");
        driver.findElement(By.xpath("//input[@value='Sign me in']")).click();

        WebElement errorMsg = driver.findElement(By.xpath("//span[text()=Invalid password]"));
        if (errorMsg.isDisplayed()) {
            System.out.println("Testcase Passed");
        }else {
            System.out.println("Testcase Failed");
        }

        driver.close();
    }
}







