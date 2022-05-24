package org.matrix.sigma.niksangli.selenium.Pageobjectmodelbasic1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logintest {   //This used for method calling object creation
    @Test
    public void verifyLogin() throws InterruptedException {

        // 1-Browser initialization base class
        Baseclass baseclass = new Baseclass();
        WebDriver driver = baseclass.initBrowser();

        // 2-Action start  loginpageclass
        Loginpage loginpage = new Loginpage(driver);
        loginpage.login("standard_user","secret_sauce");

        // 3-product verification productpageclass
        Productpage Productpage = new Productpage(driver);
        String Actualtitle = Productpage.getProductPageTitle(driver);

        Actualtitle = Actualtitle.toUpperCase();
        System.out.println(Actualtitle);

        String Expectedtitle = "PRODUCTS";
        System.out.println(Expectedtitle);

        //4-Assertion verfication
        Assert.assertEquals(Actualtitle, Expectedtitle);

        Thread.sleep(3000);
        driver.close();

    }
}
