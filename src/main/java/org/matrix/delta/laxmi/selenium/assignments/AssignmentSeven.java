package org.matrix.delta.laxmi.selenium.assignments;

import org.matrix.delta.laxmi.selenium.TestPropertiesScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class AssignmentSeven {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(TestPropertiesScript.readPropertyDemo("sausedemo_url"));

        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        String pageTitle= driver.getTitle();

        if(pageTitle.equals("Swag Labs")){
            System.out.println("Test is Pass");
            System.out.println("Login Successful");

        }
        else{
            System.out.println("Test and login is Fail");
        }
        driver.close();
    }
}
