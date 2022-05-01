package org.matrix.sigma.prajakta.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Assignment_12 {

    public String linkStr = "Product Offering";

    public static String readProperty(String key) throws IOException {
        FileInputStream fin = new FileInputStream("D:\\Automation\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\sigma\\prajakta\\selenium\\assignments\\read.properties");
        Properties prop = new Properties();
        prop.load(fin);
        String value = prop.getProperty(key);
        return value;
    }

    @Test
    public void fetchUrl() throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(readProperty("trip_url"));
        driver.manage().window().maximize();
        Thread.sleep(2000);

        List<WebElement> links = driver.findElements(By.xpath("//p[text()='" + linkStr + "']/following-sibling::ul[1]//li/a"));
        System.out.println("Link present under " + linkStr + " are : " + links.size());
        System.out.println("---------------------------------------------------------");

        int i = 1;
        for (WebElement link : links) {
            System.out.println("link : " + i + " " + link.getText());
            i++;
        }

        driver.close();
    }
}
