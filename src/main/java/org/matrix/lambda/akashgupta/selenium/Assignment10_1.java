package org.matrix.lambda.akashgupta.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Assignment10_1 {
    //static WebDriver driver;

    WebDriver initDriver() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(ReadProperties.getKey("url"));
        return driver;
    }

    void loginPatient(WebDriver driver) throws InterruptedException, IOException {
        driver.findElement(By.xpath("//div[@class='section group']/div[1]//a")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("form-control")).sendKeys(ReadProperties.getKey("uId"));
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ReadProperties.getKey("password"));
        driver.findElement(By.xpath("//button[@name='submit']")).click();
        Thread.sleep(1000);
    }

    @Test
    void loginWithWrongCredential() throws IOException, InterruptedException {
        WebDriver driver = initDriver();
        driver.findElement(By.xpath("//div[@class='section group']/div[1]//a")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test12345");
        driver.findElement(By.xpath("//button[@name='submit']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//p/span")).isDisplayed());
        driver.close();
    }

    @Test
    void testNavList() throws IOException, InterruptedException {
        WebDriver driver = initDriver();
        loginPatient(driver);
        List<String> actualList = new ArrayList<>(), expectedList = new ArrayList<>();
        expectedList.add("Dashboard");
        expectedList.add("Book Appointment");
        expectedList.add("Appointment History");
        expectedList.add("Medical History");

        try {
            List<WebElement> navList = driver.findElements(By.xpath("//ul[@class='main-navigation-menu']/li"));
            for (WebElement e : navList) {
                actualList.add(e.getText());
            }
        } catch (NoSuchElementException err) {
            System.out.println("WebElement Error:" + err);
        }
        Assert.assertEquals(actualList, expectedList);
        driver.close();
    }

    @Test
    void testHospitalComponent() throws IOException, InterruptedException {
        WebDriver driver = initDriver();
        loginPatient(driver);
        List<String> actualList = new ArrayList<>(), expectedList = new ArrayList<>();
        expectedList.add("My Profile");
        expectedList.add("My Appointments");
        expectedList.add("Book My Appointment");
        try {
            List<WebElement> dashBoard = driver.findElements(By.xpath("//div/div/div/h2"));
            for (WebElement e : dashBoard) {
                actualList.add(e.getText());
            }
        } catch (NoSuchElementException err) {
            System.out.println("WebElement Error:" + err);
        }
        Assert.assertEquals(actualList, expectedList);
        driver.close();
    }
    /*@AfterTest
    void closeDriver(){
        driver.close();
    }*/


}


















/*if (dashBoard.size() == 3) {
                //dashBoard.get(0).click();
                driver.findElement(By.xpath("//a[contains(text(),'Update')]")).click();
                if (driver.findElement(By.xpath("//h1[contains(text(),'User | Edit Profile')]")).isDisplayed())
                    driver.navigate().back();
                else {
                    System.out.println("DashBoard  \"Edit Profile\" link not working");
                    driver.close();
                    return;
                }
                driver.navigate().refresh();
                dashBoard = driver.findElements(By.xpath("//div[@class='container-fluid container-fullw bg-white']/div/div//a"));
                Thread.sleep(2000);
                dashBoard.get(1).click();
                driver.findElement(By.xpath("//a[contains(text(),'View')]")).click();
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
                driver.findElement(By.xpath("//a[contains(text(),'Book')]")).click();
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
            }*/