package org.matrix.sigma.prajakta.selenium.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AssertListUsingArray {

    @Test
    public void getCollection() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        List<WebElement> links=driver.findElements(By.xpath("//p[text()='MakeMyTrip']/following-sibling::ul[1]//li//a"));
        ArrayList<String> actualLinks=new ArrayList<>();

        for (WebElement link:links) {
            actualLinks.add(link.getText());
        }

        System.out.println("Actual links : "+actualLinks);

        List<String> expectedLinks=new ArrayList<>();

        String str="About Us, Investor Relations, Careers, Corporate Travel, MMT Foundation, CSR Policy, myPartner - Travel Agent Portal, Foreign Exchange, List your hotel, Partners- Redbus, Partners- Goibibo, Advertise with Us";
        String [] arr=str.split(",[ ]*");

        for (String s : arr) {
            expectedLinks.add(s);
        }

        System.out.println("Expected Links : "+expectedLinks);

        Assert.assertEquals(actualLinks,expectedLinks);
    }

}
