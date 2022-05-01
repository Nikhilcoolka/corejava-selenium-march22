package org.matrix.shriniwas.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAlertBoxes {

    @Test
    public void verifyAlertBoxes() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(text(), 'click the button to display an')]")).click();
        Thread.sleep(2000);

        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert1.accept();

        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
        driver.findElement(By.xpath("//button[contains(text(), 'click the button to display a confirm box ')]")).click();

        Thread.sleep(2000);
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println("Alert Text: " +alert2.getText());
        alert2.dismiss();

        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
        driver.findElement(By.xpath("//button[contains(text(), 'click the button to demonstrate the prompt box ')]")).click();

        Thread.sleep(2000);
        Alert alert3 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert3.sendKeys("Shriniwas");
        Thread.sleep(2000);
        alert3.accept();


    }
}
