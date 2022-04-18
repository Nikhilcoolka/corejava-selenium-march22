package org.matrix.delta.laxmi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo4 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/login/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("laxmi101@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("laxmi101");

        driver.findElement(By.xpath("//button[@id='loginbutton']")).click();

        WebElement err = driver.findElement(By.xpath("//*[@id='loginform']//div[text()"));
         boolean errText = err.isDisplayed();

        if (errText) {
            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }
        driver.close();
    }
}
