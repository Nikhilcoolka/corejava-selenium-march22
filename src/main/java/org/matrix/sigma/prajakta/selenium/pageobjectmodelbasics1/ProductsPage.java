package org.matrix.sigma.prajakta.selenium.pageobjectmodelbasics1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    public String getTitle(WebDriver driver) {
        String actualTitle = driver.findElement(By.xpath("//span[@class='title']")).getText();
        return actualTitle;
    }
}
