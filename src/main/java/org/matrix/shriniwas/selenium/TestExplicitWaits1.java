package org.matrix.shriniwas.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestExplicitWaits1 {

    @Test
    public void verifyWaits() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://testproject.io/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Login']")).click();

        // Switch to tab
        Set<String> handles = driver.getWindowHandles();
        List<String> windows = new ArrayList<>(handles);
        driver.switchTo().window(windows.get(1));

        //Explicit Wait
        // WebDriverWait wait = new WebDriverWait(driver, 10, 1000); // 0.5 sec
        // WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernam")));
        // element.sendKeys("Shriniwas");

        // Fluent Wait
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofMillis(1000));
        wait.ignoring(NoSuchElementException.class);

        WebElement element = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        element.sendKeys("Shriniwas");
    }
}
