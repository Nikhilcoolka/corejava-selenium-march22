package org.matrix.sigma.niksangli.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirstScript {
    static WebDriver driver;

    public static void main(String[] args) {
        String browser = "Chrome";
        if (browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    "D:\\D-Drive-Study comapny\\SeleniumDriver\\Driver\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equals("Firefox")) {
            System.setProperty("webdriver.chrome.driver",
                    "D:\\D-Drive-Study comapny\\SeleniumDriver\\Driver\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equals("edge")) {
            System.setProperty("webdriver.chrome.driver",
                    "D:\\D-Drive-Study comapny\\SeleniumDriver\\Driver\\chromedriver_win32\\chromedriver.exe");
            driver = new EdgeDriver();
        }

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.close();
    }

}
