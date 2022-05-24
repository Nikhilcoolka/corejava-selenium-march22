package org.matrix.sigma.niksangli.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestDropdown {
@Test
    public void Testdropdown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement element=driver.findElement(By.id("carselect"));
        Select s1=new Select(element);
        Thread.sleep(1000);
        
        System.out.println("select option" + " " +s1.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        s1.selectByValue("benz");
        Thread.sleep(2000);
        System.out.println("Select multiple" + "  " + s1.isMultiple());
        Thread.sleep(2000);
        driver.close();


    }
}
