package org.matrix.lambda.akashgupta.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Assingment10_2 {
    WebDriver driver;

    @BeforeTest
    void initDriver() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    void loginPatient() throws InterruptedException, IOException {
        driver.get(ReadProperties.getKey("url"));
        driver.findElement(By.xpath("//div[@class='section group']/div[1]//a")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("form-control")).sendKeys(ReadProperties.getKey("uId"));
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ReadProperties.getKey("password"));
        driver.findElement(By.xpath("//button[@name='submit']")).click();
        Thread.sleep(1000);
    }

    @Test
    void loginWithWrongCredential() throws IOException, InterruptedException {
        driver.get(ReadProperties.getKey("url"));
        driver.findElement(By.xpath("//div[@class='section group']/div[1]//a")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test12345");
        driver.findElement(By.xpath("//button[@name='submit']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//p/span")).isDisplayed());
    }

    @Test
    void testNavList() throws IOException, InterruptedException {
        loginPatient();
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
    }

    @Test
    void testHospitalComponent() throws IOException, InterruptedException {
        loginPatient();
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
    }

    @AfterTest
    void closeDriver() {
        driver.close();
    }
}
