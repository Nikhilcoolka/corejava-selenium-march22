package org.matrix.lambda.akashgupta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\akash\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();


        Boolean flag = driver.findElement(By.xpath("//div/div/div")).isDisplayed();
        System.out.println(flag);

        Thread.sleep(20000);

        flag = driver.findElement(By.xpath("//div/div/div")).isDisplayed();
        System.out.println(flag);

       /* if(attributeClass.equals("login_logo")) {
            System.out.println("class is present");
            driver.findElement(By.cssSelector())

        }*/
        driver.close();
    }
}
