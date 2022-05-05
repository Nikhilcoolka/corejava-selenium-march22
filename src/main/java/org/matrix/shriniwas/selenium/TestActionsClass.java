package org.matrix.shriniwas.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestActionsClass {

    @Test
    public void verifyRightClick() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        WebElement btnRightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions actions = new Actions(driver);
        actions.contextClick(btnRightClick).perform();

        driver.findElement(By.xpath("//span[text()='Edit']")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void verifyDoubleClick() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        WebElement btnDoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

        Actions actions = new Actions(driver);
        actions.doubleClick(btnDoubleClick).build().perform();

        driver.switchTo().alert().accept();
    }

    @Test
    public void verifyDragAndDrop() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        // driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        Thread.sleep(2000);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement destination = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, destination).perform();
    }

    @Test
    public void verifyKeyboardActions() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        WebElement txtSearch = driver.findElement(By.name("s"));
        Actions actions = new Actions(driver);
        actions.keyDown(txtSearch, Keys.SHIFT)
                .sendKeys("shri")
                .keyUp(Keys.SHIFT)
                .build()
                .perform();
    }

    @Test
    public void verifyMoveToElement() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        WebElement link = driver.findElement(By.xpath("//a[text()='Contribute']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(link).build().perform();

        driver.findElement(By.xpath("//a[text()='Style Guides']")).click();
    }
}
