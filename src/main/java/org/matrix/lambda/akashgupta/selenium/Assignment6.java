package org.matrix.lambda.akashgupta.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Assignment6 {

    @Test
    void googleSearch() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation");
        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
        System.out.println("Number of search options are:" + list.size());
        Thread.sleep(2000);
        System.out.println("Elements:");
        for (WebElement webElement : list) {
            System.out.println(webElement.getText());
        }
        driver.close();

    }
}
