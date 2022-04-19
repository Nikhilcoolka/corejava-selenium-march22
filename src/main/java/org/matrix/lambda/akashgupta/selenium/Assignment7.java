package org.matrix.lambda.akashgupta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

//import static org.matrix.lambda.akashgupta.selenium.ReadProperties.getKey;

public class Assignment7 {
    WebDriver driver = new ChromeDriver();


    void login() throws IOException, InterruptedException {
        //WebDriver driver = new EdgeDriver();
        driver.get(ReadProperties.getKey("url"));
        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys(ReadProperties.getKey("uId"));
        driver.findElement(By.id("password")).sendKeys(ReadProperties.getKey("password"));
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

    }

    @Test
    void testLogin() throws IOException, InterruptedException {
        login();
        try {
            WebElement element = driver.findElement(By.xpath("//h3[@data-test='error']"));
            boolean status = element.isDisplayed();

            if (status) {
                System.out.println("Login failed:");
                System.out.println(element.getText());
            }
        } catch (NoSuchElementException element) {
        }

        try {
            WebElement element = driver.findElement(By.xpath("//a[@id='item_4_img_link']/img"));

            String src = "https://www.saucedemo.com/static/media/sauce-backpack-1200x1500.34e7aa42.jpg";

            if (element.getAttribute("src").equals(src))
                System.out.println("Login Successful");
            else
                System.out.println("Problem in user login ");
        } catch (NoSuchElementException element) {
        }

        driver.close();


    }
}
