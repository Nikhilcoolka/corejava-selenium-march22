package org.matrix.sigma.prajakta.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaucedemoAddItems {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/ ");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);

        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(2000);

        //driver.navigate().to("https://www.saucedemo.com/inventory.html");
        //Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@name='checkout']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Prajakta");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Deshpande");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("423678");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='cancel']/following-sibling::input")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='finish']")).click();
        Thread.sleep(2000);

        WebElement message = driver.findElement(By.xpath("//div[@id='checkout_complete_container']/h2[text()='THANK YOU FOR YOUR ORDER']/parent::div/child::div[text()='Your order has been dispatched, and will arrive just as fast as the pony can get there!']"));

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
