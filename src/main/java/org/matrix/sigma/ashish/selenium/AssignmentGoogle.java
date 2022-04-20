package org.matrix.sigma.ashish.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class AssignmentGoogle {

    public static void main(String[] args) throws InterruptedException  {

        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.30.0-win32\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();

        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("automation");

        List<WebElement> list= driver.findElements(By.xpath("//*[@role=\"option\"]"));

        //driver.findElement(By.xpath("//*[@class='wM6W7d']")).getText();

        //System.out.println(driver.findElement(By.xpath("//*[@class='wM6W7d']")).getText());
        System.out.println("Count= "+list.size());

        for (WebElement webElement : list) {
            System.out.println(webElement.getText());
        }
    }
}
