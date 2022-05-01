package org.matrix.alpha.kamlesh.selenium.assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.awt.*;

/*
Go to https://www.irctc.co.in/nget/train-search
Click on Alert pop up if you get (You can not use Alert interface here, bcz it is not a Javascript Alert pop up), instead you can inspect on OK button and click.
Enter Source
Enter Destination
Select Sleeper class from dropdown (You can not use Select here bcz element has no <Select> tag)
Click on Search
Fetch all the trains running from Source to Destination
And also, the number of trains running. E.g in below screenshot 15 trains
 */
public class Assignment14 {

    @Test
    public void irctc() throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        //Alert alert=driver.switchTo().alert();
        driver.findElement(By.xpath("//input[@class='ng-tns-c58-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("PUNE");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='ng-tns-c58-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("SUR");
        driver.findElement(By.xpath("//input[@class='ng-tns-c58-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).click();
        Thread.sleep(2000);
      //  WebElement datebox=driver.findElement(By.xpath("//p-calendar[@class='form-group ng-tns-c59-10 ui-inputwrapper-filled ng-untouched ng-pristine ng-valid']"));
        //datebox.sendKeys("05/05/2022");
    }
}
