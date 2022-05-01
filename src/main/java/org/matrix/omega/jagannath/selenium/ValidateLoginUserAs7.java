package org.matrix.omega.jagannath.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLoginUserAs7 {
 WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
        String strUrl=driver.getCurrentUrl();
        String strExpectedUrl="https://www.saucedemo.com/inventory.html";
        if(strExpectedUrl.equals(strUrl))
        {
            System.out.println("Login Succesfully verified");
        }
        else
        {
            System.out.println("Login not verified");
        }
       driver.close();
    }
}
