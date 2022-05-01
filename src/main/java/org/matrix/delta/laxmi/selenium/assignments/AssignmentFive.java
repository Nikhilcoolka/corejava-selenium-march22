package org.matrix.delta.laxmi.selenium.assignments;

import org.matrix.delta.laxmi.selenium.TestPropertiesScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class AssignmentFive {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(TestPropertiesScript.readPropertyDemo("sausedemo_url"));

        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        String pageTitle = driver.getTitle();

        if (pageTitle.equals("Swag Labs")) {
            System.out.println("Test is Pass");
            System.out.println("Login Successful");
        } else {
            System.out.println("Test and login is Fail");
        }
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Raj");
        driver.findElement(By.id("last-name")).sendKeys("More");
        driver.findElement(By.id("postal-code")).sendKeys("416416");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();

        WebElement thankMsg = driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']"));
        boolean status1 = thankMsg.isDisplayed();
        WebElement completeTextMsg = driver.findElement(By.xpath("//*[@id='checkout_complete_container']//div"));
        boolean status2 = completeTextMsg.isDisplayed();

        boolean testIfBothStatusTrue = status1 && status2;

        if (testIfBothStatusTrue) {
            System.out.println("Test is pass");
        } else {
            System.out.println("Test is fail");
        }
        driver.close();
    }
}
