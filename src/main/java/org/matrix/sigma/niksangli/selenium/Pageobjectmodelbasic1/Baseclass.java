package org.matrix.sigma.niksangli.selenium.Pageobjectmodelbasic1;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
    private final String url="https://www.saucedemo.com";

    public WebDriver initBrowser() throws InterruptedException
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        return driver;

}


}
