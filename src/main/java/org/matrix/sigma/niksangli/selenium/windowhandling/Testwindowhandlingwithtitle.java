package org.matrix.sigma.niksangli.selenium.windowhandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Testwindowhandlingwithtitle {

    @Test
    public void hwindow1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();

        String parent=driver.getWindowHandle();

        System.out.println("Parent window id is" +parent);

        System.out.println("Parent window title is" +driver.getTitle());

        driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();


        Set<String> windows =driver.getWindowHandles();
        System.out.println("Multiple window handles" +windows);   // showing both parent and child


        for(String window:windows)  // parent 93c0 child 1c81 comes in windows
        {
            if(!window.equals(parent))
            {
                driver.switchTo().window(window);
                System.out.println("Child window title" +driver.getTitle());
                driver.findElement(By.id("lastName")).sendKeys("nikhil");
                driver.close();
            }

        }
        driver.switchTo().window(parent);
        driver.close();

    }

}
