package org.matrix.sigma.ashish.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;

public class Assignment7SauceDemo {

    public static String readProperties(String key) throws IOException {

        FileInputStream fin=new FileInputStream("C:\\Users\\Ashish\\auto\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\sigma\\ashish\\selenium\\config.properties");

        Properties prop=new Properties();
        prop.load(fin);

        String value=prop.getProperty(key);
        return value;

    }

    public static void main(String[] args) throws IOException, InterruptedException {



        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.30.0-win32\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get(readProperties("url"));  //driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys(readProperties("user-name"));

         driver.findElement(By.id("password")).sendKeys(readProperties("password"));


       driver.findElement(By.xpath("//*[@id='login-button']")).click();

       Thread.sleep(2000);

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




     }
}
