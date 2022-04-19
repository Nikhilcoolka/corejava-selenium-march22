package org.matrix.delta.rahul.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstSel {

        public static void main(String[] args) throws InterruptedException {

            WebDriverManager.edgedriver().setup();
            WebDriver driver = new EdgeDriver();
            driver.get("https://demo.nopcommerce.com/");
            driver.manage().window().maximize();

            driver.findElement(By.xpath("//a[text()='Log in']")).click();

            Thread.sleep(2000);
            driver.findElement(By.id("Email")).sendKeys("shendagerb@gmail.com");

            Thread.sleep(2000);
            driver.findElement(By.id("Password")).sendKeys("152452");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[text()='Log in']")).click();

            WebElement errorMessage = driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
            boolean status = errorMessage.isDisplayed();

            if(status) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }

            Thread.sleep(4000);
            driver.close();
        }
    }


