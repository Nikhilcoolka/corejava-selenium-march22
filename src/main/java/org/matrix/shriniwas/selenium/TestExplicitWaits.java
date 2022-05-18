package org.matrix.shriniwas.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestExplicitWaits {

    @Test
    public void verifyWaits() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://testproject.io/");
        driver.manage().window().maximize();

        waitForVisibility(driver, 20, By.xpath("//a[text()='Login']"));
        driver.findElement(By.xpath("//a[text()='Login']")).click();

        Set<String> handles = driver.getWindowHandles();
        List<String> windows = new ArrayList<>(handles);
        driver.switchTo().window(windows.get(1));

        // wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("xpath"))));
        waitForVisibility(driver, 10, By.id("username")).sendKeys("Shriniwas");

        // driver.findElement(By.id("username")).sendKeys("Shriniwas");
    }

    public static WebElement waitForVisibility(WebDriver driver, long time, By by) {
        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, time);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;
    }

    public static WebElement waitForVisibilityWithPolling(WebDriver driver, long time, By by) {
        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, time, 2);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;
    }


}
