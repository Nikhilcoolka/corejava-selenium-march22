package org.matrix.sigma.sunanda.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo03 {
    public static void main(String[] args)
        throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        String actualTitle = driver.getTitle();
        String title = "Swag Labs";
        if (actualTitle.equals(title)) {
            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }
        driver.close();
    }
}
