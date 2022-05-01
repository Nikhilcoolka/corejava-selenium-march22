package org.matrix.alpha.shamal.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoAssNoSeven {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/"); // Open the URL

        driver.manage().window().maximize(); //Maximize the window

        driver.findElement(By.name("user-name")).sendKeys("standard_user"); //

        driver.findElement(By.name("password")).sendKeys("secret_sauce"); //Enter the password

        driver.findElement(By.name("login-button")).click(); //Click to Sign In

        String exptTitle = "Swag Labs";

        String actualTitle = driver.getTitle(); //Gives the title of the page

        // Validation

        if(exptTitle.equals(actualTitle)){
            System.out.println("The Title of the page is :" +exptTitle);
            System.out.println("Test case Passed And User Login Successfully....");
        }
        else {
            System.out.println("Test case Failed");

        }

        driver.close(); // close the browser
    }
}
