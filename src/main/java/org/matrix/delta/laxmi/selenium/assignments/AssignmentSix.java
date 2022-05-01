package org.matrix.delta.laxmi.selenium.assignments;

import org.matrix.delta.laxmi.selenium.TestPropertiesScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class AssignmentSix {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(TestPropertiesScript.readPropertyDemo("google_url"));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
        Thread.sleep(2000);

        List<WebElement> listElements=driver.findElements(By.tagName("li"));
        System.out.println("Total No. of suggestions in google search are:"+(listElements.size()-1));

        for (WebElement ele:listElements) {
            System.out.println(ele.getText());
        }
        driver.close();
    }
}