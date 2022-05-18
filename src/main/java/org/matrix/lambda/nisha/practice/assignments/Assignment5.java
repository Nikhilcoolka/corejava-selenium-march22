package org.matrix.lambda.nisha.practice.assignments;

/*
* Assignment No 5:
Scenario: To verify if the item is added to the Add to cart and ordered successfully

Steps:
Login to https://www.saucedemo.com/ using standard_user and secret_sauce
Add any item to the cart
Go to cart from top right corner
Click Checkout
Enter Details
Continue and Finish
Verify the below message is displayed or not
THANK YOU FOR YOUR ORDER
Your order has been dispatched, and will arrive just as fast as the pony can get there!

* */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Ni\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("payal");
        Thread.sleep(2000);
        driver.findElement(By.id("last-name")).sendKeys("singh");
        Thread.sleep(2000);
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        Thread.sleep(2000);
        driver.findElement(By.id("last-name")).sendKeys("singh");
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);
        WebElement checkThankYouMsg = driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']"));
        WebElement checkOrderMsg = driver.findElement(By.xpath("//div[text()='Your order has been dispatched, and will arrive just as fast as the pony can get there!']"));

        if (checkThankYouMsg.isDisplayed() && checkOrderMsg.isDisplayed()) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        Thread.sleep(2000);
        driver.close();


    }

}
