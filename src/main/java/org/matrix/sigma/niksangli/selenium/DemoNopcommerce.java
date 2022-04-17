package org.matrix.sigma.niksangli.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNopcommerce {

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
        Thread.sleep(3000);
        driver.findElement(By.id("Email")).sendKeys("nik@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("yuoo");
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

       System.out.println(driver.findElement(By.xpath("//div[@class='message-error " +
                       "validation-summary-errors']")).getText());


       Thread.sleep(4000);
        driver.close();


    }


}
