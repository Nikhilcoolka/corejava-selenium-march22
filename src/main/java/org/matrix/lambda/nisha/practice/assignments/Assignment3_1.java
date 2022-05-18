package org.matrix.lambda.nisha.practice.assignments;

/*
Assignment No 3:
        Scenario: Verify the Title of Saucedemo application is “Swag Labs”
        Link: https://www.saucedemo.com/
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Ni\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("problem_user");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        WebElement errorMsg = driver.findElement(By.xpath("//h3[text() = 'Epic sadface: Username and password do not match any user in this service']"));
        if (errorMsg.isDisplayed()) {
            System.out.println("Swag Labs : Test Case Passed.");
        } else {
            System.out.println("Swag Labs : Test Case Failed");
        }

        Thread.sleep(2000);
        driver.close();
    }
}
