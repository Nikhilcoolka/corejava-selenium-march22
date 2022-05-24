package org.matrix.sigma.niksangli.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Testwindowhandling {

        @Test
        public void handlewindow() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            String parent=driver.getWindowHandle();

            System.out.println("Parent window id is" +parent);

            driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();


            Set<String> windowHandle =driver.getWindowHandles();
            System.out.println("Multiple window handles" +windowHandle);   // showing both parent and child

        //---- //input[@id='firstName']

            for(String childwindow:windowHandle)
            {
                 if(!parent.equals(windowHandle))
                 {
                     driver.switchTo().window(childwindow);
                 }
                 driver.close();
            }



        }
}
