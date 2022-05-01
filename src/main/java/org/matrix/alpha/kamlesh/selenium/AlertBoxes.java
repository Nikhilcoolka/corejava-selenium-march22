package org.matrix.alpha.kamlesh.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertBoxes {

    @Test
    public void verifyAlertboxes() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Alerts.html");
       driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        Alert alert1=driver.switchTo().alert();
        Thread.sleep(1500);
        alert1.accept();
        //driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[text()='click the button to display a confirm box '] ")).click();
        Thread.sleep(1500);
        driver.switchTo().alert().dismiss();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box '] ")).click();
      //  driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box '] ")).sendKeys("kamlesh");
        Thread.sleep(1500);
        Alert alert2=driver.switchTo().alert();
        Thread.sleep(1500);
        alert2.sendKeys("Kamlesh");
        Thread.sleep(1500);
        alert2.accept();
        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[text()='click the button to display a confirm box '] ")).click();
        Thread.sleep(1500);
        Alert alert3=driver.switchTo().alert();
        Thread.sleep(1500);
        String s = alert3.getText();
        System.out.println(s);
    }
}
