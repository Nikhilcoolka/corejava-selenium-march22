package org.matrix.sigma.niksangli.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testparameter {

    public WebDriver driver;

    @Parameters("browser")
    @Test
    public void initbrowser(String browsername) throws InterruptedException {
        switch (browsername)
        {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                driver.get("https://automationtestings.com/category/selenium/");
                driver.manage().window().maximize();
                Thread.sleep(2000);
                driver.close();
                break;



            case "safari":
                WebDriverManager.safaridriver().setup();
                driver=new SafariDriver();
                driver.get("https://automationtestings.com/category/selenium/");
                driver.manage().window().maximize();
                Thread.sleep(2000);
                driver.close();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                driver.get("https://automationtestings.com/category/selenium/");
                driver.manage().window().maximize();
                Thread.sleep(2000);
                driver.close();
                break;

            default:
                System.out.println("Invalid browser name");
                break;
        }


    }

    @Parameters({"username","password"})
    @Test
    public void verifylogin(String unm,String pass)
    {
        System.out.println(unm);
        System.out.println(pass);
    }
}
