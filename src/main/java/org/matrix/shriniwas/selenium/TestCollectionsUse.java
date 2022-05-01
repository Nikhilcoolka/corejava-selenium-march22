package org.matrix.shriniwas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestCollectionsUse {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("");

        WebElement element = driver.findElement(By.id("abc"));
        List<WebElement> elements = driver.findElements(By.xpath("//a"));
        System.out.println(elements.size());

        for (WebElement element1 : elements) {
            System.out.println(element1.getText());
        }
    }
}
