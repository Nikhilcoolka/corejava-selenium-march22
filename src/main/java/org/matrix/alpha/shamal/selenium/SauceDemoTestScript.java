/*
* Scenario: Verify the Title of Saucedemo application is “Swag Labs”
* Enter the Email i.e username name and password
* Enter Login Credential
* Click on login button
* Get the tilte of the web Page
 */

package org.matrix.alpha.shamal.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoTestScript {

    public static void main(String[] args) {

       // System.setProperty("webdriver.firefox.marionette","path of driver");

        System.setProperty("webdriver.chrome.driver", "F:\\chromeDriver\\chromedriver.exe");

       // WebDriver driver = new FirefoxDriver(); // Invoke the browswr
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/"); // Open the URL

        driver.manage().window().maximize(); //Maximize the window

        driver.findElement(By.name("user-name")).sendKeys("standard_user"); //

       // WebElement username = driver.findElement(By.name("user-name"));

      //  username.sendKeys("standard_user"); //enter userName

        driver.findElement(By.name("password")).sendKeys("secret_sauce"); //Enter the password


        driver.findElement(By.name("login-button")).click(); //Click to Sign In

        String exptTitle = "Swag Labs";

        String actualTitle = driver.getTitle(); //Gives the title of the page

        // Validation

        if(exptTitle.equals(actualTitle)){
            System.out.println("The Title of the page is :" +exptTitle);
            System.out.println("Test case Passed");
        }
        else {
            System.out.println("Test case Failed");

        }

        driver.close(); // close the browser
    }
}
