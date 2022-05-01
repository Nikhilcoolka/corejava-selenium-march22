package org.matrix.omega.jagannath.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
    WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.drive","H:\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Digambar");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Kudale");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("411045");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//button[@id='finish']")).click();
        driver.findElement(By.xpath("//div/h2[text()=\"THANK YOU FOR YOUR ORDER\"]")).isDisplayed();
        Thread.sleep(4000);
        WebElement thankMessage=driver.findElement(By.xpath("//div/h2[text()=\"THANK YOU FOR YOUR ORDER\"]"));
        boolean success=thankMessage.isDisplayed();

        if(success){
            System.out.println("Test case is pass : THANK YOU FOR YOUR ORDER ");
        }
        else
        {
            System.out.println("Test case is Fail");
        }
        driver.close(); //closing the web driver


    }
}
