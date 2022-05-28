package org.matrix.sigma.niksangli.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListner1.class)
public class Testlistenerfailurescreenshot
{
    public WebDriver driver;

    @BeforeTest
    public void init() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();

    }

    @Test
    public void Verifyalert() throws InterruptedException
    {

         driver.findElement(By.xpath("//button[contains(text(), 'click the button to display oi')]")).click();

     }
}
