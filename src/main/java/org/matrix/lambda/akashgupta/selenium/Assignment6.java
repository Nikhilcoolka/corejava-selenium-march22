package org.matrix.lambda.akashgupta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Assignment6 {

    @Test
    void googleSearch() throws InterruptedException {
        //setDriver.setDriverProperty("chrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
        System.out.println("Number of search options are:" + list.size());
        Thread.sleep(2000);
        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i).findElement(By.xpath("//li//span")).getText();
            if (i == 0) {
                //String path1 ="//ul[@role='listbox']//li["+i+"]//child::div[@class='wM6W7d']/span";
                System.out.println(word);
            } else {
                String xpath = "//ul[@role='listbox']//li[" + (i + 1) + "]//child::div[@class='wM6W7d']/span/b";
                System.out.println(word + " " + list.get(i).findElement(By.xpath(xpath)).getText());
            }

        }
        driver.close();

    }
}
