package org.matrix.sigma.niksangli.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Deselectall {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement multiple=driver.findElement(By.id("multiple-select-example"));

        Select s1=new Select(multiple);
        Thread.sleep(3000);

        List<WebElement> option =s1.getOptions();

        System.out.println("Multiple select option");

        for(WebElement s2:option)
        {
            System.out.println(s2.getText());

        }
        Thread.sleep(3000);

        if(s1.isMultiple())
        {
            s1.selectByIndex(0);
            Thread.sleep(1000);
            s1.selectByIndex(1);
            Thread.sleep(1000);
            s1.selectByIndex(2);
            System.out.println("Select all option");

        }

        s1.deselectAll();
        System.out.println(s1);
        System.out.println("Deselect all");

        driver.close();

    }
}
