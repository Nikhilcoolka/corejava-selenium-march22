package org.matrix.delta.rahul.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import static org.matrix.delta.rahul.selenium.Saucedemo.readSauce;

public class Assignment7 {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(readSauce("url"));
        driver.findElement(By.id("user-name")).sendKeys(readSauce("user"));
        driver.findElement(By.id("password")).sendKeys(readSauce("password"));

        boolean status=driver.findElement(By.id("login-button")).isEnabled();

        if (status){
            System.out.println("user is successfully logged in");
        }else {
            System.out.println("user is successfully  not logged in");
        }
        driver.close();


    }
}
