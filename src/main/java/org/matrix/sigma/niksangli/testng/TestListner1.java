package org.matrix.sigma.niksangli.testng;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;


public class TestListner1  implements ITestListener
{
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("on TestStart method");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess method");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver=null;
      // driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").getInstance());

        TakesScreenshot f1=(TakesScreenshot) driver;
        File sourcefile =f1.getScreenshotAs(OutputType.FILE);
        File Destfile=new File("D:\\D-Drive-Study comapny\\Shriniwas selenium automation" +
                "\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\sigma" +
                "\\niksangli\\testng\\screenshot1\\Test1.jpg");

        try {
            FileUtils.copyFile(sourcefile,Destfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("onTestFailure method");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped method"); /// if test case iognored then it will execute
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage method");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) // at timeout this listner exrcute
    {
        System.out.println("onTestFailedWithTimeout method");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart method");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish method");
    }
}
