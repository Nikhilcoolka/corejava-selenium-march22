package org.matrix.lambda.akashgupta.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class Assignment8 {

    WebDriver driver = new ChromeDriver();

    void login() throws IOException, InterruptedException {
        driver.get(ReadProperties.getKey("url_ohrm"));
        driver.findElement(By.id("txtUsername")).sendKeys(ReadProperties.getKey("uId_ohrm"));
        driver.findElement(By.id("txtPassword")).sendKeys(ReadProperties.getKey("password_ohrm"));
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);

    }

    void resetPassword() throws InterruptedException {
        System.out.println("Trying to reset password  ");
        driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("securityAuthentication_userName")).sendKeys("Admin");
        driver.findElement(By.id("btnSearchValues")).click();
        try {//pause code execution by f8 and inspect by cursor for quickly disappearing element
            WebElement element = driver.findElement(By.xpath("//div//child::div//div[3]/div[1]"));
            System.out.println(element.getText());
        } catch (NoSuchElementException e) {
            System.out.println("error message not displayed");
        }
    }

    @Test
    void ohrmTabMenu() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        login();
        try {
            WebElement loginFailed = driver.findElement(By.id("spanMessage"));
            if (loginFailed.isDisplayed()) {
                System.out.println("login failed: " + loginFailed.getText());
                resetPassword();
                driver.close();
                return;
            }
        } catch (NoSuchElementException e) {
        }
        List<WebElement> tabs = driver.findElements(By.xpath("//ul[@id='mainMenuFirstLevelUnorderedList']/li"));
        if (tabs.size() != 11) {
            System.out.println("Tabs missing");
            driver.close();
            return;
        } else {
            System.out.println("Present tabs are:");
            for (int i = 0; i < 11; i++) {
                if (tabs.get(i).isDisplayed()) {
                    System.out.println(i + ":\t" + tabs.get(i).getText());
                }
            }
        }
        driver.close();

    }


}
