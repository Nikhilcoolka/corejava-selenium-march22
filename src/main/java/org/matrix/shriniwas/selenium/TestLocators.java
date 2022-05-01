package org.matrix.shriniwas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestLocators {

    public static String readProperty(String key) throws IOException {
        FileInputStream fin = new FileInputStream("E:\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\shriniwas\\selenium\\config.properties");
        Properties prop = new Properties();
        prop.load(fin);
        String value = prop.getProperty(key); //prop.getProperty("url"); //prop.getProperty("username");
        return value;
    }

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(readProperty("url")); // driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //Id
        driver.findElement(By.id("email"));

        //name
        driver.findElement(By.name("email"));

        //className
        driver.findElement(By.className("inputtext _55r1 inputtext _1kbt inputtext _1kbt"));

        //tagName
        driver.findElement(By.tagName("input"));
        driver.findElement(By.tagName("a"));
        driver.findElement(By.tagName("textarea"));

        //linkText
        driver.findElement(By.linkText("Get started"));
        driver.findElement(By.linkText("Download nopCommerce"));

        //partialLinkText
        driver.findElement(By.partialLinkText("started"));
        driver.findElement(By.partialLinkText("nopCommerce"));

        // xpath
        driver.findElement(By.xpath("//input[@data-test='username']"));

        String productName = "HTC One M8 Android L 5.0 Lollipop";
        driver.findElement(By.xpath("//a[text()='"+productName+"']/../following-sibling::*//button[text()='Add to cart']"));

        // cssSelector
        driver.findElement(By.cssSelector("input[name='Email']"));

        System.out.println(readProperty("username")); // standard_user
        System.out.println(readProperty("password")); // secret_sauce


    }
}
