package org.matrix.delta.rahul.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FacebookLogin {

    public static String readProperty(String key) throws IOException {

        FileInputStream file=new FileInputStream("D:\\Automation\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\delta\\rahul\\selenium\\Config.properties");
        Properties pro=new Properties();
         pro.load(file);
         String value= pro.getProperty(key);
         return value;

    }
    public static void main(String[] args) throws IOException, InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.get(readProperty("url"));
        d.findElement(By.id("email")).sendKeys(readProperty("email"));
        d.findElement(By.id("pass")).sendKeys(readProperty("password"));
        d.findElement(By.name("login")).click();

        Thread.sleep(2000);

        WebElement error= d.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]/text()"));


        boolean status=error.isDisplayed();
        if (status){
            System.out.println("Pass");

        }else
        {
            System.out.println("Fail");
        }
    }

}
