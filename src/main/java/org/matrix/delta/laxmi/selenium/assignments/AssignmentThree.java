package org.matrix.delta.laxmi.selenium.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentThree {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        String str = driver.getTitle();
        System.out.println(str);
        System.out.println("___________________________");
        if(str.equals("Swag Labs")){
            System.out.println("Test is pass");
        }
        else {
            System.out.println("Test is Fail");
        }
        driver.close();
    }
}
