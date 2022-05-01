package org.matrix.sigma.niksangli.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreditNirvana {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\D-Drive-Study comapny\\SeleniumDriver\\Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mf.creditnirvana.ai:3012/login");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.id("username")).sendKeys("admin");

        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.name("login")).click();
        Thread.sleep(13000);
        driver.findElement(By.xpath("//div/button[text()='Admin ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/a[contains(text(),' Signout')]")).click();
        Thread.sleep(6000);
        driver.close();

    }
}
