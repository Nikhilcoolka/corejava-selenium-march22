package org.matrix.delta.prem.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4AddItems {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("Prem");
        driver.findElement(By.id("last-name")).sendKeys("Pandey");
        driver.findElement(By.id("postal-code")).sendKeys("450001");
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("finish")).click();
        WebElement order_confirm = driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']"));

        if (order_confirm.isDisplayed()) {
            System.out.println("Order is confirmed");
            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail ");
        }

        driver.close();
    }

}
