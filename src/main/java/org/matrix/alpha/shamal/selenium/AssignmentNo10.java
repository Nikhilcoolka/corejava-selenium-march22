/*
* Scenarios: Verify Patients module Homepage UI components
Steps:
Navigate to http://wonske.com/HMS/hospital/index.html
Click on Patients module Click here link
Enter username and password
Verify below UI components are displayed or not
*/
package org.matrix.alpha.shamal.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssignmentNo10 {

    public WebDriver driver = new ChromeDriver();

    @Test
    public void verifyUiComponent() throws InterruptedException {

        driver.get("http://wonske.com/HMS/hospital/index.html");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@href='hms/user-login.php']")).click();
        //driver.findElement(By.name("username"));
        WebElement userName = driver.findElement(By.name("username"));
        WebElement passWord = driver.findElement(By.name("password"));

        Assert.assertTrue(userName.isDisplayed());
        userName.sendKeys("test@gmail.com");

        Assert.assertTrue(passWord.isDisplayed());
        passWord.sendKeys("Test@123");

        driver.findElement(By.name("submit")).click();

       WebElement dashboard = driver.findElement(By.xpath("//span[@class=\"title\" and text()=\" Dashboard \"]"));
        Assert.assertTrue(dashboard.isDisplayed());

        WebElement bookApmt = driver.findElement(By.xpath("//span[@class=\"title\" and contains(text(),\" Book Appointment \")]"));
        Assert.assertTrue(bookApmt.isDisplayed());

        WebElement appHistory = driver.findElement(By.xpath("//span[@class=\"title\" and contains(text(),\" Appointment History \")]"));
        Assert.assertTrue(bookApmt.isDisplayed());

        WebElement medicalHistory = driver.findElement(By.xpath("//span[@class=\"title\" and contains(text(),\" Medical History\")]"));
        Assert.assertTrue(medicalHistory.isDisplayed());

        driver.findElement(By.xpath("//span[@class=\"username\"]")).click();
       String titleOfHead = driver.findElement(By.xpath("//h1[@class=\"mainTitle\"]")).getText();
       System.out.println(titleOfHead);

       driver.findElement(By.xpath("//li/a[@href=\"edit-profile.php\"]")).click();
       //driver.navigate().back();
      // driver.findElement(By.xpath("//li/a[@href=\"change-password.php\"]")).click();
     //  driver.navigate().back();
     //  driver.findElement(By.xpath("//li/a[@href=\"logout.php\"]")).click();



    }
}
