package org.matrix.sigma.pankaj.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestVerifyTitle {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        String ActualResult = driver.getTitle();
        String ExpectedResult = "Swag Labs";

        if(ActualResult.equals(ExpectedResult))
        {
            System.out.println("pass : The Swag labs application open successfuly");
        } else {
            System.out.println("fail ; The Swag labs application is not open successfuly");
        }

        //driver.close();
    }
}
