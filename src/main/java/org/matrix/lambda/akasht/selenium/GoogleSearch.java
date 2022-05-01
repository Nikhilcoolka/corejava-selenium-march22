package org.matrix.lambda.akasht.corejava.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class GoogleSearch {
        public static String readProperty(String key) throws IOException {
            FileInputStream fin = new FileInputStream("C:\\Automation\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\sigma\\prajakta\\selenium\\assignments\\read.properties");
            Properties pro = new Properties();
            pro.load(fin);
            String value = pro.getProperty(key);
            return value;
        }

        public static void main(String[] args) throws IOException, InterruptedException {

            WebDriver.ChromeDriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get(readProperty("url"));
            driver.manage().window().maximize();
            Thread.sleep(1000);

            driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
            Thread.sleep(1000);

            List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']//li/following::div[@class=\"pcTkSc\"]"));

            System.out.println("Total count of elements in search::" + list.size());
            System.out.println("---Elements---");

            String elements;
            for (int i = 0; i < list.size(); i++) {
                elements = list.get(i).getText();
                System.out.println(elements);
            }
            driver.close();
        }
    }