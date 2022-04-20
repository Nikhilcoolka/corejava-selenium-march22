package org.matrix.alpha.kamlesh.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Data\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread. sleep(1000);
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("Email")).sendKeys("dandikamlesh@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("Password")).sendKeys("12345");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        WebElement errorMessage =driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']") );
        boolean status = errorMessage.isDisplayed();
        if(status){
            System.out.println("Test case pass");
        }
        else {
            System.out.println("Test case fail");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
