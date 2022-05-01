package org.matrix.alpha.kamlesh.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Scenario: Verify error message for Forget password

Steps:
Navigate to https://opensource-demo.orangehrmlive.com/
Click on Forgot your password? Link
Enter any invalid username in the textbox
Click on Reset Password button
Verify Please contact HR admin in order to reset the password
Error Message is displayed or not
*/
public class Assignment9 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
        driver.findElement(By.id("securityAuthentication_userName")).sendKeys("orange124@gmail.com");
        driver.findElement(By.id("btnSearchValues")).click();
        WebElement errormessage=driver.findElement(By.xpath("//div[@class='message warning fadable']"));
        boolean status= errormessage.isDisplayed();
        if (status) {
            System.out.println("Case has been pass");
        }
        else{
            System.out.println("Case has been failed");
            driver.close();
        }
    }
}
