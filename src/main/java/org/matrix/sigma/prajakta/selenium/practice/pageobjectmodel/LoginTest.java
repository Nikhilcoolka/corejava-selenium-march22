package org.matrix.sigma.prajakta.selenium.practice.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void verifyLogin() throws InterruptedException {
        //Browser initialization
        BaseClass baseClass=new BaseClass();
        WebDriver driver=baseClass.init();

        //Action
        LoginPage loginPage=new LoginPage();
        boolean errorMessage=loginPage.login(driver);

        //Assertion or verification
        Assert.assertTrue(errorMessage);

    }
}
