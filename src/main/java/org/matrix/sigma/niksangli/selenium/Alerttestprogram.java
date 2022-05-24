package org.matrix.sigma.niksangli.selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerttestprogram {
@Test
    public void Verifyalertbox() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        Thread.sleep(2000);
        Alert a1=driver.switchTo().alert();
        a1.accept();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
        driver.findElement(By.xpath("//button[contains(text(), 'click the button to display a confirm box ')]")).click();
        Thread.sleep(2000);
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println("Alert Text: " +alert2.getText());
        alert2.dismiss();

//        driver.findElement(By.xpath("//a[@class='analystic']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@class='btn btn-info']"));
//        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath
                ("//button[text()='click the button to demonstrate the prompt box ']")).click();
        Alert a3 = driver.switchTo().alert();
        a3.sendKeys("Nikhil");
        Thread.sleep(3000);
        a3.accept();



    }

}
