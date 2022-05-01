package org.matrix.shriniwas.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDropdown {

    @Test
    public void verifyDropdown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("carselect"));
        Select select = new Select(element);
        System.out.println("Selected option: " +select.getFirstSelectedOption().getText());
        System.out.println("Is Multiple? "+select.isMultiple());

        select.selectByValue("benz");
        Thread.sleep(2000);
        select.selectByVisibleText("BMW");
        Thread.sleep(2000);
        select.selectByIndex(2);

        List<WebElement> options = select.getOptions();
        List<String> actualOptions = new ArrayList<>();
        List<String> expectedOptions = new ArrayList<>();
        expectedOptions.add("BMW");
        expectedOptions.add("Benz");
        expectedOptions.add("Honda");


        /* String cars = "BMW,Benz,Honda,ABC,XYZ";
        String [] carsArray = cars.split(",");

        for (String car : carsArray) {
            expectedOptions.add(car);
        } */

        for (WebElement option : options) {
            String op = option.getText();
            actualOptions.add(op);
        }

        Assert.assertEquals(actualOptions, expectedOptions);
    }
}
