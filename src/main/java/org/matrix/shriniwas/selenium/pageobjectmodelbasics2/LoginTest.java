package org.matrix.shriniwas.selenium.pageobjectmodelbasics2;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    private WebDriver driver;

    // Flow => Open Browser (BeforeMethod)  -> @Test -> close browser (@AfterMethod)

    @BeforeMethod
    public void init() {
        BaseClass baseClass = new BaseClass();
        driver = baseClass.initBrowser();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    // @Test method execution order will be in Alphabetic order
    @Test
    public void verifyValidLogin() {
        // Actions - Start
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(driver);
        String actualTitle = productsPage.getProductsPageTitle(); // PRODUCTS
        String expectedTitle = "PRODUCTS";

        // Assertion or Verification
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void verifySignUp() {

    }
}
