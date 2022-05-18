package org.matrix.lambda.nisha.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAmazon {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Ni\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/VGR-V-030-Professional-Trimmer-Runtime/dp/B088PN9BLQ/ref=sr_1_1_sspa?pd_rd_r=72dc11e8-d2cf-4f05-8e90-7c7838c6e03f&pd_rd_w=6MxHe&pd_rd_wg=OGjJE&pf_rd_p=2f84c86b-b04a-410a-87b4-14516386d62d&pf_rd_r=BTAS6VNJ988WRD68BX32&qid=1651858824&refinements=p_85%3A10440599031%2Cp_72%3A1318476031&rnid=1318475031&rps=1&s=hpc&sr=1-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyUDVCSU1EUEJEMDdEJmVuY3J5cHRlZElkPUEwMDc2MjQwUVhWV0daUUJBNlkmZW5jcnlwdGVkQWRJZD1BMDU2MDczNDNQQ0lZSUhKUEhFODMmd2lkZ2V0TmFtZT1zcF9hdGZfYnJvd3NlJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
        driver.manage().window().maximize();

        //check if user is not signed in
        WebElement signInMsg = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        if (signInMsg.isDisplayed())
        {
            Thread.sleep(2000);
            driver.findElement(By.id("buy-now-button")).click();

            Thread.sleep(2000);
            driver.findElement(By.className("a-spacing-small")).click();

            System.out.println("Test case passed.");
        }
        else {
            System.out.println("User Logged In");
        }

        driver.close();
    }
}
