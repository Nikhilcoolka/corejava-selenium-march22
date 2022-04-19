package org.matrix.delta.laxmi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class TestGuru99DemoSite {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(TestPropertiesScript.readPropertyDemo("guru99_url"));

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr400016");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hUtUren");

        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
