/*
Assignment No 3:
-	Scenario: Verify the Title of Saucedemo application is “Swag Labs”
Link: https://www.saucedemo.com/

 */
package org.matrix.omega.samir.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://softwares//chromedriver.exe");
        WebDriver driver = new ChromeDriver();//invoke the browser
        driver.get("https://www.saucedemo.com/");//Open the Url in the browser
        driver.findElement(By.name("user-name")).sendKeys("samirshaikh@gmail.com");//Entered the username
        driver.findElement(By.name("password")).sendKeys("123456");// Entrt the password
        driver.findElement(By.id("login-button")).click();//click on login
        String exptitle = "Swag Labs";
        String acttitle = driver.getTitle();//returns title of the page
        if (exptitle.equals(acttitle)) {
            System.out.println("test is passed");
        } else {
            System.out.println("test is failed");
        }
        driver.close();//close the browser

        //"user-name"
        //"password"
        //id="login-button"
        //Swag Labs


    }
}
