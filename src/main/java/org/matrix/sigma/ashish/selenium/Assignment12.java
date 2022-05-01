package org.matrix.sigma.ashish.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.List;

public class Assignment12 extends Assignment7SauceDemo {

    public static void FindLinks(WebDriver driver,String header) throws IOException,IndexOutOfBoundsException {
        driver.get(readProperties("url3"));
        String newxpath="//*[text()='"+header+"']/following-sibling::ul[1]/li/a";
        List<WebElement> Links = driver.findElements(By.xpath(newxpath));
        int count=Links.size();
        System.out.println("No of Links in "+header+ " are "+count);
        for(int i=0;i<=count;i++) {
            System.out.println(Links.get(i).getText());
        }

        driver.close();
    }

    public static void main(String[] args) throws IOException,IndexOutOfBoundsException {

        System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.30.0-win32\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
       FindLinks(driver,"MakeMyTripa");

    }
}
