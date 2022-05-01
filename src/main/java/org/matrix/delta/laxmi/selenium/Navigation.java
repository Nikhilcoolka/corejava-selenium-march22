package org.matrix.delta.laxmi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class Navigation {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        // driver.navigate().to(new URL("https://www.saucedemo.com/"));

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();

        Thread.sleep(2000);
        driver.navigate().back();

        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        driver.navigate().forward();
        driver.close();
    }
}

