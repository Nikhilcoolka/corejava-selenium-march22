package org.matrix.alpha.shamal.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class TestFaceBookPageLogin {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","F:\\chromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/login/"); //Get URL

        driver.manage().window().maximize(); //Maximize the window

        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("Shamal@gmail.com"); // Enter the user name


        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("Shamal123");

        Thread.sleep(2000);
        driver.findElement(By.id("loginbutton")).click();

        WebElement errorMsg = driver.findElement(By.xpath("//div[text()='The password that you've entered is incorrect. Forgotten password?']"));

        boolean status = errorMsg.isDisplayed(); // True/False

        if(status) {
            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }

        sleep(4000);
        driver.close();



    }
}
