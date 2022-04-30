package org.matrix.lambda.akashgupta.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Assignment14 {//*[text()='Alert']/parent::div/parent::div

    WebDriver driver;

    void alertPopup() throws InterruptedException {
        WebElement alertPopup = driver.findElement(By.xpath("//*[text()='Alert']/parent::div/parent::div"));
        WebElement btnOK = alertPopup.findElement(By.tagName("button"));
        //click on ok button
        btnOK.click();
        Thread.sleep(1000);

    }

    void enterDestinations(String originORdestination, String sourceName) throws InterruptedException {

        WebElement txtDestination = driver.findElement(By.xpath("//p-autocomplete[@id='" + originORdestination + "']/span/input"));
        String ulListId = txtDestination.getAttribute("aria-controls");
        txtDestination.sendKeys(sourceName);
        Thread.sleep(2000);
        List<WebElement> lnkSuggestions = driver.findElements(By.xpath("//ul[@id='" + ulListId + "']/li/span"));
        List<String> suggestionList = new ArrayList<>();
        for (WebElement suggestion : lnkSuggestions) {
            suggestionList.add(suggestion.getText());
        }
        if (suggestionList.size() >= 2) {
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

    @BeforeTest
    public void initDriver() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        try {
            driver.get("https://www.irctc.co.in/nget/train-search");
        } catch (WebDriverException error) {
            System.out.println(error);
        }
    }

    @Test
    void bookTickets() throws InterruptedException {
        alertPopup();
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
        try {
            WebElement searchError = driver.findElement(By.xpath("//div[text()='Error!']"));
            if (searchError.isDisplayed()) {
                Assert.fail("you have entered invalid destination");
            }
        } catch (NoSuchElementException searchError) {
        }
        try {
            WebElement alertConformation = driver.findElement(By.xpath("//span[text()='Confirmation']/parent::div/parent::div"));
            System.out.println("Direct Trains are not available between given stations");
            if (alertConformation != null) {
                WebElement btnYes = driver.findElement(By.xpath("//span[text()='Yes']/parent::button"));
                btnYes.click();
            }
        } catch (NoSuchElementException elementException) {
            System.out.println("Direct trains are available");
        }
        Thread.sleep(5000);
        String resultHeading = driver.findElement(By.xpath("//div[@class='tbis-div']/div/span")).getText();
        System.out.println(resultHeading);
        List<WebElement> trains = driver.findElements(By.xpath("//div[@class='col-sm-5 col-xs-11 train-heading']/strong"));
        for (WebElement train : trains) {
            System.out.println(train.getText());
        }

    }

    @AfterTest
    void close() {
        driver.close();
    }
}
