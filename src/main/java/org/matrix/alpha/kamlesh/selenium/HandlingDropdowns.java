package org.matrix.alpha.kamlesh.selenium;
/*
Program is copy pasted by me....logic is mandaatory to understand
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HandlingDropdowns {
    @Test
    public void verifyDropDowns() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        WebElement Handles = driver.findElement(By.id("carselect"));
        //Thread.sleep(1500);
        Select select = new Select(Handles);
        //Thread.sleep(1500);
        select.selectByValue("honda");
        select.selectByIndex(0);
        select.selectByVisibleText("Benz");
        select.getOptions();
        //String s1=Handles.getText();
        //System.out.println(s1);

        List<WebElement> element = select.getOptions();
        List<String> actualoptions =new ArrayList<>();
        List<String> expectedoptions =new ArrayList<>();
        expectedoptions.add("BMW");
        expectedoptions.add("kamal");
        expectedoptions.add("Honda");

        for(WebElement op1 : element){
            String op2= op1.getText();
            actualoptions.add(op2);
        }
        Assert.assertEquals(actualoptions,expectedoptions);
        System.out.println();
    }
    }