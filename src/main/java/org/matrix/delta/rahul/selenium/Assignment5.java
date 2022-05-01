package org.matrix.delta.rahul.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

import static org.matrix.delta.rahul.selenium.Saucedemo.readSauce;

public class Assignment5 {
    public static void main(String[] args) throws IOException {
        WebDriverManager.edgedriver().setup();
        //WebDriver d=new ChromeDriver();
        WebDriver d=new EdgeDriver();
        d.get(readSauce("url"));
        d.manage().window().maximize();
        d.findElement(By.id("user-name")).sendKeys(readSauce("user"));
        d.findElement(By.id("password")).sendKeys(readSauce("password"));
        d.findElement(By.id("login-button")).click();
        d.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        d.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
        d.findElement(By.id("checkout")).click();
        d.findElement(By.id("first-name")).sendKeys(readSauce("FirstName"));
        d.findElement(By.id("last-name")).sendKeys("LastName");
        d.findElement(By.id("postal-code")).sendKeys("ZeepCode");
        d.findElement(By.id("continue")).click();
       d.findElement(By.id("finish")).click();
        WebElement msg=d.findElement(By.xpath("//h2"));

         boolean status =msg.isDisplayed();
        if (status){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
       d.close();
       // System.out.println(msg.getText());

    }
}
