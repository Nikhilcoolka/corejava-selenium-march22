package org.matrix.shriniwas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirstScript {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
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


    }
}
