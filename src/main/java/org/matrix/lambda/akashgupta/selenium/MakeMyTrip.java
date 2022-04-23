package org.matrix.lambda.akashgupta.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Locale;

public class MakeMyTrip {

    WebDriver driver;

    public void getLinks(String header) throws InterruptedException {

        driver.get("https://www.makemytrip.com/");
        Dimension size = new Dimension(20, 20);
        driver.manage().window().setSize(size);

        String[] keywords = header.split(" ");
        keywords[0] = keywords[0].toLowerCase(Locale.ROOT);
        keywords[0] = keywords[0].replace(keywords[0].charAt(0), Character.toUpperCase(keywords[0].charAt(0)));
        String xpath = "//*[contains(text(),'" + keywords[0] + "')]/following-sibling::ul[1]/child::li";
        System.out.println(xpath);
        /*WebElement single = driver.findElement(By.xpath("//a[text()='Flights']"));
        Thread.sleep(2000);
        System.out.println(single.getText());*/
        List<WebElement> links = driver.findElements(By.xpath(xpath));
        System.out.println("Total links present under " + header + " are :" + links.size());
        for (int i = 0; i < links.size(); i++) {
            //Thread.sleep(1000);
            String text = links.get(i).getAttribute("data-cy").replaceAll("\\d", "");
            System.out.println("Link" + (i + 1) + " : " + text.replaceAll("-", ""));
            //System.out.println("links"+(i+1)+":"+links.get(i).getText());
        }
    }

    @Test
    void makeMyTrip() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        driver = new ChromeDriver();
        //please separate words before passing in getLink for MakeMyTrip header
        getLinks("ABOUT THE SITE");
        driver.close();
    }
}
