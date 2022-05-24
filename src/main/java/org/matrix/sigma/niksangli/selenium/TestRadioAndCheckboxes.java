package org.matrix.sigma.niksangli.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestRadioAndCheckboxes {

    @Test
    public void testVerification() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement rdocar =driver.findElement(By.id("benzradio"));
        System.out.println(rdocar.isSelected());

        if(!rdocar.isSelected())
        {
            rdocar.click();
        }
        Thread.sleep(1000);

        driver.findElement(By.id("hondaradio")).click();
        Thread.sleep(2000);

        WebElement chkBmw = driver.findElement(By.id("bmwcheck"));
        chkBmw.click();
        Thread.sleep(2000);
        System.out.println("Is Checkbox selected: " +chkBmw.isSelected()); // true
        chkBmw.click();
        Thread.sleep(2000);
        driver.findElement(By.id("hondacheck")).click();
        List<WebElement> Checkboxcars=driver.findElements(By.xpath("//input[@type='checkbox']/parent::label"));
        System.out.println(Checkboxcars.size());
        Thread.sleep(2000);

        for(WebElement chkcar:Checkboxcars)
        {
            String cars=chkcar.getText().trim();
            System.out.println(cars);

            if(cars.equals("Benz"))
            {
                chkcar.findElement(By.xpath("//input[@id='benzcheck']")).click();
                System.out.println(chkcar.isSelected());
                Thread.sleep(2000);
            }

        }


        driver.close();

    }
}
