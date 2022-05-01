package org.matrix.delta.prem.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_FB {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.name("email")).sendKeys("prem1511@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("prem117744");
        driver.findElement(By.name("login")).click();

        Thread.sleep(2000);

        WebElement error_message = driver.findElement(By.xpath("//div[@class='_9ay7']"));
        if(error_message.isDisplayed()){
            System.out.println("test case pass");
        }else{
            System.out.println("test case fail");
        }
        driver.close();
    }
}
