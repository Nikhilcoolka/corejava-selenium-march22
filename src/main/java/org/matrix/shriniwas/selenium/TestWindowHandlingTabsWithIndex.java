package org.matrix.shriniwas.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestWindowHandlingTabsWithIndex {

    @Test
    public void handleWindows() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        String parent = driver.getWindowHandle();
        System.out.println("Parent Window Handle:" +parent); // 9C30

        driver.findElement(By.id("newTabsBtn")).click();

        Set<String> windows = driver.getWindowHandles();
        System.out.println("Multiple Windows: " +windows); // [93C0, 1C81]

        List<String> tabs = new ArrayList<>(windows);

        driver.switchTo().window(tabs.get(2));

        Thread.sleep(3000);
        System.out.println("Title: " +driver.getTitle());

//        driver.switchTo().window(parent);
//        driver.close();
    }
}
