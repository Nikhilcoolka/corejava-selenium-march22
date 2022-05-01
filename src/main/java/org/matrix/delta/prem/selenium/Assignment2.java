package org.matrix.delta.prem.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.name("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        Thread.sleep(2000);

        driver.findElement(By.name("login-button")).click();

        String exptTitle = "Swag Labs";

        String actualTitle = driver.getTitle();



        if(exptTitle.equals(actualTitle)){
            System.out.println("The Title is :" +exptTitle);
            System.out.println("Test case Pass");
        }
        else {
            System.out.println("Test case Failed");

        }

        driver.close(); // close the browser
    }
}






