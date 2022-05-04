package org.matrix.shriniwas.selenium.pageobjectmodelbasics2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    private final String URL = "https://www.saucedemo.com/";

    public WebDriver initBrowser() {
        // Browser Initialization - Start
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        return driver;
    }
}
