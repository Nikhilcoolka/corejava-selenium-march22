package org.matrix.sigma.ashish.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSwagLabPage {

       String str;
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.30.0-win32\\geckodriver.exe");

        WebDriver driver=new FirefoxDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        //driver.findElement(By.tagName("title")).getText();

        //WebElement str=driver.findElement(By.tagName("title"));

       //System.out.println(str.getTagName());
        //System.out.println(str.getAttribute("value"));
        String str1=driver.getTitle();

        System.out.println(str1);

        if(str1.equals("Swag Labs")){
            System.out.println("Test Case pass");
        }
        else{
            System.out.println("Test case Fail");
        }

    }
}
