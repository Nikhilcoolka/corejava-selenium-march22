package org.matrix.sigma.pankaj.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirst1Script {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Log in']")).click();


        driver.findElement(By.id("Email")).sendKeys("pankaj@gmail.com");


        driver.findElement(By.id("Password")).sendKeys("pankaj123");


        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        WebElement errorMessage = driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
          boolean Status = errorMessage.isDisplayed();  //true or false
        if(Status){
            System.out.println("Test Case Pass");
        }else{
            System.out.println("test case fail");
        }

        driver.close();

    }
}
