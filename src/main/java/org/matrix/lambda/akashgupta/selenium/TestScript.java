package org.matrix.lambda.akashgupta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\akash\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Register']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        driver.findElement(By.id("FirstName")).sendKeys("First");

        Thread.sleep(2000);
        driver.findElement(By.id("LastName")).sendKeys("Script");

        Thread.sleep(2000);
        Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        day.selectByValue("5");
        Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        month.selectByValue("3");
        Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.selectByValue("1918");

        driver.findElement(By.id("Email")).sendKeys("xyx@gmai.com");
        Thread.sleep(2000);
        driver.findElement(By.id("Company")).sendKeys("Microsoft");
        Thread.sleep(2000);
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys("1234567qwert");
        Thread.sleep(2000);
        driver.findElement(By.id("ConfirmPassword")).sendKeys("1234567qwert");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='register-button']")).click();
        Thread.sleep(2000);
        String test1 = driver.findElement(By.xpath("//div[@class='page-body']/div")).getText();
        String test2 = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']/ul/li")).getText();
        if (test1.equals("Your registration completed"))
            System.out.println("Test Successful");
        else if (test2.equals("The specified email already exists")) {
            System.out.println("\007");
            System.out.println("Email already exists");
        }

        driver.close();
    }
}
