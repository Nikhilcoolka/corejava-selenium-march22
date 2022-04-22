package org.matrix.lambda.akashgupta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class Assignment10 {

    WebDriver driver = new ChromeDriver();

    void login() throws IOException, InterruptedException {

        driver.findElement(By.className("form-control")).sendKeys(ReadProperties.getKey("uId"));
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ReadProperties.getKey("password"));
        driver.findElement(By.xpath("//button[@name='submit']")).click();
        Thread.sleep(2000);

    }

    @Test
    void hospitalComponent() throws IOException, InterruptedException {
        driver.navigate().to(ReadProperties.getKey("url"));
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='section group']/div[1]//a")).click();
        Thread.sleep(1000);
        login();
        try {
            List<WebElement> navList = driver.findElements(By.xpath("//ul[@class='main-navigation-menu']/li"));
            if (navList.size() == 4 && navList.get(0).getText().equals("Dashboard") &&
                    navList.get(1).getText().equals("Book Appointment") &&
                    navList.get(2).getText().equals("Appointment History") &&
                    navList.get(3).getText().equals("Medical History"))
                System.out.println("Nav list present");
            else System.out.println("Nav list missing");
        } catch (NoSuchElementException e) {
        }

        try {
            List<WebElement> dashBoard = driver.findElements(By.xpath("//div[@class='container-fluid container-fullw bg-white']/div/div//a"));
            if (dashBoard.size() == 3) {
                dashBoard.get(0).click();
                if (driver.findElement(By.xpath("//h1[contains(text(),'User | Edit Profile')]")).isDisplayed())
                    driver.navigate().back();
                else {
                    System.out.println("DashBoard  \"Edit Profile\" link not working");
                    driver.close();
                    return;
                }
                driver.navigate().refresh();
                dashBoard = driver.findElements(By.xpath("//div[@class='container-fluid container-fullw bg-white']/div/div//a"));
                System.out.println(dashBoard.get(1).isDisplayed());
                Thread.sleep(2000);
                dashBoard.get(1).click();
                if (driver.findElement(By.xpath("//h1[contains(text(),'User  | Appointment History')]")).isDisplayed())
                    driver.navigate().back();
                else {
                    System.out.println("DashBoard \"Appointment History\" link not working");
                    driver.close();
                    return;
                }
                dashBoard = driver.findElements(By.xpath("//div[@class='container-fluid container-fullw bg-white']/div/div//a"));
                Thread.sleep(2000);
                dashBoard.get(2).click();
                if (driver.findElement(By.xpath("//h1[contains(text(),'User | Book Appointment')]")).isDisplayed())
                    driver.navigate().back();
                else {
                    System.out.println("DashBoard \"Book Appointment\" link not working");
                    driver.close();
                    return;
                }
                System.out.println("Dashboard elements Present and working");

            } else {
                System.out.println("DashBoard Element missing ");
                driver.close();
                return;
            }
        } catch (NoSuchElementException e) {
        }

        driver.close();

    }
}
