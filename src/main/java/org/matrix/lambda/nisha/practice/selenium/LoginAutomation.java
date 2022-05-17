package org.matrix.lambda.nisha.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginAutomation {

    public static void main(String[] args) {

                System.setProperty("webdriver.chrome.driver", "D:\\Ni\\Downloads\\chromedriver_win32\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();

                driver.get("https://www.browserstack.com/users/sign_in");
                WebElement userName = driver.findElement(By.id("user_email_login"));
                userName.sendKeys("Nishusingam@gmail.com");

                WebElement password =  driver.findElement(By.id("user_email_login"));
                password.sendKeys("Deepsha2707");

                WebElement signMeIn = driver.findElement(By.name("commit"));
                signMeIn.click();


                // WebElement signMeIn =  newDriver.findElement(By.name("//input[@value='Sign me in']"));
                //signMeIn.click();

        String actualUrl = "https://www.browserstack.com/users/sign_in";
        String expectedUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);

    }
}




/*
path
chromedriver
maximize
page url
inspect

 */