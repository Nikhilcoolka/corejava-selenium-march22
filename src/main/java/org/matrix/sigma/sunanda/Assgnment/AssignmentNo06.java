package org.matrix.sigma.sunanda.Assgnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AssignmentNo06 {
    public static void main(String[] args)
            throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']"));
        System.out.println("Total count of elements in search :: " + list.size());
        System.out.println("------Elements------");

        for (WebElement web : list) {
            System.out.println(web.getText());
        }
        driver.close();
    }
}

