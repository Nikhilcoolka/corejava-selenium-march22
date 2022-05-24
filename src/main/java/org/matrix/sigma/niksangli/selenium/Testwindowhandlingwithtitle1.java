package org.matrix.sigma.niksangli.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Testwindowhandlingwithtitle1 {

    @Test
    public void hwindow2() throws InterruptedException {
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
            // use get title insted of window
            String title=driver.switchTo().window(window).getTitle();
            if(title.contains("Basic Control"))
            {
                System.out.println("Child window title" +driver.getTitle());
                driver.findElement(By.id("lastName")).sendKeys("nikhil");
                Thread.sleep(2000);
                driver.close();  // child window close
            }
        }
        driver.switchTo().window(parent);  // parent window close
        //driver.switchTo().defaultContent() // will switch to parent window
        driver.close();

    }

}
