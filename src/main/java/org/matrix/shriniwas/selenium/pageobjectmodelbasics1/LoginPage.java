package org.matrix.shriniwas.selenium.pageobjectmodelbasics1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public void login(WebDriver driver) {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}
