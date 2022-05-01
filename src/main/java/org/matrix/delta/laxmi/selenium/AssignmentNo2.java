package org.matrix.delta.laxmi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","H:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("laxmikurhade@rediffmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("laxmikurhade123");

        driver.findElement(By.xpath("//input[@class='signinbtn']")).click();

        WebElement errorMsg=driver.findElement(By.xpath("//b[text()='Temporary Issue. Please try again later. [#5002]']"));
        boolean status=errorMsg.isDisplayed();

        if(status){
            System.out.println("Test is pass");
        }
        else {
            System.out.println("Test is Fail");
        }
    driver.close();
    }
}
