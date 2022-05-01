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

public class Assignment_15 {

    public String readProperty(String key) throws IOException {
        FileInputStream fin = new FileInputStream("D:\\Automation\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\sigma\\prajakta\\selenium\\assignments\\read.properties");
        Properties properties = new Properties();
        properties.load(fin);
        String value = properties.getProperty(key);
        return value;
    }

    @Test
    public void checkbox() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(readProperty("checkbox_url"));
        driver.manage().window().maximize();
        Thread.sleep(2000);

        List<WebElement> chkCars = driver.findElements(By.xpath("//input[@type='checkbox']//parent::label"));
        System.out.println("Check box element size : " + chkCars.size());
        Thread.sleep(2000);

        for (WebElement cars : chkCars) {
            String car = cars.getText().trim();
            if (car.equals("Honda")) {
                cars.findElement(By.id("hondacheck")).click();
                Thread.sleep(2000);
            }
        }

        driver.close();
    }
}
