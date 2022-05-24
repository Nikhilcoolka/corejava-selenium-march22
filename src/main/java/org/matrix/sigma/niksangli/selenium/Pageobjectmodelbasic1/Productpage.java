package org.matrix.sigma.niksangli.selenium.Pageobjectmodelbasic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productpage {

    private WebDriver driver;

     // web elements
    By titletxt=By.xpath("//span[@class='title']");

     Productpage(WebDriver driver)
    {
        this.driver=driver;
    }

    public String getProductPageTitle(WebDriver driver) throws InterruptedException {

          // related method
        String Actualtitle=driver.findElement(titletxt).getText();
        return Actualtitle;


    }
}
