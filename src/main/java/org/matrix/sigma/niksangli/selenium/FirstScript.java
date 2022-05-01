package org.matrix.sigma.niksangli.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

    public static void main(String[] args) throws InterruptedException {

        // invoking browser
        System.setProperty("webdriver.chrome.driver",
                "D:\\D-Drive-Study comapny\\SeleniumDriver\\Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.close();

    }
}
