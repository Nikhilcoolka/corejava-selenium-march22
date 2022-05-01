package org.matrix.omega.neha.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoScript {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");

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
        driver.findElement(By.id("item_4_title_link")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span['shopping_cart_badge']")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("shopping_cart_container")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("Neha");

        Thread.sleep(2000);
        driver.findElement(By.id("last-name")).sendKeys("Konda");

        Thread.sleep(2000);
        driver.findElement(By.id("postal-code")).sendKeys("413006");

        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("finish")).click();

        WebElement errorMessage = driver.findElement(By.xpath("//h2['THANK YOU FOR YOUR ORDER']"));

        if(errorMessage.isDisplayed()){
            System.out.println("Test case pass");
        } else{
            System.out.println("Test case fail");
        }
        driver.close();

    }
}
