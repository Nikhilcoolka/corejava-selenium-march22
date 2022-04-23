package org.matrix.sigma.pankaj.selenium.testngconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestngFirstProgramme {

    public static String readproperty(String key) throws InterruptedException, IOException {

        FileInputStream fin = new FileInputStream("C:\\Automation testing class\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\sigma\\pankaj\\selenium\\config.properties");
        Properties prop = new Properties();
        prop.load(fin);
        String value = prop.getProperty(key);
        return value;

    }

    @Test
    public void VerifyLogin() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(readproperty("Url"));
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys(readproperty("Username"));
        driver.findElement(By.id("password")).sendKeys(readproperty("Passward"));
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.xpath("//span[@class=\"shopping_cart_badge\"]"));

    }

}
