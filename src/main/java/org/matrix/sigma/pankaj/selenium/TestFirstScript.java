package org.matrix.sigma.pankaj.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirstScript {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='log in']")).click();

        driver.findElement(By.id("Email")).sendKeys("kurhadepankaj93@gmail.com");

        driver.findElement(By.id("Password")).sendKeys("pankaj123");

        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        WebElement errorMassage = driver.findElement(By.xpath("//div[text]='Login was unsuccessful. Please correct the errors and try again.']"));

        if (errorMassage.isDisplayed()) {
            System.out.println("Test cae pass");

        } else {
            System.out.println("Test case Fail");
        }

        driver.close();
    }


}
