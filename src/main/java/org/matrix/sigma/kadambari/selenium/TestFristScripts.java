package org.matrix.sigma.kadambari.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFristScripts {

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("Email")).sendKeys("Kadambari.belavate@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.id("Password")).sendKeys("shravi123");

        driver.findElement(By.xpath("//button[text()='Log in']")).click();

       WebElement errorMessage= driver.findElement(By.xpath("//div[text()='Login was unsuccessful.Please correct the errors and try again"));
       boolean status= errorMessage.isDisplayed();
        if(status){
            System.out.println("Test case Pass");

        }else
            System.out.println("Test case failed");
    }
}
