package org.matrix.lambda.akasht.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemologin {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        String actualTitle = driver.getTitle();
        // String expectedTitle = ReadOnlyProperty("title");

        /*if (actualTitle.equals(expectedTitle)) {
            System.out.println("login successfully");
        } else {
            System.out.println("Test case fail Unable to login");
        }*/

        Thread.sleep(2000);
        driver.close();

    }
}



