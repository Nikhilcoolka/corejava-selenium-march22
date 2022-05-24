package org.matrix.sigma.niksangli.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frametest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        driver.findElement(By.xpath("//div[@id='draggable']")).click();

        WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));

        WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions a=new Actions(driver);

        a.dragAndDrop(source,target).build().perform();

        driver.switchTo().defaultContent(); // normal operation




    }
}
