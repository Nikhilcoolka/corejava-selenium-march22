package org.matrix.sigma.pankaj.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFacebookLogin {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe"); //
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();  //window maximize


        driver.findElement(By.id("Email")).sendKeys("kurhadepankaj93@gmail.com");
        driver.findElement(By.id("passward")).sendKeys("123456");
        driver.findElement(By.xpath("//button[text()='login']']")).click();

        WebElement errorMessage = driver.findElement(By.xpath("//div[text()='The email address you entered isn't connected to an account. ']"));

        boolean Status = errorMessage.isDisplayed();  //true or false
        if(Status){
            System.out.println("Test Case Pass");
        }else{
            System.out.println("test case fail");
        }

       driver.close();
    }
}
