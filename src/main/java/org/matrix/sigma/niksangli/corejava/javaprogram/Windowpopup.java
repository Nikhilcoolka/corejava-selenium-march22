package org.matrix.sigma.niksangli.corejava.javaprogram;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowpopup
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("http://admin:admin@the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
        Thread.sleep(2000);
        driver.close();

    }

}
