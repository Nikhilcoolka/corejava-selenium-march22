package org.matrix.delta.rahul.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Saucedemo {

public static String readSauce(String key) throws IOException {
    FileInputStream file=new FileInputStream("D:\\Automation\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\delta\\rahul\\selenium\\Sauce.Properties");
    Properties prop=new Properties();
    prop.load(file);
    String value= prop.getProperty(key);
    return value;

}

    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.get(readSauce("url"));
        d.manage().window().maximize();
        d.findElement(By.id("user-name")).sendKeys(readSauce("user"));
        Thread.sleep(2000);
        d.findElement(By.id("password")).sendKeys(readSauce("password"));
        Thread.sleep(2000);
        d.findElement(By.id("login-button")).click();

        d.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//span[@class=\"shopping_cart_badge\"]")).click();
        Thread.sleep(2000);
        d.navigate().back();
        Thread.sleep(2000);
        d.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        d.findElement(By.xpath("//span[@class=\"shopping_cart_badge\"]")).click();







    }

}
