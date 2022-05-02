package org.matrix.shriniwas.selenium.pageobjectmodelbasics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    private WebDriver driver;

    // WebElements
    By title = By.className("title");

    ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public String getProductsPageTitle() {
        String actualTitle = PageActions.getElementText(driver, title);
        return actualTitle.toUpperCase();
    }
}
