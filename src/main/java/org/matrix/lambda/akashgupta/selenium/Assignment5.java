package org.matrix.lambda.akashgupta.selenium;
//script for specific item

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.matrix.lambda.akashgupta.selenium.setDriver.driver;

public class Assignment5 {
    public static void main(String[] args) throws InterruptedException {
        setDriver.setDriverProperty("edge");
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
        List<WebElement> button;
        button = driver.findElements(By.xpath("//button[contains(@class,'product-box-add-to-cart-button')]"));
        //System.out.println(button.size());
        button.get(0).click();
        //button.get(3).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@id='add-to-cart-button-1']")).click();
        Thread.sleep(4000);
        boolean error = driver.findElement(By.xpath("//p[text()='Please select RAM']")).isDisplayed();
        if (error) {
            System.out.println("Please select RAM & SSD");
            Select option = new Select(driver.findElement(By.xpath("//select[@name='product_attribute_2']")));
            option.selectByValue("3");
            driver.findElement(By.xpath("//input[@id='product_attribute_3_6']")).click();
            driver.findElement(By.xpath("//button[@id='add-to-cart-button-1']")).click();
            Thread.sleep(2000);

        }
        boolean flag = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).isDisplayed();
        if (flag) {
            System.out.println("Test was successful");
            driver.close();
        }


    }
}
