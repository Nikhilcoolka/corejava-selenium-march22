package org.matrix.alpha.kamlesh.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebElement {
    @Test
    public void verifyMethods(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        org.openqa.selenium.WebElement user=driver.findElement(By.id("user-name"));
        user.sendKeys("123");
        //String j1=user.getText();
        //System.out.println(j1);
        driver.findElement(By.id("password")).sendKeys("123");
        user.clear();
        String s=user.getAttribute("placeholder");
        System.out.println(s);
        }
}
