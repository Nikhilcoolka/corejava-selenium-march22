package org.matrix.sigma.prajakta.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Assignment_13 {

    @Test
    public void deSelectAll() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement multiple = driver.findElement(By.id("multiple-select-example"));
        Select select = new Select(multiple);
        Thread.sleep(2000);

        List<WebElement> option = select.getOptions();

        System.out.println("---Multiple select option----");
        for (WebElement op : option) {
            System.out.println(op.getText());
        }

        Thread.sleep(2000);
        if (select.isMultiple()) {
            //select by index
            select.selectByIndex(0);
            Thread.sleep(2000);
            select.selectByIndex(1);
            Thread.sleep(2000);
            select.selectByIndex(2);
            System.out.println("Select all options--");
        }

        select.deselectAll();
        System.out.println("Deselect all options");
        driver.close();

    }

}
