package org.matrix.sigma.niksangli.corejava.Screenshot;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Irctc
{


    void enterDestinations(String originORdestination, String sourceName) throws InterruptedException {

        WebDriver driver = null;
        WebElement txtDestination = driver.findElement(By.xpath
                ("//p-autocomplete[@id='" + originORdestination + "']/span/input"));
        //p-autocomplete[@id='origin']/span/input
        String ulListId = txtDestination.getAttribute("aria-controls");
        txtDestination.sendKeys(sourceName);
        Thread.sleep(3000);

        List<WebElement> lnkSuggestions = driver.findElements
                (By.xpath("//ul[@id='" + ulListId + "']/li/span"));

        List<String> suggestionList = new ArrayList<>();

        for (WebElement suggestion : lnkSuggestions) {
            suggestionList.add(suggestion.getText());
        }
        if (suggestionList.size()>= 2) {
            if (suggestionList.get(0).equals("----- Stations -----")) {
                txtDestination.clear();
                txtDestination.sendKeys(suggestionList.get(1));
                System.out.println("Selected " + suggestionList.get(1) + " from:\n" + suggestionList);

            } else if (suggestionList.get(1).equals("----- Stations -----")) {
                txtDestination.clear();
                txtDestination.sendKeys(suggestionList.get(2));
                System.out.println("Selected " + suggestionList.get(2) + " from:\n" + suggestionList);
            }
        } else if (suggestionList.size() == 1) {
            txtDestination.clear();
            txtDestination.sendKeys(suggestionList.get(0));
            System.out.println("Selected " + suggestionList.get(0));

        } else {//zero suggestions
            System.out.println("Invalid source name, please enter correct name.");
        }
    }

    @Test
    public void bookTickets() throws InterruptedException
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement alertPopup = driver.findElement(By.xpath("//*[text()='Alert']/parent::div/parent::div"));
        WebElement btnOK = alertPopup.findElement(By.tagName("button"));
        //click on ok button
        btnOK.click();
        Thread.sleep(1000);
        enterDestinations("origin", "mum");
        enterDestinations("destination", "banaras");

        WebElement ddlClasses = driver.findElement(By.xpath("//span[text()='All Classes']/parent::div/following-sibling::div"));
        ddlClasses.click();
        Thread.sleep(1000);
        WebElement ddlSleeper = driver.findElement(By.xpath("//li/span[text()='Sleeper (SL)']"));
        ddlSleeper.click();
        WebElement btnSearch = driver.findElement(By.xpath("//div/button[text()='Search']"));
        btnSearch.click();
        Thread.sleep(3000);

        String resultHeading = driver.findElement(By.xpath("//div[@class='tbis-div']/div/span")).getText();
        System.out.println(resultHeading);
        List<WebElement> trains = driver.findElements(By.xpath("//div[@class='col-sm-5 col-xs-11 train-heading']/strong"));
        for (WebElement train : trains) {
            System.out.println(train.getText());
        }

    }






}




