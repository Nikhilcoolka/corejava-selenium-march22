package org.matrix.omega.neha.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class TestFirstScript {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.dropbox.com/login");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button['log in with Google']")).click();

        Thread.sleep(2000);
       driver.findElement(By.xpath("//button['use another account']")).click();

        Thread.sleep (2000);
        driver.findElement(By.id("identifierId")).sendKeys("nehakonda@gmail.com");

        //Thread.sleep (2000);
       // driver.findElement(By.id("login_password")).sendKeys("madhu0418");

        Thread.sleep (2000);
        driver.findElement(By.xpath("//button['next']"));

        WebElement errorMessage = driver.findElement(By.xpath("//div['Couldn't find your Google Account']"));

        if(errorMessage.isDisplayed()){
            System.out.println("Test case pass");
        } else{
            System.out.println("Test case fail");
        }
        driver.close();

    }
}

