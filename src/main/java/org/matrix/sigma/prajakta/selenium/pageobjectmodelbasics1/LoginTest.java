package org.matrix.sigma.prajakta.selenium.pageobjectmodelbasics1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void verifyLogin() throws InterruptedException {

        BaseClass baseClass = new BaseClass();
        WebDriver driver = baseClass.init();

        LoginPage loginPage = new LoginPage();
        loginPage.login(driver);

        ProductsPage productsPage = new ProductsPage();
        String actualTitle = productsPage.getTitle(driver);

        String expectedTitle = "PRODUCTS";

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
