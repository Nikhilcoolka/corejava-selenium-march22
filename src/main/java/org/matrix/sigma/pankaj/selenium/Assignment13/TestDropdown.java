package org.matrix.sigma.pankaj.selenium.Assignment13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestDropdown {

    @Test
    public void VerifyMDropdown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("multiple-select-example"));
        Select Select = new Select(element);
        Select.selectByIndex(0);
        Select.selectByValue("apple");
        Select.selectByVisibleText("Orange");
        Thread.sleep(2000);
        Select.deselectByIndex(2);
        Thread.sleep(2000);



    }

}










