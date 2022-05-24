package org.matrix.sigma.niksangli.selenium.Pageobjectmodelbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

    public void login(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(3000);


    }
}
