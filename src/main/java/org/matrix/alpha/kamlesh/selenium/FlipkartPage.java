package org.matrix.alpha.kamlesh.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,399)");
        driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/flap/50/50/image/a0ab9d0fa890ca5e.jpg?q=50']")).click();
        //driver.findElement(By.xpath("POCO M3 Pro 5G (Cool Blue, 128 GB)")).click();
        driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/image/312/312/kpmy8i80/mobile/v/6/1/m3-pro-5g-mzb0954in-poco-original-imag3th5ggub6c3f.jpeg?q=70' and @alt='POCO M3 Pro 5G (Cool Blue, 128 GB)']")).click();
        //driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/flap/100/25/image/c0617ec0d79ddbef.jpg?q=50']")).click();
        //Thread.sleep(1000);
        //driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/flap/100/25/image/c0617ec0d79ddbef.jpg?q=50']")).click();
       // driver.findElement(By.xpath("//div[text()='Infinix Zero 5G (Skylight Orange, 128 GB)']")).click();
        //driver.close();
    }
}
