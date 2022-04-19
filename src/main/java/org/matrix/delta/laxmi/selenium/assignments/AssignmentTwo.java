package org.matrix.delta.laxmi.selenium.assignments;

import org.matrix.delta.laxmi.selenium.TestPropertiesScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class AssignmentTwo {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get(TestPropertiesScript.readPropertyDemo("nocom_url"));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        driver.findElement(By.id("Email")).sendKeys("laxmi321@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("laxmi321");

        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        WebElement errMsg=driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        boolean status=errMsg.isDisplayed();
        if(status){
            System.out.println("Test is Pass");
        }
        else {
            System.out.println("Test is Fail");
        }
        driver.close();
    }
}
