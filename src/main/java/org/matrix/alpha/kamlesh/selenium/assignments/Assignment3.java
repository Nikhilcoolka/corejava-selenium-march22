package org.matrix.alpha.kamlesh.selenium.assignments;


//Scenario: Verify the Title of Saucedemo application is “Swag Labs”
//Link: https://www.saucedemo.com/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2500);
        driver.manage().window().maximize();
        Thread.sleep(2500);
        String str=driver.getTitle();
        System.out.println(str);
        Thread.sleep(2500);
        driver.close();
    }
}
