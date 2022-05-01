package org.matrix.alpha.sunil.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabAssignment3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        String actualTitle = driver.getTitle();
        String title = "Swag Labs";
        Thread.sleep(1000);
        if (actualTitle.equals(title)) {
            System.out.println("'Verify the Title of Saucedemo application is : " + actualTitle);
            System.out.println("Test case pass");
        } else {
            System.out.println("Title Not match");
        }
        driver.close();
    }
}




