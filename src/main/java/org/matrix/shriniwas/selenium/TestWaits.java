package org.matrix.shriniwas.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestWaits {

    @Test
    public void verifyWaits() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://testproject.io/");
        driver.manage().window().maximize();

        // 1. pageLoadTimeout - Default Timeout 300 sec
        // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // 2. ImplicitWait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String parent = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[text()='Login']")).click();

        Set<String> handles = driver.getWindowHandles();
        List<String> windows = new ArrayList<>(handles);
        driver.switchTo().window(windows.get(1));

        // Thread.sleep(3000);

        driver.findElement(By.id("username")).sendKeys("Shriniwas@gmail.com");
    }

}
