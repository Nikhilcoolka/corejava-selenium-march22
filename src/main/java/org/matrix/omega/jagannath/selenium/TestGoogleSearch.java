package org.matrix.omega.jagannath.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestGoogleSearch {
    WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.drive","H:\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Selenium");
        Thread.sleep(4000);
        driver.findElements(By.xpath("//ul[@role='listbox']//li"));
        List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li"));

        //List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descedent::div[@class='sbct']"));
        System.out.println("Size of list "+list.size());
        //Using for loop
        System.out.println("Using for loop print search text ");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(i+" "+list.get(i).getText());
        }
        //Using for each loop
        System.out.println("Using for each loop print search text ");
        for (WebElement link:list)
        {
            System.out.println(link.getText());
        }
         //Finding  selenium webdriver and click
        //selenium webdriver
        for(int i=0;i< list.size();i++)
        {
            if(list.get(i).getText().contains("selenium webdriver"))
            {
                list.get(i).click();
                break;
            }
        }
        Thread.sleep(400);
       driver.close();
    }
}
