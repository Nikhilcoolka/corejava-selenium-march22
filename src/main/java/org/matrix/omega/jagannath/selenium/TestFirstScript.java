package org.matrix.omega.jagannath.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirstScript {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "H:\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        driver.findElement(By.id("Email")).sendKeys("Jagannathkudale@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Jag12223");
        driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
        WebElement errorMessage=driver.findElement(By.xpath("//div[text()=\"Login was unsuccessful. Please correct the errors and try again.\"]"));
        boolean status=errorMessage.isDisplayed();
        if(status){
            System.out.println("Test case is pass");
        }
        else
        {
            System.out.println("Test case is Fail");
        }
        driver.close(); //closing the web driver
    }
}
