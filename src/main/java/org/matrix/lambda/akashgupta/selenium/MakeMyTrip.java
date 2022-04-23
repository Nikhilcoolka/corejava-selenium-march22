package org.matrix.lambda.akashgupta.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class MakeMyTrip {

    WebDriver driver;

    public void getLinks(String header) throws InterruptedException {

        driver.get("https://www.makemytrip.com/");
        String xpath = "//p[translate(text(),'abcdefghijklmnopqrstuvwxzy','ABCDEFGHIJKLMNOPQRSTUVWXZY')='" + header + "']/following-sibling::ul[1]/li/a";
        List<WebElement> links = driver.findElements(By.xpath(xpath));
        System.out.println("Total links present under " + header + " are :" + links.size());
        for (WebElement e : links) {
            System.out.println("link : " + e.getText());
        }
    }

    @Test
    void makeMyTrip() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        driver = new ChromeDriver();
        getLinks("PRODUCT OFFERING");
        driver.close();
    }
}
