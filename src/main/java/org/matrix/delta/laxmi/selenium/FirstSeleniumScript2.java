package org.matrix.delta.laxmi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://epaper.esakal.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement selectedOption = driver.findElement(By.xpath("//select/option[text()='Sangli']"));
        boolean cText = selectedOption.isDisplayed();


        if (cText) {
            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }
        driver.close();


    }
}
