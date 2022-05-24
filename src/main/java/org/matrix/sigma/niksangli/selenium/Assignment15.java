package org.matrix.sigma.niksangli.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Assignment15 {
    @Test
    public void Checkverification() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        List<WebElement> chkbox =driver.findElements(By.xpath("//legend[text()='Checkbox Example']/following-sibling::label"));
        List<String> all=new ArrayList<>();

        for(WebElement s1:chkbox)
        {
            all.add(s1.getText());
            System.out.println(s1.getText());

        }
        System.out.println(all.size());


        if(all.contains("Honda"))
        {
            driver.findElement(By.xpath("//input[@id='hondacheck']")).click();

            Thread.sleep(3000);
        }
        else
        {
            System.out.println("no element of honda");
        }
        driver.close();

    }
}
