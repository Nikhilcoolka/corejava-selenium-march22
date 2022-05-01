package org.matrix.alpha.kamlesh.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

//Scenario: Verify the count of search results
//
//Steps:
//Open https://www.google.com/
//Enter “Selenium” in search field
//Find out the Count of search results and print the texts in console if possible
public class Assignment6 {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@ class='gLFyf gsfi']")).sendKeys("selenium testing");
       // List<WebElement> count= (List<WebElement>) By.xpath("//ul[@role='listbox']//ul[@class='G43f7e']").findElement(driver);
        Thread.sleep(2000);
        List<WebElement> listWebelement= driver.findElements(By.xpath("//li[@ class='sbct']"));

        /*for(WebElement a : count){

                System.out.println("elements are :" + a.getText() + count.size());

        }*/

        //for(int i = 0; i<=9 ; i++){

        //  System.out.println("elements " + i + " : "  + listWebelement.get(i).getText() + "    " +"listsize is :" + listWebelement.size());
        //}
       // System.out.println("Total search columns are " +count.size());
        driver.close();
    }
}
