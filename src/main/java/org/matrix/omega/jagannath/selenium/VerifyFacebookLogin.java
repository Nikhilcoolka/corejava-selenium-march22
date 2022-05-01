package org.matrix.omega.jagannath.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFacebookLogin {
    WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.drive","H:\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("jagukfghfudale@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Jpk123");
        driver.findElement(By.xpath("//button[@id=\"loginbutton\"]")).click();
        WebElement errorMessage=driver.findElement(By.xpath("//div[text()=\"The email address you entered isn't connected to an account. \"]"));
        boolean status=errorMessage.isDisplayed();
        if(status)
        {
            System.out.println("Test case pass");
        }
        else
        {
            System.out.println("Test case fail");
        }

  driver.close();
    }
}
