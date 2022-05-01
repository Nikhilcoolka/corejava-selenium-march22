package org.matrix.delta.rahul.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import static org.matrix.delta.rahul.selenium.Saucedemo.readSauce;

public class SauceTitle {

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(readSauce("url"));
        driver.manage().window().maximize();
        if (driver.getTitle().equals("Swag Labs")) {

            System.out.println("Test case is Pass");
        } else {
            System.out.println("Test Case is Fail");
        }

    }
}