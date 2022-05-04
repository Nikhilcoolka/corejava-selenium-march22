package org.matrix.lambda.akasht.corejava.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@name='checkout']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Akash");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Toradmalle");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("412308");
        Thread.sleep(1000);


        driver.findElement(By.xpath("//button[@id='cancel']/following-sibling::input")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@id='finish']")).click();
        Thread.sleep(1000);


        WebElement message = driver.findElement(By.xpath("//div[@id='checkout_complete_container']/h2]text()='THANK YOU FOR YOUR ORDER Your order has been dispatched, and will arrive just as fast as the pony can get there!'"));
        String actualTitle = driver.getTitle();

        boolean status = message.isDisplayed();
        if (status) {
            System.out.println("item added in cart");
        } else {
            System.out.println("Test case fail");
        }
        /*driver.close();*/
    }
}



