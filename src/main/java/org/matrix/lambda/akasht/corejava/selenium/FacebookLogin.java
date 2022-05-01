package org.matrix.lambda.akasht.corejava.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
//        Options op = driver.manage();
//        Window win = op.window();
//        win.maximize();

        driver.manage().window().maximize();

        //driver.findElement(By.xpath("//input[@id=\"email\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("Akashtoradmalle@gmail.com");

        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("Akash@123");

        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();

        WebElement errorMessage = driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        boolean status = errorMessage.isDisplayed(); // True/False

        status = false;
        if (status) {
            System.out.println("Test case fail");
        } else {
            System.out.println("Test case pass");
        }

        Thread.sleep(4000);
        driver.close();//
    }
}


