package org.matrix.sigma.prajakta.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFacebookErrorMessage {

    public static void main(String[] args) throws InterruptedException {

       //System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("prajakta@gmail.com");

        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("prajakta123");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Log In']")).click();

        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='_9ay7']/a"));

        boolean status= errorMessage.isDisplayed();

        if(status){
            System.out.println("Test case pass");
        }else {
            System.out.println("Test case fail");
        }

        Thread.sleep(2000);
        driver.close();
    }
}
