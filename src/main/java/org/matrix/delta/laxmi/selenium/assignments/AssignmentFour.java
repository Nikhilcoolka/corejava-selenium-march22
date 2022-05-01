package org.matrix.delta.laxmi.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFour {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("laxmi101@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("laxmi101");

        driver.findElement(By.xpath("//button[@name='login']")).click();
        WebElement err = driver.findElement(By.xpath("//*[@id='error_box']//div[text()='Invalid username or password']"));
        boolean errText=err.isDisplayed();
        if (errText) {
            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }
        driver.close();
    }
}
