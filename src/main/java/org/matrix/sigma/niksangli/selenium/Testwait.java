package org.matrix.sigma.niksangli.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Testwait {

    @Test
    public void verifyWaits() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://testproject.io/");
        driver.manage().window().maximize();

        // page load time out default time out 300 sec only for page load
        //driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        // implicit wait
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        //String parent=driver.getWindowHandle();

        driver.findElement(By.xpath("//a[text()='Login']")).click();

        Set<String> handles=driver.getWindowHandles();
        List<String> w1=new ArrayList<>(handles);

        driver.switchTo().window(w1.get(1));

        driver.findElement(By.id("username")).sendKeys("nikhilkulkarni6156");

        driver.close();

    }
}
