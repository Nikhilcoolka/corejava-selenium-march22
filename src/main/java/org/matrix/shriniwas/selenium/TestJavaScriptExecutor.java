package org.matrix.shriniwas.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestJavaScriptExecutor {

    @Test
    public void javascriptExecutor() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Get the Title of application
        String title = js.executeScript("return document.title").toString();
        System.out.println(title);

        // Get the URL of application
        String URL = js.executeScript("return document.URL").toString();
        System.out.println(URL);

        Thread.sleep(1000);
        // To refresh the browser
        js.executeScript("location.reload()");

         driver.findElement(By.id("user-name")).sendKeys("standard_user");
         driver.findElement(By.id("password")).sendKeys("secret_sauce");
         driver.findElement(By.id("login-button")).click();

        // Go back to last page
         js.executeScript("history.back()");
        // Thread.sleep(2000);
        // Go forward
         js.executeScript("history.forward()");

        Thread.sleep(3000);
        WebElement btnLogin = driver.findElement(By.id("login-button"));

        // To click on Element
         js.executeScript("arguments[0].click()", btnLogin);

         // To enter value inside input box
         js.executeScript("document.getElementById('user-name').value='Shriniwas'");

         // To apply the border to the element
         js.executeScript("arguments[0].setAttribute('style', 'border:3px solid #00FFFF;')", btnLogin);

         driver.findElement(By.id("user-name")).sendKeys("standard_user");
         driver.findElement(By.id("password")).sendKeys("secret_sauce");
         driver.findElement(By.id("login-button")).click();

         // Scroll to Bottom
         js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

         // Scroll to Top
         js.executeScript("window.scrollTo(0, 0);");
    }

    @Test
    public void javascriptExecutor1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement rdoPoll = driver.findElement(By.id("pollanswers-1"));

        // To scroll until element is visible
        js.executeScript("arguments[0].scrollIntoView(true);", rdoPoll);
        rdoPoll.click();

        // To navigate to diff URL
        js.executeScript("window.location='https://www.softwaretestingmaterial.com'");
    }
}
