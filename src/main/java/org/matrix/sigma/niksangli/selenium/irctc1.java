package org.matrix.sigma.niksangli.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class irctc1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement alertPopup = driver.findElement(By.xpath("//*[text()='Alert']/parent::div/parent::div"));
        WebElement btnOK = alertPopup.findElement(By.tagName("button"));
        //click on ok button
        btnOK.click();
        Thread.sleep(1000);

        WebElement s1=driver.findElement(By.xpath("//p-autocomplete[@id='origin']/span/input"));
        String ulist=s1.getAttribute("aria-controls");
        s1.sendKeys("mmct");
        System.out.println(ulist);
        List<WebElement> s2 =driver.findElements(By.xpath("//ul[@id='" + ulist + "']/li/span"));
        System.out.println(s2.size());
        //ul[@id='pr_id_1_list']/li/span
        List<String> s3=new ArrayList<>();
        for(WebElement s4:s2)
        {
            System.out.println(s4.getText());
            //s3.add(s4.getText());
            //System.out.println(s3);


        }
        driver.close();


    }
}
