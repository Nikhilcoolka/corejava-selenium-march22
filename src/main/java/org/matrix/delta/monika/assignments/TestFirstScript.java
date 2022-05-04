package org.matrix.delta.monika.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirstScript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Email")).sendKeys("monikashinde019@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("monika019");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(2000);
      WebElement errorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
      boolean status = errorMessage.isDisplayed();

      if (errorMessage.isDisplayed()){
          System.out.println("Test case pass");
      }else {
          System.out.println("Test case fail");
      }


    }
}
