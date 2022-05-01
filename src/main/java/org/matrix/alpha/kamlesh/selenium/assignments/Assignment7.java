package org.matrix.alpha.kamlesh.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Scenario: Write a script to Validate if a valid user is logged into the application or not.

Steps:
Open https://www.saucedemo.com/
Enter username : standard_user
Enter password : secret_sauce
Click Login
Verify if user is successfully logged in or not*/
public class Assignment7 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Dimension di = new Dimension(1080, 900);
        driver.manage().window().setSize(di);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@ name='user-name']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@ data-test='login-button']")).click();
        Thread.sleep(1000);
        String title = "Swag Labs";
        String orgTitle = driver.getTitle();
        if (title.equals(orgTitle)) {
            System.out.println("Web title page is " + title);
            System.out.println("Case pass verified login user successfully");
        } else {
            System.out.println("Case failed");
        }
        driver.close();
    }
}
