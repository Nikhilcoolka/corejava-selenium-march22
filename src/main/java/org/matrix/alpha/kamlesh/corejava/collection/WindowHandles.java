package org.matrix.alpha.kamlesh.corejava.collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandles {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2doB4z']")).click();

        driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'KENT ACE Plus 8 L RO + UV + UF + TDS Control + UV ')]")).click();

        Set<String> set = driver.getWindowHandles();

        for(String s : set){

            System.out.println("window names : " + s);
        }

        driver.close();
    }
}
