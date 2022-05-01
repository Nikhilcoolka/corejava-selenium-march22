package org.matrix.sigma.prajakta.selenium.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScriptDemo{

    @Test
    public void Test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys("prajakta");

        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("prajakta123");

        Thread.sleep(2000);
        driver.findElement(By.name("login-button")).click();

        String actualTitle = driver.getTitle();

        String title = "Swag Labs";
        Thread.sleep(2000);

        if (actualTitle.equals(title)) {
            System.out.println("'Title of Saucedemo application is : " + actualTitle);
            System.out.println("Test case is pass");
        } else {
            System.out.println("Title not match");
        }

        driver.close();
    }

}
