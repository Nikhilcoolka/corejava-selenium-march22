package org.matrix.sigma.niksangli.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecuterprogram {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        JavascriptExecutor js=(JavascriptExecutor)driver;
        // to get tititle and url
        String title=js.executeScript("return document.title").toString();
        System.out.println(title);
        Thread.sleep(2000);

         // refresh browser
        js.executeScript("location.reload()");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        // to reload and back

        js.executeScript("history.back()");
        Thread.sleep(2000);
        js.executeScript("history.forward");
        Thread.sleep(2000);

        //To click on element

        //js.executeScript("arguments[0].click()",btn);
        driver.close();





    }
}
