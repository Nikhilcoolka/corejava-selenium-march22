package org.matrix.sigma.pankaj.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        driver.findElement(By.xpath("//span[@class=\"shopping_cart_badge\"]")).click();


        driver.navigate().back();


        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        driver.navigate().forward();
    }
}
