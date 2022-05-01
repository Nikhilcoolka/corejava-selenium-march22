package org.matrix.alpha.kamlesh.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Login to https://www.saucedemo.com/ using standard_user and secret_sauce
Add any item to the cart
Go to cart from top right corner
Click Checkout
Enter Details
Continue and Finish
Verify the below message is displayed or not
THANK YOU FOR YOUR ORDER
Your order has been dispatched, and will arrive just as fast as the pony can get there!
*/
public class Assignment5 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Dimension di = new Dimension(1080,900);
        driver.manage().window().setSize(di);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@ name='user-name']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@ data-test='login-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@ data-test='add-to-cart-sauce-labs-backpack']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@ data-test='add-to-cart-sauce-labs-bike-light']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@ class='shopping_cart_link']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("first-name")).sendKeys("Kamal");
        Thread.sleep(1000);
        driver.findElement(By.id("last-name")).sendKeys("Dandi");
        Thread.sleep(1000);
        driver.findElement(By.id("postal-code")).sendKeys("413005");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@ type='submit']")).click();
        Thread.sleep(1000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)");
        Thread.sleep(2000);
        driver.findElement(By.id("finish")).click();
        driver.close();
    }
}
