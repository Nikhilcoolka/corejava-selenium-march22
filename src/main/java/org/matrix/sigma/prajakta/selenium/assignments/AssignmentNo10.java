package org.matrix.sigma.prajakta.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class AssignmentNo10 {

    public static String readProperty(String key) throws IOException {
        FileInputStream fin = new FileInputStream("D:\\Automation\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\sigma\\prajakta\\selenium\\assignments\\read.properties");
        Properties prop = new Properties();
        prop.load(fin);
        String value = prop.getProperty(key);
        return value;
    }

    @Test
    public void verify() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(readProperty("hospital_url"));
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//p//parent::div/child::div//a")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("username")).sendKeys(readProperty("userName"));
        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys(readProperty("passw"));
        Thread.sleep(2000);

        driver.findElement(By.name("submit")).click();
        Thread.sleep(2000);

        // To check list elements are displayed or not
        WebElement ele = driver.findElement(By.xpath("//ul[@class='main-navigation-menu']//li"));

        boolean status = ele.isDisplayed();
        Assert.assertTrue(status);

        // To display all elements
        System.out.println("---------------------------------------------------------");
        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='main-navigation-menu']//li"));
        System.out.println("---UL list elements---");
        for (WebElement abc : list) {
            System.out.println(abc.getText());
        }

        //To check elements are displayed or not
        WebElement ele2 = driver.findElement(By.xpath("//div[@class='container-fluid container-fullw bg-white']//div[@class='col-sm-4']"));

        boolean check = ele2.isDisplayed();
        Assert.assertTrue(check);

        //To print all elements
        System.out.println("------------------------------------------------------------");
        List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='container-fluid container-fullw bg-white']//div[@class='col-sm-4']"));
        System.out.println("---Container elements----");
        for (WebElement web2 : list1) {
            System.out.println(web2.getText());
        }

        driver.close();
    }
}
