package org.matrix.alpha.shamal.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestKesariSignUpForm {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "F:\\chromeDriver\\chromedriver.exe"); // Get the chrome Browser

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.kesari.in/signup");  // Get Kesari URL

        driver.manage().window().maximize(); // Maximize the Window

        driver.findElement(By.xpath("//input[@placeholder=\"Enter First Name\"]")).sendKeys("Shamal");
        driver.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys("Jadhav");
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("shamal@matale.com");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("shamal123");
        driver.findElement(By.xpath("//input[@name=\"password_c\"]")).sendKeys("shamal123");
        driver.findElement(By.xpath("//select[@placeholder=\"Please select Gender\"]")).sendKeys("female");
        driver.findElement(By.xpath("//input[@name=\"date\"]")).sendKeys("2022-04-14");
        driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("9511787878");
        driver.findElement(By.xpath("//span[text()=\"Remember my details\"]")).click();
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        driver.close();
    }


}
