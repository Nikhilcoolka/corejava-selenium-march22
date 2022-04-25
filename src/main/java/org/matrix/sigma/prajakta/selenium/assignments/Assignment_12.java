package org.matrix.sigma.prajakta.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Assignment_12 {

    public String linkStr = "Product Offering";

    public static String readProperty(String key) throws IOException {
        FileInputStream fin = new FileInputStream("D:\\Automation\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\sigma\\prajakta\\selenium\\assignments\\read.properties");
        Properties prop = new Properties();
        prop.load(fin);
        String value = prop.getProperty(key);
        return value;
    }

    @Test
    public void fetchUrl() throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(readProperty("trip_url"));
        driver.manage().window().maximize();
        Thread.sleep(2000);

        ArrayList<String> expectedLinks = new ArrayList<>();
        expectedLinks.add("Flights");
        expectedLinks.add("International Flights");
        expectedLinks.add("Charter Flights");
        expectedLinks.add("Hotels");
        expectedLinks.add("International Hotels");
        expectedLinks.add("Homestays and Villas");
        expectedLinks.add("Activities");
        expectedLinks.add("Holidays In India");
        expectedLinks.add("International Holidays");
        expectedLinks.add("Book Hotels From UAE");
        expectedLinks.add("myBiz for SME Travel");
        expectedLinks.add("Book Online Cabs");
        expectedLinks.add("Book Bus Tickets");
        expectedLinks.add("Book Train Tickets");
        expectedLinks.add("Cheap Tickets to India");
        expectedLinks.add("Book Flights From US");
        expectedLinks.add("Book Flights From UAE");
        expectedLinks.add("Trip Planner");
        expectedLinks.add("Gift Cards");
        expectedLinks.add("Trip Money");
        expectedLinks.add("Trip Ideas");
        expectedLinks.add("Travel Blog");
        expectedLinks.add("PNR Status");
        expectedLinks.add("MakeMyTrip Advertising Solutions");
        expectedLinks.add("One Way Cab");

        System.out.println("Expected links :: " + expectedLinks);

        List<WebElement> links = driver.findElements(By.xpath("//p[text()='" + linkStr + "']/parent::div/child::ul[1]//li//a"));
        List<String> actualLinks = new ArrayList<>();

        for (WebElement link : links) {
            actualLinks.add(link.getText());
        }

        Assert.assertEquals(actualLinks, expectedLinks);
        driver.close();
    }
}
