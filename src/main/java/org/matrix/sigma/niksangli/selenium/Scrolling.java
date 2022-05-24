package org.matrix.sigma.niksangli.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Scrolling {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(2000);
        js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500");
        Thread.sleep(1000);
        List<WebElement> values =driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
        int sum=0;
        for(int i=0;i<values.size();i++)
        {
            sum=sum+Integer.parseInt(values.get(i).getText());  // string to int

        }
        System.out.println(sum);
       int total=Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']"))
                .getText().split(":")[1].trim());
        Thread.sleep(3000);
        Assert.assertEquals(sum,total);
        driver.close();



    }
}
