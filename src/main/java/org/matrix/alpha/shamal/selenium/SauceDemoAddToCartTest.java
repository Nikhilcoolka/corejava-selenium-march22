package org.matrix.alpha.shamal.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoAddToCartTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\chromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // Maximize the window

        driver.get("https://www.saucedemo.com/");  // Open URL

        //Enter Valid username
        driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
        //Enter Valid password
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
        //Click to login
        driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
        Thread.sleep(2000);
        //Add product to cart
        driver.findElement(By.xpath("//button[@name=\"add-to-cart-sauce-labs-backpack\"]")).click();
        Thread.sleep(2000);

        //To checkout Element added to cart or not
        driver.findElement(By.xpath("//span[@class=\"shopping_cart_badge\"]")).click();

        Thread.sleep(2000);
        //To checkout for item added or not
        driver.findElement(By.xpath("//button[@name=\"checkout\"]")).click();

        Thread.sleep(2000);
        //To enter the Details
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("Shamal");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys("Jadhav");
        driver.findElement(By.xpath("//input[@data-test=\"postalCode\"]")).sendKeys("412412");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"continue\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id=\"finish\"]")).click();
        WebElement SuccessMsg = driver.findElement(By.xpath("//h2[text() = \"THANK YOU FOR YOUR ORDER\"]"));


        String productName = driver.findElement(By.xpath("//div[@class=\"inventory_item_name\"]")).getText();
        String productPrice = driver.findElement(By.xpath("//div[@class=\"inventory_item_price\"]")).getText();


        boolean status = SuccessMsg.isDisplayed(); // True/False

        if(status) {

            System.out.println("Product Name Is:"+productName +"Product Price Is:"+productPrice);
            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }

        driver.close();
    }
}
