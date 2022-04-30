package org.matrix.alpha.kamlesh.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/*
Scenario: To select all options present in Multiple type of dropdown and deselectAll options
 */
public class Assignment13 {
@Test
    public void Multiple() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://courses.letskodeit.com/practice");
    WebElement Element = driver.findElement(By.id("multiple-select-example"));
    Select select = new Select(Element);
    select.selectByValue("apple");
    select.selectByVisibleText("Orange");
    select.selectByIndex(2);
    Thread.sleep(2000);
    select.deselectByValue("apple");
    select.deselectByVisibleText("Orange");
    select.deselectByIndex(2);
    Thread.sleep(2000);
    driver.close();
}
}
