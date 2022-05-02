package org.matrix.shriniwas.selenium.pageobjectmodelbasics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Reusable methods
public class PageActions {

    public static void enterText(WebDriver driver, By element, String value) {
        driver.findElement(element).sendKeys(value);
    }

    public static void click(WebDriver driver, By element) {
        driver.findElement(element).click();
    }

    public static String getElementText(WebDriver driver, By element) {
        return driver.findElement(element).getText();
    }
}
