package org.matrix.sigma.kadambari.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();

        driver.findElement(By.name("email")).sendKeys("Kadambari.Belavate@gmail.com");

        driver.findElement(By.id("pass")).sendKeys("shravi");

        driver.findElement(By.id("loginbutton")).click();
        WebElement errorMessage= driver.findElement(By.xpath("//div[text()='The password that you've entered is incorrect.Forgotten password?']"));
       boolean output=errorMessage.isDisplayed();
       if(output){
           System.out.println("Test case Pass");
       }else{
           System.out.println("Test case failed");
       }
         driver.close();
    }
}
