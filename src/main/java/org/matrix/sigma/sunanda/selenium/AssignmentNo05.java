package org.matrix.sigma.sunanda.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo05 {
    public static void main(String[] args)
            throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("Sunanda");
        Thread.sleep(2000);
        driver.findElement(By.id("last-name")).sendKeys("Mathapati");
        Thread.sleep(2000);
        driver.findElement(By.id("postal-code")).sendKeys("413002");
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);
        WebElement message = driver.findElement(By.xpath("//div[@class= 'checkout_complete_container']/h2/following-sibling::div[text()='Your order has been dispatched, and will arrive just as fast as the pony can get there!']"));
        boolean status = message.isDisplayed();

        if (status) {
            System.out.println("Item added in cart");
        } else {
            System.out.println("Test case fail");
        }
        Thread.sleep(2000);
        driver.close();

    }
}
