package org.matrix.delta.laxmi.selenium.assignments;

import org.matrix.delta.laxmi.selenium.TestPropertiesScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AssignmentEight {

    @Test
    public static void verifyFirstMainMenuLinks() throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(TestPropertiesScript.readPropertyDemo("orange_hrm_url"));

        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);

        ArrayList<String> expectedLinks = new ArrayList<>();
        expectedLinks.add("Admin");
        expectedLinks.add("PIM");
        expectedLinks.add("Leave");
        expectedLinks.add("Time");
        expectedLinks.add("Recruitment");
        expectedLinks.add("My Info");
        expectedLinks.add("Performance");
        expectedLinks.add("Dashboard");
        expectedLinks.add("Directory");
        expectedLinks.add("Maintenance");
        expectedLinks.add("Buzz");

        ArrayList<String> actualLinks = new ArrayList<>();
        List<WebElement> links = driver.findElements(By.xpath("//a[@class='firstLevelMenu']//b"));
        for (WebElement element : links) {
            actualLinks.add(element.getText());
        }
        Assert.assertEquals(actualLinks, expectedLinks);
        driver.close();
    }
}
