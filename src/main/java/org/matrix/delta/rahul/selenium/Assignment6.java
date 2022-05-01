package org.matrix.delta.rahul.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class Assignment6 {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.google.com/");
        d.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("Selenium");
        List<WebElement> list = d.findElements(By.xpath("//span[text()='selenium']"));
        System.out.println(list.size());

        for (WebElement web : list) {
            System.out.println(web.getText());

        }
        d.close();


    }
}
