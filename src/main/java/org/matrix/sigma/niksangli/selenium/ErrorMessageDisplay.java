package org.matrix.sigma.niksangli.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMessageDisplay {
    public static void main(String[] args) throws InterruptedException {
        // Invoking Browser
        System.setProperty("webdriver.chrome.driver",
                "D:\\D-Drive-Study comapny\\" +
                        "SeleniumDriver\\Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("Email")).sendKeys("nik@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.id("Password")).sendKeys("yuoo");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        Thread.sleep(1000);

        WebElement Message = driver.findElement(By.xpath
                ("//*[text()='Login was unsuccessful. Please correct the errors and try again.']"));


        boolean status=Message.isDisplayed();
        if(status) {
            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }

        Thread.sleep(1000);
        driver.close();


    }
}
