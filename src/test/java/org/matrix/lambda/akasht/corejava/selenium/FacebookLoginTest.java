package org.matrix.lambda.akasht.corejava.selenium;

import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest extends TestCase {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement Login = driver.findElement(By.id("u_0_v"));
        username.sendKeys("Akash.toradmalle@xyz.com");
        password.sendKeys("AKash@123");
        Login.click();
        Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement navigationclick = driver.findElement(By.id("logoutMenu"));
        WebElement logout = driver.findElement(By.xpath("//div[@id='u_d_1']/div/div/div/div/div/ul/li[12]/a/span/span"));
        navigationclick.click();
        if (logout.isEnabled() && logout.isDisplayed()) {
            logout.click();
        } else {
            System.out.println("Element not found");
        }

    }


}