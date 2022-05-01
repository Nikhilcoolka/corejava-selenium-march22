package org.matrix.alpha.shamal.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MakeMyTripLinkTest {

    public static void getLinks(WebDriver driver, String linksHeader) {
        List<WebElement> links = driver.findElements(By.xpath("//p[translate(text(),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ') = '"+linksHeader+"' ]/following-sibling::ul[1]/li/a"));

        // driver.findElements(By.xpath("//p[text()='"+linksHeader+"']/following-sibling::ul[1]/li/a"));
        System.out.println("Total Links Present for"+ linksHeader +" : "+links.size());

        for (WebElement link : links) {
            System.out.println(link.getText());
        }
    }

    @Test
    public void verifyLinks() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        // TestMakeMyTripLinks.getLinks(driver, "MAKEMYTRIP");

        ArrayList<String> expectedLinks = new ArrayList<>();
        expectedLinks.add("Delhi Chennai Flights");
        expectedLinks.add("Delhi Mumbai Flights");
        expectedLinks.add("Delhi Goa Flights");
        expectedLinks.add("Chennai Mumbai flights");
        expectedLinks.add("Mumbai Hyderabad flights");
        expectedLinks.add("Kolkata to Rupsi Flights");
        expectedLinks.add("Rupsi to Guwahati Flights");
        expectedLinks.add("Pasighat to Guwahati Flights");
        expectedLinks.add("Delhi to Khajuraho Flights");
        expectedLinks.add("Cochin to Agatti Island Flights");
        expectedLinks.add("Hotels in Delhi");
        expectedLinks.add("Hotels in Mumbai");
        expectedLinks.add("Hotels In Goa");
        expectedLinks.add("Hotels In Jaipur");
        expectedLinks.add("Hotels In Ooty");
        expectedLinks.add("Hotels In Udaipur");
        expectedLinks.add("Hotels in Puri");
        expectedLinks.add("Hotels In North Goa");
        expectedLinks.add("Hotels In Rishikesh");
        expectedLinks.add("Honeymoon Packages");
        expectedLinks.add("Kerala Packages");
        expectedLinks.add("Kashmir Packages");
        expectedLinks.add("Ladakh Packages");
        expectedLinks.add("Goa Packages");
        expectedLinks.add("Thailand Packages");
        expectedLinks.add("Sri Lanka Visa");
        expectedLinks.add("Thailand Visa");
        expectedLinks.add("Explore Goa");
        expectedLinks.add("Explore Manali");
        expectedLinks.add("Explore Shimla");
        expectedLinks.add("Explore Jaipur");
        expectedLinks.add("Explore Srinagar"); //32th

        System.out.println("Expected Links:" +expectedLinks);

        List<WebElement> links = driver.findElements(By.xpath("//p[contains(text(),'Quick Links')]/following-sibling::ul[1]/li/a"));
        List<String> actualLinks = new ArrayList<>();

        for (WebElement link : links) {
            actualLinks.add(link.getText());
            // actualLinks.add("Customer Support");
            // actualLinks.add("Payment Security");
        }

        System.out.println("Actual Links Size: " +actualLinks.size());
        System.out.println("Actual Links:" +actualLinks);

        Assert.assertEquals(actualLinks, expectedLinks);
    }


}


