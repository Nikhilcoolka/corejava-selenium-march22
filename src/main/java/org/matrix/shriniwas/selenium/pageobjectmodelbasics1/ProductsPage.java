package org.matrix.shriniwas.selenium.pageobjectmodelbasics1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    public String getProductsPageTitle(WebDriver driver) {
        String actualTitle = driver.findElement(By.className("title")).getText(); // Products
        return actualTitle.toUpperCase();
    }
}
