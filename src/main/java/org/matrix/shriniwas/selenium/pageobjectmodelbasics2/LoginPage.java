package org.matrix.shriniwas.selenium.pageobjectmodelbasics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // WebElements
    By txtUserName = By.id("user-name");
    By txtPassword = By.id("password");
    By btnLogin = By.id("login-button");

    public LoginPage(WebDriver driver) {
       this.driver = driver;
    }

    // Related Methods
    public void login(String userName, String password) {
        PageActions.enterText(driver, txtUserName, userName);
        PageActions.enterText(driver, txtPassword, password);
        PageActions.click(driver, btnLogin);
    }
}
