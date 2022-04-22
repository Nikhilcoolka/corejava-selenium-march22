/*
* Scenario: Verify error message for Forget password
Steps:
Navigate to https://opensource-demo.orangehrmlive.com/
Click on Forgot your password? Link
Enter any invalid username in the textbox
Click on Reset Password button
Verify Please contact HR admin in order to reset the password
Error Message is displayed or not
*/

package org.matrix.alpha.shamal.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo9 {

   public WebDriver driver = new ChromeDriver();

    public void verifyForgottenPassword(){

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();
       //click on forgot password

        driver.findElement(By.xpath("//div[@id=\"forgotPasswordLink\"]/child::a")).click();

        //Enter Invalid username
        driver.findElement(By.id("//input[@id=\"securityAuthentication_userName\"]")).click();

        //Click on Reset Button

        driver.findElement(By.id("//input[@id=\"btnSearchValues\"]"));






    }
}
