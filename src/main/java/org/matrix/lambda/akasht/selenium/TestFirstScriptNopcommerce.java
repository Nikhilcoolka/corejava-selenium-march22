package org.matrix.lambda.akasht.corejava.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirstScriptNopcommerce {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
//        Options op = driver.manage();
//        Window win = op.window();
//        win.maximize();

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("Email")).sendKeys("Akashtoradmalle@gmail.com");

        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("Akash@123");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        WebElement errorMessage = driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        boolean status = errorMessage.isDisplayed(); // True/False

        if (status) {
            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }

        Thread.sleep(4000);
        driver.close();
    }
}

