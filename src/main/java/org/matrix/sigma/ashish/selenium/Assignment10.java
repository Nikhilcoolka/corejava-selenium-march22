package org.matrix.sigma.ashish.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.List;

public class Assignment10 extends Assignment7SauceDemo {

    public static void login(WebDriver driver) throws IOException {
        driver.get(readProperties("url2"));
        driver.findElement(By.xpath("//div[@class='section group']/div[1]//a")).click();
        driver.findElement(By.className("form-control")).sendKeys(readProperties("UserName2"));
        driver.findElement(By.xpath("//*[@class='form-control password']")).sendKeys(readProperties("Password2"));
        driver.findElement(By.xpath("//button[@name='submit']")).click();
    }

    public static void NavList(WebDriver driver) {
        List<WebElement> HmsList = driver.findElements(By.xpath("//*[@class='item-content']"));
        for (WebElement webElement : HmsList) {
            System.out.println(webElement.getText());
        }
        System.out.println(" ");

        if (HmsList.size()==4 &&
                HmsList.get(0).getText().contains("Dashboard") &&
                HmsList.get(1).getText().contains("Book Appointment") &&
                HmsList.get(2).getText().contains("Appointment History") &&
                HmsList.get(3).getText().contains("Medical History"))
            System.out.println("navigation list present");
            else
            System.out.println("Something missing in Navigation List");
    }

    public static void DashboardList(WebDriver driver) {

        List<WebElement> Dashboard = driver.findElements(By.xpath("//*[@class='row']//a"));
        System.out.println(" ");
        for (WebElement webElement : Dashboard) {
            System.out.println(webElement.getText());
        }
        System.out.println(" ");
        if(Dashboard.get(0).getText().contains("Update Profile") &&
        Dashboard.get(1).getText().contains("View Appointment History") &&
        Dashboard.get(2).getText().contains("Book Appointment"))
            System.out.println("Dashboard List Present");
        else
            System.out.println("Something missing in Dashboard List");


    }

    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.30.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        login(driver);
        NavList(driver);
        DashboardList(driver);
        driver.close();
    }
}
