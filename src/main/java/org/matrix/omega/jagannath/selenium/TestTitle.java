package org.matrix.omega.jagannath.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class TestTitle {
    WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "H:\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//title[text()=\"Swag Labs\"]"));
        WebElement verifyTitle=driver.findElement(By.xpath("//title[text()=\"Swag Labs\"]"));
        String actualTitle=driver.getTitle();
        String expectedTitle="Swag Labs";
        if(actualTitle.equalsIgnoreCase(expectedTitle))
        {
            System.out.println("Verify the title test case is pass");
        }
        else
        {
            System.out.println("Verify the title test case is fail");
        }

        // Assert.assertEquals("actualTitle","expectedTitle");
        driver.close();

    }


}
