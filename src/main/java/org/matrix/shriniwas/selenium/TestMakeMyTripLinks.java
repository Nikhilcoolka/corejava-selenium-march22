package org.matrix.shriniwas.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMakeMyTripLinks {

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
        expectedLinks.add("Customer Support");
        expectedLinks.add("Payment Security");
        expectedLinks.add("Privacy Policy");
        expectedLinks.add("User Agreement");
        expectedLinks.add("Terms of Service");
        expectedLinks.add("More Offices");
        expectedLinks.add("Make A Payment");
        expectedLinks.add("Work From Office"); //8th

        System.out.println("Expected Links:" +expectedLinks);

        List<WebElement> links = driver.findElements(By.xpath("//p[text()='About the Site']/following-sibling::ul[1]/li/a"));
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
