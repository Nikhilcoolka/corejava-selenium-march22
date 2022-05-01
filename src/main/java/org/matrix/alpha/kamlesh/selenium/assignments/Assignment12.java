package org.matrix.alpha.kamlesh.selenium.assignments;
/*
Scenario:Fetch all the links present for the given heading
Steps:
 Navigate to https://www.makemytrip.com/
Fetch all the url for the given heading
 */

//import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Assignment12 {
    @Test
    public void MakeMyTrip() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        Dimension di = new Dimension(1080, 1080);
        driver.manage().window().setSize(di);

        ArrayList<String> expectedlinks = new ArrayList<>();
        List<WebElement> links = driver.findElements(By.xpath("//p[text()='MakeMyTrip']/following-sibling::ul[1]/li/a"));
        List<String> actuallinks = new ArrayList<>();
        expectedlinks.add("About Us");
        expectedlinks.add("Investor Relations");
        expectedlinks.add("Careers");
        expectedlinks.add("Corporate Travel");
        expectedlinks.add("MMT Foundation");
        expectedlinks.add("CSR Policy");
        expectedlinks.add("myPartner - Travel Agent Portal");
        expectedlinks.add("Foreign Exchange");
        expectedlinks.add("List your hotel");
        expectedlinks.add("Partners- Redbus");
        expectedlinks.add("Partners- Goibibo");
        expectedlinks.add("Advertise with Us");

        for (WebElement link : links) {
            actuallinks.add(link.getText());
        }
        System.out.println("actual size" +actuallinks.size());
        System.out.println("actual " + actuallinks);
        System.out.println("expeted" + expectedlinks);

        Assert.assertEquals(actuallinks, expectedlinks);
    }
}

