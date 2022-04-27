package org.matrix.alpha.kamlesh.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class
WebAmazon {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
       // Dimension size= new Dimension(1080,1080);
        //driver.manage().window().setSize(size);
        driver.manage().window().maximize();
        driver.findElement(By.id("ap_email")).sendKeys("example@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("************@#");
        driver.findElement(By.id("signInSubmit")).click();
        driver.findElement(By.xpath("//span[@class='abnav-accountfor']")).click();
        driver.findElement(By.xpath("//div[text() = 'Add money to your balance']")).click();
        driver.findElement(By.id("adm-load-amount")).clear();
        driver.findElement(By.id("adm-load-amount")).sendKeys("1");
        driver.findElement(By.id("adm-load-amount")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//input[@value='Checkout']")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("addCreditCardVerificationNumber4")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='ppw-0h_PE_CUS_684c4b3d-b038-4a31-98b4-d22baa3fe40f_addCreditCardVerificationNumber4_issuer']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//input[@name='ppw-0h_PE_CUS_684c4b3d-b038-4a31-98b4-d22baa3fe40f_addCreditCardVerificationNumber4_issuer']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//input[@name='ppw-0h_PE_CUS_684c4b3d-b038-4a31-98b4-d22baa3fe40f_addCreditCardVerificationNumber4_issuer']")).sendKeys(Keys.TAB);
        //driver.findElement(By.xpath("//input[@name='addCreditCardVerificationNumber4']")).sendKeys("123");




       /* driver.findElement(By.id("pp-FN6Qro-164")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class = 'a-input-text a-form-normal a-width-small a-form-error'")).click();
       */

        /* driver.findElement(By.xpath("//input[@id='pp-ey6wDU-187']")).click();
        driver.findElement(By.id("pp-qnnyeO-187")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='addCreditCardVerificationNumber4']")).sendKeys("100");
        Thread.sleep(2000);*/
        /*driver.findElement(By.xpath("//input[@id='pp-ey6wDU-187']")).sendKeys(Keys.TAB);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='pp-ey6wDU-187']")).sendKeys(Keys.TAB);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='pp-ey6wDU-187']")).sendKeys(Keys.TAB);
        Thread.sleep(2000);
        driver.findElement(By.id("//input[@id='pp-ey6wDU-197']")).click();
         */
    }

}
