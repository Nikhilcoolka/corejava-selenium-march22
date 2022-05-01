package org.matrix.sigma.prajakta.selenium.practice.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public boolean login(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("prajakta@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("paju123");
        Thread.sleep(2000);
        driver.findElement(By.id("loginbutton")).click();

        WebElement errorMessage=driver.findElement(By.xpath("//div[@class='_9ay7']"));
        boolean error=errorMessage.isDisplayed();
        return error;
    }
}
