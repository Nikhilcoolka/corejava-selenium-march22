package org.matrix.omega.neha.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class TestScript {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("amitkonda51@gmail.com");

        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("madhu214");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button")).click();

        WebElement errorMessage = driver.findElement(By.xpath("//div['The password that you've entered is incorrect. Forgotten password?']"));

        boolean status= errorMessage.isDisplayed();

        if (status) {
            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }

        Thread.sleep(2000);
        driver.close();
    }
}