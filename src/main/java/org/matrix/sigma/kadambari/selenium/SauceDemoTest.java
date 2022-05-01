package org.matrix.sigma.kadambari.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.saucedemo.com/");//open in URL
        driver.manage().window().maximize(); // maximize the window
        driver.findElement(By.name("user-name")).sendKeys("UserOne");
        driver.findElement(By.name("password")).sendKeys("Selenium");
        driver.findElement(By.name("LOGIN")).click();
        String exptTitle="Swag labs";
        String actualTitle= driver.getTitle();
        if(exptTitle.equals(actualTitle)){
            System.out.println("The page of title is :" +exptTitle);
            System.out.println("Test case pass");
        }else {
            System.out.println("Test case failed");
        }
        driver.close();
    }
}
