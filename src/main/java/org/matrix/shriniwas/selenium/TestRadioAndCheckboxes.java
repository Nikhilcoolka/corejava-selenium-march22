package org.matrix.shriniwas.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestRadioAndCheckboxes {

    @Test
    public void verifyRadioAndCheckbox() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement rdoCars = driver.findElement(By.id("benzradio"));
        System.out.println(rdoCars.isSelected());
        if(!rdoCars.isSelected()) {
            rdoCars.click();
        }

        Thread.sleep(1000);
        driver.findElement(By.id("hondaradio")).click();

        WebElement chkBmw = driver.findElement(By.id("bmwcheck"));
        chkBmw.click();
        System.out.println("Is Checkbox selected: " +chkBmw.isSelected());
        chkBmw.click();

        // driver.findElement(By.id("benzcheck")).click();
        driver.findElement(By.id("hondacheck")).click();

        Thread.sleep(2000);
        List<WebElement> chkBoxesCars = driver.findElements(By.xpath("//input[@type='checkbox']/parent::label")); // 3

        System.out.println(chkBoxesCars.size());
        for (WebElement chkBoxCar : chkBoxesCars) {
            String chkCar = chkBoxCar.getText().trim();

            if(chkCar.equals("Benz")) {
                chkBoxCar.findElement(By.tagName("input")).click();
            }
        }
    }
}
