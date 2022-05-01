package org.matrix.alpha.shamal.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG {

   public WebDriver driver = new ChromeDriver();

  @Test
  public void gmailLogin() {
        // launch the Chrome browser and open the application url
        driver.get("https://accounts.google.com/signin/v2/identifier?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3Dsign_in_no_continue%26pli%3D1&ec=GAlAwAE&flowName=GlifWebSignIn&flowEntry=AddSession");

// maximize the browser window
        driver.manage().window().maximize();

// declare and initialize the variable to store the expected title of the webpage.
        String expectedTitle = "shamal@gmail.com - Gmail";

// fetch the title of the web page and save it into a string variable
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

// enter a valid username in the email textbox
        WebElement username = driver.findElement(By.id("identifierId"));
        username.clear();
        username.sendKeys("shamal");

// enter a valid password in the password textbox
       WebElement password = driver.findElement(By.name("password"));
       password.clear();
       password.sendKeys("1234");

// click on the Sign in button
       WebElement SignInButton = driver.findElement(By.xpath("//span[@class=\"VfPpkd-vQzf8d\" and text()=\"Next\"]"));
       SignInButton.click();

// close the web browser
       driver.close();
}
}