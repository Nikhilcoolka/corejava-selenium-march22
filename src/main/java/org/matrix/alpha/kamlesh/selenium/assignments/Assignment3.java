package org.matrix.alpha.kamlesh.selenium.assignments;


//Scenario: Verify the Title of Saucedemo application is “Swag Labs”
//Link: https://www.saucedemo.com/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Data\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
       // driver.findElement(By.xpath("//div[@ class='login_logo']"));
        String str = driver.getTitle();

        System.out.println(str);
        driver.close();
    }
}
