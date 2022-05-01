package org.matrix.lambda.akashgupta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import static org.matrix.lambda.akashgupta.selenium.setDriver.driver;

public class Assignment4 {
    public static void main(String[] args) {
        setDriver.setDriverProperty("chrome");
        driver.get("https://www.facebook.com/login.php");
        Dimension size = new Dimension(800, 800);
        driver.manage().window().setSize(size);
        driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123455");
        driver.findElement(By.tagName("button")).click();
        Boolean flag = driver.findElement(By.xpath("//div[text()='Wrong credentials']")).isDisplayed();
        if (flag) {
            System.out.println("You have entered Wrong credentials:\n" + "Invalid username or password");
        }
        driver.close();
    }
}
