package org.matrix.sigma.ashish.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AssignmentSwagOrder {

    public static String  readProp(String key) throws IOException {

        FileInputStream fin=new FileInputStream("C:\\Users\\Ashish\\auto\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\sigma\\ashish\\selenium\\config.properties");

        Properties prop=new Properties();
        prop.load(fin);

        String value=prop.getProperty(key);
        return value;
    }

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.30.0-win32\\geckodriver.exe");

        WebDriver driver= new FirefoxDriver();

        driver.get(readProp("url"));

        driver.manage().window().maximize();

       // String user=driver.findElement(By.xpath("//div[text()='standard_user']//")).getText();

       // String pass=driver.findElement(By.xpath("//div[text()='secret_sauce']")).getText();

        driver.findElement(By.id("user-name")).sendKeys(readProp("user-name"));

        driver.findElement(By.id("password")).sendKeys(readProp("password"));


        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();

        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

        driver.findElement(By.xpath("//button[@id='checkout']")).click();

        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Ash");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Thop");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//button[@id='finish']")).click();
        WebElement msg=driver.findElement(By.xpath("//*[@class='complete-header']"));
        String str=msg.getText();

        System.out.println(str);
}}
