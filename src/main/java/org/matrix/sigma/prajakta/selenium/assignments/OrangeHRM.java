package org.matrix.sigma.prajakta.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class OrangeHRM {

    public static String readProperty(String key) throws IOException {
        FileInputStream fin = new FileInputStream("D:\\Automation\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\sigma\\prajakta\\selenium\\assignments\\read.properties");
        Properties prop = new Properties();
        prop.load(fin);
        String value = prop.getProperty(key);
        return value;
    }

    @Test
    public static void getTabs() throws IOException, InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get(readProperty("orange_url"));
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.id("txtUsername")).sendKeys(readProperty("ora_user_name"));
        Thread.sleep(2000);

        driver.findElement(By.name("txtPassword")).sendKeys(readProperty("ora_password"));
        Thread.sleep(2000);

        driver.findElement(By.id("btnLogin")).click();

        WebElement web = driver.findElement(By.xpath("//ul[@id='mainMenuFirstLevelUnorderedList']//li[@class='main-menu-first-level-list-item']"));
        boolean status = web.isDisplayed();

        Assert.assertTrue(status);
        System.out.println("All tabs are present.");

        driver.close();
    }
}
