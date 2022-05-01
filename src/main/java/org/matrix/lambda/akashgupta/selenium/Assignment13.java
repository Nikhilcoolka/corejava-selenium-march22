package org.matrix.lambda.akashgupta.selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class Assignment13 {
    WebDriver driver;

    @BeforeTest
    public void initDriver() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
    }

    @Test
    void multiSelect() throws InterruptedException {
        Select select = new Select(driver.findElement(By.id("multiple-select-example")));
        Actions action = new Actions(driver);
        Assert.assertTrue(select.isMultiple());
        select.selectByIndex(2);
        select.selectByValue("orange");
        select.selectByVisibleText("Apple");
        //using for each
        /*List<WebElement> options = select.getOptions();
        for (WebElement op:options){
            op.click();
        }*/
        Thread.sleep(2000);
        //using keyboard action **not necessary for multi-select
        /*List<WebElement> options = select.getOptions();
        for (WebElement op:options){
            action.keyDown(Keys.CONTROL);
            op.click();
            action.keyUp(Keys.CONTROL);
        }*/
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        for (WebElement e : selectedOptions) {
            System.out.println(e.getText());
        }
        Thread.sleep(2000);
        select.deselectAll();

        selectedOptions = select.getAllSelectedOptions();
        Assert.assertTrue(selectedOptions.isEmpty());

    }

    @AfterTest
    void close() {
        driver.close();
    }
}
