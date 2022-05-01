package org.matrix.shriniwas.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WebElementMethods {

    @Test
    public void verifyMethods() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

       // driver.findElement(By.id("user-name")).sendKeys("standard_user");
        WebElement txtUserName = driver.findElement(By.id("user-name"));
        txtUserName.sendKeys("standard_user");
        txtUserName.getText();

        WebElement el = driver.findElement(By.id("abc"));
        String text = el.getText();
        System.out.println(text);

        el.isSelected();
        el.getAttribute("name");
        el.getTagName();
       // el.getScreenshotAs();

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        // [link1, link2]
        for (WebElement link : links) {

        }
    }
}
