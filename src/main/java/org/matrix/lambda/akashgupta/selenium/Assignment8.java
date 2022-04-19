package org.matrix.lambda.akashgupta.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class Assignment8 {

    WebDriver driver = new ChromeDriver();

    void login() throws IOException, InterruptedException {
        driver.get(ReadProperties.getKey("urlohrm"));
        driver.findElement(By.id("txtUsername")).sendKeys(ReadProperties.getKey("uIdohrm"));
        driver.findElement(By.id("txtPassword")).sendKeys(ReadProperties.getKey("passwordohrm"));
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);

    }

    @Test
    void ohrmTabMenu() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        login();
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
