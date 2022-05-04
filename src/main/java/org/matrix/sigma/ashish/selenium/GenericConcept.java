package org.matrix.sigma.ashish.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenericConcept extends AllinOne {

    public static void findLink(WebDriver driver,String header) throws IOException {
        driver.get(readProp("url3"));
        List<WebElement> Links = driver.findElements(By.xpath("//*[text()='"+header+"']/following-sibling::ul[1]/li/a"));
        List<String> actualLinks= new ArrayList<>();
        for(WebElement link : Links){
            actualLinks.add(link.getText());
        }

        ArrayList<String> expectedLink =new ArrayList<>();

        expectedLink.add("About Us");
        expectedLink.add("Investor Relations");
        expectedLink.add("Careers");
        expectedLink.add("Corporate Travel");
        expectedLink.add("MMT Foundation");
        expectedLink.add("CSR Policy");
        expectedLink.add("myPartner - Travel Agent Portal");
        expectedLink.add("Foreign Exchange");
        expectedLink.add("List your hotel");
        expectedLink.add("Partners- Redbus");
        expectedLink.add("Partners- Goibibo");
        expectedLink.add("Advertise with Us");

        Assert.assertEquals(actualLinks,expectedLink);


    }

    @Test
    public void verifyLinks() throws IOException {

        System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.30.0-win32\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        findLink(driver,"MakeMyTrip");
    }
}
