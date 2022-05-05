package org.matrix.shriniwas.selenium.pageobjectmodelbasics2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// Reusable methods
public class PageActions {

    public static void enterText(WebDriver driver, By element, String value) {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(element);
            flag = ele.isDisplayed();
            ele.sendKeys(value);
            flag = true;
        } catch (Exception ex) {
            flag = false;
        } finally {
            if (flag) System.out.println("Successfully entered value");
            else System.out.println("Unable to enter value");
        }
    }

    public static void click(WebDriver driver, By element) {
        driver.findElement(element).click();
    }

    public static String getElementText(WebDriver driver, By element) {
        return driver.findElement(element).getText();
    }

    public static void captureScreenshot(WebDriver driver, String fileName) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot)driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(System.getProperty("user.dir")+"\\src\\main\\java\\org\\matrix\\shriniwas\\selenium\\screenshots\\"+ fileName + "_" +getCurrentDateTime() +".jpg");
        FileUtils.copyFile(srcFile, destFile);
    }

    public static String getCurrentDateTime() {
        String dateTime = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        return dateTime;
    }

    public String getCurrentURL(WebDriver driver)  {
        boolean flag = false;

        String text = driver.getCurrentUrl();
        if (flag) {
            System.out.println("Current URL is: \""+text+"\"");
        }
        return text;
    }

    public String getTitle(WebDriver driver) {
        boolean flag = false;

        String text = driver.getTitle();
        if (flag) {
            System.out.println("Title of the page is: \""+text+"\"");
        }
        return text;
    }

    public boolean launchUrl(WebDriver driver,String url) {
        boolean flag = false;
        try {
            driver.navigate().to(url);
            flag = true;
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (flag) {
                System.out.println("Successfully launched \""+url+"\"");
            } else {
                System.out.println("Failed to launch \""+url+"\"");
            }
        }
    }

    public boolean selectByVisibleText(String text, WebElement ele) {
        boolean flag = false;
        try {
            Select s = new Select(ele);
            s.selectByVisibleText(text);
            flag = true;
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (flag) {
                System.out.println("Option selected by VisibleText");
            } else {
                System.out.println("Option not selected by VisibleText");
            }
        }
    }

    public boolean selectByValue(WebElement element,String value) {
        boolean flag = false;
        try {
            Select s = new Select(element);
            s.selectByValue(value);
            flag = true;
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (flag) {
                System.out.println("Option selected by Value");
            } else {
                System.out.println("Option not selected by Value");
            }
        }
    }

    public boolean selectByIndex(WebElement element, int index) {
        boolean flag = false;
        try {
            Select s = new Select(element);
            s.selectByIndex(index);
            flag = true;
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (flag) {
                System.out.println("Option selected by Index");
            } else {
                System.out.println("Option not selected by Index");
            }
        }
    }
}
