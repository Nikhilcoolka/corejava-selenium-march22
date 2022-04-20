package org.matrix.sigma.sunanda.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo04 {
    public static void main(String[] args)
        throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("sunanda1994@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sunanda12");
        Thread.sleep(2000);
        driver.findElement(By.id("loginbutton")).click();
        WebElement errorMassage = driver.findElement(By.xpath("//div[@class='_9ay7']/a"));
        boolean status = errorMassage.isDisplayed(); // True/False
        if (status) {
            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }
        Thread.sleep(4000);
        driver.close();
    }
}
