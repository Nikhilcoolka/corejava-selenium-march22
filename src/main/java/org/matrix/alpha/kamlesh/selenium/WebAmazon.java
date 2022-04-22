package org.matrix.alpha.kamlesh.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;

public class WebAmazon {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
        Dimension size= new Dimension(1080,1080);
        driver.manage().window().setSize(size);
        driver.findElement(By.id("ap_email")).sendKeys("padmajatradingcompany@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("9372636305Rr@#");
        driver.findElement(By.id("signInSubmit")).click();
        driver.findElement(By.xpath("//span[@class='abnav-accountfor']")).click();
        driver.findElement(By.xpath("//div[text() = 'Add money to your balance']")).click();
        driver.findElement(By.id("adm-load-amount")).clear();
        driver.findElement(By.id("adm-load-amount")).sendKeys("1");
        driver.findElement(By.id("adm-load-amount")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//input[@value='Checkout']")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        driver.findElement(By.xpath("//input[@id='pp-ey6wDU-187']")).click();
        //driver.findElement(By.id("pp-ey6wDU-197")).click();
        driver.findElement(By.xpath("//input[@id='pp-ey6wDU-187']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//input[@id='pp-ey6wDU-187']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//input[@id='pp-ey6wDU-187']")).sendKeys(Keys.TAB);
        driver.findElement(By.id("//input[@id='pp-ey6wDU-197']")).click();
    }
}
