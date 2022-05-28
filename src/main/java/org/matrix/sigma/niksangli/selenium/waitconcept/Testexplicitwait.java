package org.matrix.sigma.niksangli.selenium.waitconcept;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Testexplicitwait {

    @Test
    public void Verifywaits2()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://testproject.io/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Login']")).click();

        Set<String> handles = driver.getWindowHandles();
        List<String> windows = new ArrayList<>(handles);
        driver.switchTo().window(windows.get(1));


//        // explicit wait
        WebDriverWait w1=new WebDriverWait(driver, 10); // by default polling interval 0.5 sec i.e 500ms
        //WebDriverWait w2=new WebDriverWait(driver,10,500); 500ms is 0.5sec it will slip while search element
        WebElement e1 =w1.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        //w1.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        e1.sendKeys("nikhilkulkarni");

//        //Fluent wait
//        FluentWait wait=new FluentWait(driver);
//        wait.withTimeout(Duration.ofSeconds(10));   // wait for 10 sec
//        wait.pollingEvery(Duration.ofMillis(1000));  // with timeinterval 1sec.
//        wait.ignoring(NoSuchElementException.class);  // in 1 sec if exception occur then ignore here
//
//        WebElement e2= (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
//        e2.sendKeys("nikhilkulkarni6156");




    }
}
