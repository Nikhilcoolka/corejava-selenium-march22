package org.matrix.lambda.akashgupta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.matrix.lambda.akashgupta.selenium.setDriver.driver;

public class MakeMyTrip {
    public static void main(String[] args) {
        setDriver.setDriverProperty("edge");
        driver.get("https://www.makemytrip.com/");
        Dimension size = new Dimension(20, 20);
        driver.manage().window().setSize(size);
        List<WebElement> links; /*= new ArrayList<WebElement>();*/
        links = driver.findElements(By.xpath("//p[text()='Product Offering']/following-sibling::ul/li"));
        System.out.println("First 10 links out of " + links.size() + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println("Link" + (i + 1) + " : " + links.get(i).getAttribute("data-cy"));
        }
        driver.close();

    }
}
