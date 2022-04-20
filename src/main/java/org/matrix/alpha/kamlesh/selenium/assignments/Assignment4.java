package org.matrix.alpha.kamlesh.selenium.assignments;
/*Scenario: Please verify the error message for invalid credentials
Link: https://www.facebook.com/login/
Steps:
Navigate to https://www.facebook.com/login/
Enter incorrect Email address
Enter incorrect password
Click on Login button
Verify the error message is displayed or not */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //  Thread.sleep(1500);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).click();
        //Thread.sleep(1500);
        driver.findElement(By.id("email")).sendKeys("kamal124@gmail.com");
        //Thread.sleep(1500);
        driver.findElement(By.id("pass")).sendKeys("12345678");
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//button[@name='login']")).click();
       // Thread.sleep(1500);
        //driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9kpt _4jy5 _4jy1 selected _51sy']")).click();
        driver.findElement(By.xpath("//button[@autofocus='1']")).click();
        WebElement errorMessage=driver.findElement(By.xpath("//div[@class='_9ay7']"));
        boolean status=errorMessage.isDisplayed();
        if(status){
            System.out.println("Test link pass");
        }
        else {
            System.out.println("Test link fail");
        }
        Thread.sleep(1500);
        driver.close();
    }
}
