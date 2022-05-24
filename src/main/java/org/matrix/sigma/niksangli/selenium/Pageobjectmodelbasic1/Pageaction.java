package org.matrix.sigma.niksangli.selenium.Pageobjectmodelbasic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pageaction {

    public static void text(WebDriver driver,By e1, String value)
    {
        driver.findElement(e1).sendKeys(value);
    }

    public static void click(WebDriver driver,By e2)
    {
        driver.findElement(e2).click();
    }
}
