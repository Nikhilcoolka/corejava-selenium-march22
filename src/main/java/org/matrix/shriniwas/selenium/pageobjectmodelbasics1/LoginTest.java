package org.matrix.shriniwas.selenium.pageobjectmodelbasics1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void verifyValidLogin() {

        // Init Browser
        BaseClass baseClass = new BaseClass();
        WebDriver driver = baseClass.initBrowser();

        // Actions - Start
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver);

        ProductsPage productsPage = new ProductsPage();
        String actualTitle = productsPage.getProductsPageTitle(driver); // PRODUCTS
        String expectedTitle = "PRODUCTS";

        // Assertion or Verification
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
