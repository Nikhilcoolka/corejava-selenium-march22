package org.matrix.sigma.ashish.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class NavigatonProg extends Assignment7SauceDemo {

    public static void main(String[] args) throws IOException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
       // driver.get("https://www.saucedemo.com/");
        driver.navigate().to(readProperties("url1"));
    }
}
