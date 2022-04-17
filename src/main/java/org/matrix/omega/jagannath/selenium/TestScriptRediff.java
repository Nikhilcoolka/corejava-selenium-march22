package org.matrix.omega.jagannath.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptRediff {
    WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "H:\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
        driver.findElement(By.id("login1")).sendKeys("kudalejgannath@rediffmail.com");
        driver.findElement(By.id("password")).sendKeys("kudalej");
        driver.findElement(By.xpath("//input[@name=\"proceed\"]")).click();
        WebElement errorMessage = driver.findElement(By.xpath("//div/b[text()=\"Temporary Issue. Please try again later. [#5002]\"]"));
        boolean status = errorMessage.isDisplayed();
        if (status) {
            System.out.println("Test case is pass");
        } else {
            System.out.println("Test case is fail");
        }
        driver.close();
        //Temporary Issue. Please try again later. [#5002]
        //input[@id="login1"]
        //div[@id="div_login_error"]
    }
}
