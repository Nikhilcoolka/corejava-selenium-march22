package org.matrix.sigma.niksangli.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {
    public static void main(String[] args) throws InterruptedException {
        // invoking browser
        System.setProperty("webdriver.chrome.driver",
                "D:\\D-Drive-Study comapny\\SeleniumDriver\\Driver\\" +
                        "chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();
        Thread.sleep(2000);
        //String s1="Swag Labs";

        boolean status = driver.getTitle().contains("Swag Labs");

        if (status) {
            System.out.println("String matched");
        } else {
            System.out.println("String not matched");
        }
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div/button[@name='add-to-cart-sauce-labs-backpack']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/button[@name='add-to-cart-sauce-labs-bike-light']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/a[@class='shopping_cart_link']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("first-name")).sendKeys("Nikhil");
        driver.findElement(By.id("last-name")).sendKeys("Kulkarni");
        driver.findElement(By.name("postalCode")).sendKeys("416416");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='continue']")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("finish")).click();
        String s1 = driver.findElement(By.xpath("//*[text()=" +
                "'Your order has been dispatched, and will arrive just " +
                "as fast as the pony can get there!']")).getText();
        System.out.println(s1);

        // logout section
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("logout_sidebar_link")).click();

        driver.close();

    }

}
