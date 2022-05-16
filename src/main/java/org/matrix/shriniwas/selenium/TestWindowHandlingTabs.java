package org.matrix.shriniwas.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class TestWindowHandlingTabs {

    @Test
    public void handleWindows() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        String parent = driver.getWindowHandle();
        System.out.println("Parent Window Handle:" +parent); // 9C30

        driver.findElement(By.id("newTabBtn")).click();

        Set<String> windows = driver.getWindowHandles();
        System.out.println("Multiple Windows: " +windows); // [93C0, 1C81]

        for (String  window : windows) {
            // Parent = 93C0, Child = 1C81,
            if(!window.equals(parent)) {
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
                Thread.sleep(4000);
                driver.close();
            }
        }

        driver.switchTo().window(parent);
        driver.close();
    }
}
