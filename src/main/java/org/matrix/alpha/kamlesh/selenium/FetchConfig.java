package org.matrix.alpha.kamlesh.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static org.matrix.alpha.kamlesh.selenium.ConfigReader.*;

public class FetchConfig {

    @Test
    public void Verifyprop() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getUrl());
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(getUsername());
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(getPass());
    }
}
