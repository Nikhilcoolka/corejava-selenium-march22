package org.matrix.lambda.akashgupta.selenium;

import static org.matrix.lambda.akashgupta.selenium.setDriver.driver;
public class Assignment3 {
    public static void main(String[] args) throws InterruptedException {
        setDriver.setDriverProperty("edge");
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        String s = driver.getTitle();

        //driver.close();
        System.out.println(s);
        driver.close();
    }
}
