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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssignmentNo9 {

    public WebDriver driver = new ChromeDriver();

    @Test
    public void verifyForgottenPassword() {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();
        //click on forgot password

        driver.findElement(By.xpath("//div[@id=\"forgotPasswordLink\"]/child::a")).click();

        //Enter Invalid username
        driver.findElement(By.xpath("//input[@id=\"securityAuthentication_userName\"]")).sendKeys("shamal");


        //Click on Reset Button

        driver.findElement(By.xpath("//input[@id=\"btnSearchValues\"]")).click();

        WebElement errorMsg = driver.findElement(By.xpath("//div[@class=\"message warning fadable\" and contains(text(),'Please contact HR')]"));

        boolean errMsg = driver.findElement(By.xpath("//div[@class=\"message warning fadable\" and contains(text(),'Please contact HR')]")).isDisplayed();

        Assert.assertTrue(errMsg);


    }
}
