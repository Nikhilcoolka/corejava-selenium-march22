package org.matrix.sigma.prajakta.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirstScript {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("Email")).sendKeys("prajakta@gmail.com");

        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("prajakta123");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        WebElement errorMessage = driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        boolean status= errorMessage.isDisplayed();

        if (status) {
            System.out.println("Test case is pass");
        } else {
            System.out.println("Test case is fail");
        }

        Thread.sleep(4000);
        driver.close();

    }
}
