/*Scenario: Verify the count of search results
Steps:
* Open https://www.google.com/
* Enter “Selenium” in search field
* Find out the Count of search results and print the texts in console if possible
Expected: Count should be 10 and should print text of all search items
*/

package org.matrix.alpha.shamal.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleSearchTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.name("q")).sendKeys("selenium");
        Thread.sleep(2000);

        List<WebElement> listItems = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li/descendant::div[@class=\"pcTkSc\"]"));
        ////ul[@role="listbox"]//li/following::div[@class="pcTkSc"]

        //Related Searched Items
        System.out.println("Total  Element Result will Be :" +listItems.size());

        //Itrate that Items

        for(int i=0 ; i<listItems.size() ; i++ ){

            String listElmt = listItems.get(i).getText();

            System.out.println(listElmt);

            if(listElmt.contains("selenium interview questions")){

                System.out.println(listElmt);
                listItems.get(i).click();
                break;
            }
        }


    }
}
