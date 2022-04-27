package org.matrix.alpha.kamlesh.selenium.assignments;
/*
Scenario:Fetch all the links present for the given heading
Steps:
 Navigate to https://www.makemytrip.com/
Fetch all the url for the given heading
 */
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Assignment12 {
@Test
    public void MakeMyTrip(){
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.makemytrip.com/");
    driver.manage().window().maximize();
    ArrayList<String> expectedlinks=new ArrayList<>();
    expectedlinks.add("Customer");
    expectedlinks.add("Payment Security");
    expectedlinks.add("Privacy Policy");
    expectedlinks.add("User Agreement");
    expectedlinks.add("Terms of Service");
    expectedlinks.add("More Offices");
    expectedlinks.add("Make A Payment");
    expectedlinks.add("Work From Home");

    System.out.println("expected " +expectedlinks);
   List<WebElement> links = driver.findElements(By.xpath("//p[text()='About the Site']/following-sibling::ul[1]/li/a"));
   List<String> actuallinks=new ArrayList<>();

   for (WebElement link:links){
       actuallinks.add(link.getText());
   }
}
}
