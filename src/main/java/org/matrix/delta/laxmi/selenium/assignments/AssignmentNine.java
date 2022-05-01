package org.matrix.delta.laxmi.selenium.assignments;

import org.matrix.delta.laxmi.selenium.TestPropertiesScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class AssignmentNine {
    @Test
    public void verifyLogin() throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(TestPropertiesScript.readPropertyDemo("orange_hrm_url"));

        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
        Thread.sleep(2000);

        /*String pageTitle= driver.getTitle();

        if(pageTitle.equals("Swag Labs")){
            System.out.println("Test is Pass");
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Test and login is Fail");
        }*/
    }
}
