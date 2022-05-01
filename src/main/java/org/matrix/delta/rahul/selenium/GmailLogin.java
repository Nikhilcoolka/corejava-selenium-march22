package org.matrix.delta.rahul.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
    public static void main(String[] args) throws InterruptedException  {
        //System.setProperty("webdriver.chrome.drive", "E:\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
        WebDriver d= new ChromeDriver();
        d.get("https://www.google.com/intl/en-GB/gmail/about/");
        d.manage().window().maximize();
        d.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
        Thread.sleep(4000);
        d.findElement(By.id("identifierId")).sendKeys("shendagerb100@gmail.com");
        d.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
       //d.findElement(By.xpath("//div[@id=\"identifierNext\"]")).click();
        //d.findElement(By.xpath("//button[text()=\"Forgot email?\"]")).click();



    }
}
