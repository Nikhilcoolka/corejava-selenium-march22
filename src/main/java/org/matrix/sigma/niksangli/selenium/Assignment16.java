package org.matrix.sigma.niksangli.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class Assignment16 {

    @Test
    public void keyboardmoueseEvent() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement btntxtbox =driver.findElement(By.xpath("//input[@name='s']"));
        Actions a1=new Actions(driver);
        a1.keyDown(btntxtbox, Keys.SHIFT).sendKeys("nikhil").keyUp(Keys.SHIFT).doubleClick().build().perform();
        Thread.sleep(2000);
        a1.sendKeys(Keys.BACK_SPACE).build().perform();
        Thread.sleep(2000);
        driver.close();

        // a1.keyDown(btntxtbox, Keys.SHIFT).sendKeys("nikhil").
        //                keyUp(Keys.SHIFT).
        //                doubleClick(btntxtbox).sendKeys(Keys.BACK_SPACE).
        //                build().perform();








    }
}
