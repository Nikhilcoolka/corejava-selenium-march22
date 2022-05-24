package org.matrix.sigma.niksangli.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actionconcept {

    @Test
    public  void verifyRightclick() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement  btnrightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions a1=new Actions(driver);
        a1.contextClick(btnrightclick).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Copy']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

    }

    @Test
    public  void doubleClick() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement doublebtn=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions a2=new Actions(driver);
        a2.doubleClick(doublebtn).build().perform();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

    }
    @Test
     public  void verifyKeyboardaction() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement txtsearch=driver.findElement(By.xpath("//input[@name='s']"));
        Actions a3=new Actions(driver);
        a3.keyDown(txtsearch,Keys.SHIFT).sendKeys("Nikhil").keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(2000);

    }

    @Test
    public void VerifyMovetoelement() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement link=driver.findElement(By.xpath("//a[text()='Contribute']"));
        Actions a4=new Actions(driver);
        a4.moveToElement(link).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Style Guides']")).click();

    }



}
