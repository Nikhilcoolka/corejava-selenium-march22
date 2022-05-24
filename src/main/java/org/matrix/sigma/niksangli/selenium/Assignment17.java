package org.matrix.sigma.niksangli.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment17 {

    @Test

    public  void mouseAction() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=http%3A%2F%2Fsupport.google.com%2Faccounts%2Fanswer%2F27441%3Fhl%3Den&hl=en&dsh=S-1039224186%3A1651836105351132&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement firsttxt=driver.findElement(By.xpath("//input[@id='firstName']"));
        firsttxt.sendKeys("nikhilkulkarni6156");
        Thread.sleep(2000);
        String s1=firsttxt.getText();
        System.out.println(s1);



        Actions a1=new Actions(driver);
        firsttxt.sendKeys(Keys.CONTROL+"a");
        Thread.sleep(1000);
        firsttxt.sendKeys(Keys.CONTROL+"c");

        a1.build().perform();
        Thread.sleep(1000);
        WebElement emailtxt=driver.findElement(By.xpath("//input[@type='email']"));
        emailtxt.sendKeys(Keys.CONTROL+"v");
       Thread.sleep(2000);

       String s2=emailtxt.getText();
        System.out.println(s2);

       Thread.sleep(2000);
       a1.build().perform();

       Assert.assertEquals(s1,s2);
       driver.close();




    }
}
