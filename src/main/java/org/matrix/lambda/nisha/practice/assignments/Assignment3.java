package org.matrix.lambda.nisha.practice.assignments;

/*
Assignment No 3:
        Scenario: Verify the Title of Saucedemo application is “Swag Labs”
        Link: https://www.saucedemo.com/
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment3 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "D:\\Ni\\Downloads\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.saucedemo.com/");
        String demo = driver.getTitle();
        System.out.println( "Title of the link = " +demo);Thread.sleep(2000);
        String str = "Swag";
        System.out.println("comparison with = " + str);
        if (demo.equals(str)) {
            System.out.println("Test case passed.");
        } else {
            System.out.println("Test case failed.");
        }
        Thread.sleep(2000);
        driver.close();
    }
}
