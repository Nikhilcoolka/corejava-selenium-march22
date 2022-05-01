package org.matrix.sigma.ashish.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.List;

public class Assignment10Assert extends AllinOne  {

    public static void login(WebDriver driver) throws IOException {
        driver.get(readProp("url2"));
        driver.findElement(By.xpath("//div[@class='section group']/div[1]//a")).click();
        driver.findElement(By.className("form-control")).sendKeys(readProp("UserName2"));
        driver.findElement(By.xpath("//*[@class='form-control password']")).sendKeys(readProp("Password2"));
        driver.findElement(By.xpath("//button[@name='submit']")).click();
    }

    public static void DashList(WebDriver driver){
        List<WebElement> Dashboard = driver.findElements(By.xpath("//*[@class='row']//a"));
        System.out.println(" ");
        for (WebElement webElement : Dashboard) {
            System.out.println(webElement.getText());
        }
        //Asserts(Dashboard.get(0).getText(),"Update Profile");

    }

    public static void main(String[] args) throws IOException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        login(driver);

        DashList(driver);
      //  NavigList();
    }
}
