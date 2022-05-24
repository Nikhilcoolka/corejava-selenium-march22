package org.matrix.sigma.niksangli.selenium.Pageobjectmodelbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productpage {

    public String getProductPageTitle(WebDriver driver) throws InterruptedException {

        String Actualtitle=driver.findElement(By.xpath("//span[@class='title']")).getText();
        return Actualtitle;


    }
}
