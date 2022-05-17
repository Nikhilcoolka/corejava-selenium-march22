package org.matrix.lambda.nisha.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestQuit {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Ni\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.javatpoint.com/simple-program-of-java");
        driver.get("https://www.w3schools.com/html/html_colors.asp");
        driver.get("https://www.learnvern.com/selenium-tutorials/getting-started-maven");


        driver.manage().window().maximize();                // Maximize the window

        driver.quit();
    }

}

