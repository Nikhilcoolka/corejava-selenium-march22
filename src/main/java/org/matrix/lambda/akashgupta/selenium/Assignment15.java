package org.matrix.lambda.akashgupta.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Assignment15 {
    WebDriver driver;
    static WebElement selectedOption = null;

    @BeforeTest
    public void initDriver() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
    }

    @Test
    void checkBox() throws InterruptedException {
        String option = "honda";
        List<WebElement> chkCars =
                driver.findElements(By.xpath("//legend[text()='Checkbox Example']/following-sibling::label"));
        List<String> actualChkOptions = new ArrayList<>();
        for (WebElement car : chkCars) {
            actualChkOptions.add(car.getText());
            if (car.getText().equalsIgnoreCase(option)) {
                selectedOption = car.findElement(By.tagName("input"));
                selectedOption.click();
            }
        }
        System.out.println(actualChkOptions);
        Assert.assertTrue(selectedOption.isSelected());
        Thread.sleep(2000);
    }

    @AfterTest
    void close() {
        driver.close();
    }
}
