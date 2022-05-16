package org.matrix.shriniwas.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class TestWindowHandling {

    @Test
    public void handleWindows() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        String parent = driver.getWindowHandle();
        System.out.println("Parent Window Handle:" +parent); // 9C30

        driver.findElement(By.id("newWindowBtn")).click();

        Set<String> windows = driver.getWindowHandles();
        System.out.println("Multiple Windows: " +windows); // [93C0, 1C81]

        for (String  window : windows) {
            // Parent = 93C0, Child = 1C81,
            if(!window.equals(parent)) {
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
                driver.findElement(By.id("lastName")).sendKeys("Shriniwas");
                driver.close();
            }
        }

        driver.switchTo().window(parent);
        driver.close();
    }
}
