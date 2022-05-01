package org.matrix.sigma.niksangli.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerce {
    public static void main(String[] args) throws InterruptedException {
        //invoking browser
        System.setProperty("webdriver.chrome.driver",
                "D:\\D-Drive-Study comapny\\SeleniumDriver\\Driver\\" +
                        "chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Cool123@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Nikhil@22");
        Thread.sleep(3000);
        driver.findElement((By.xpath("//button[text()='Log in']"))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Computers ']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@title='Show products in category Desktops']")).click();
        //img[@title='Show products in category Desktops']
        Thread.sleep(6000);

        driver.findElement(By.xpath("//a[@title='Show details for Lenovo " +
                "IdeaCentre 600 All-in-One PC']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath
                ("//div[@class='add-to-cart-panel']/label/following-sibling::button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("//input[@name='termsofservice']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@name='checkout']")).click();
        Thread.sleep(4000);


        driver.close();




    }
}
//Cool123@gmail.com
//Nikhil@22  ////button[text()='Add to cart']