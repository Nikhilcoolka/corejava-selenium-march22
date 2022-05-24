package org.matrix.sigma.niksangli.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class Assignment18 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://simple-form-bootstrap.herokuapp.com/examples/horizontal");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        JavascriptExecutor js=(JavascriptExecutor) driver;


        WebElement bt=driver.findElement(By.xpath("//button[text()='Create User!']"));

        js.executeScript("window.scrollBy(0,1600)");
        Thread.sleep(1000);

        js.executeScript("arguments[0].click()",bt);
        Thread.sleep(8000);

       WebElement error=driver.findElement(By.xpath("//div[@class='row mb-3']/div/input/" +
                "following-sibling::div[@class='invalid-feedback']/text()"));

       // List<String> s1=new ArrayList<>();

        //for(WebElement opt:error)
       // {

           //     s1.add(opt.getText());

             //   String s2=opt.getText();
             //   System.out.println(opt.getSize());

              //  System.out.println(s2);

        //}
        System.out.println(error.getSize());
        System.out.println(error.getText());

        Thread.sleep(2000);
        driver.close();





    }
}
