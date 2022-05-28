package org.matrix.sigma.niksangli.selenium.windowhandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Tabhandlingwithindex {

    @Test
    public void hwindow4() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");


        String parent=driver.getWindowHandle();

        System.out.println("Parent window id is" +parent);

        System.out.println("Parent window title is" +driver.getTitle());

        driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();


        Set<String> windows =driver.getWindowHandles();
        System.out.println("Multiple window handles" +windows);   // showing both parent and child

        // convert set into list because set not having get method

        List<String> tabs=new ArrayList<>(windows);
        String str=driver.switchTo().window(tabs.get(1)).getTitle();
        System.out.println(str);
        Thread.sleep(2000);
        System.out.println("Title is" +driver.getTitle());
        driver.quit();


    }


}
