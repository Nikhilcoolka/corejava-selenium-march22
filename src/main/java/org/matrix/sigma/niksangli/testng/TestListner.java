package org.matrix.sigma.niksangli.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;


public class TestListner implements ITestListener
{
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("on TestStart methd");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess method");
    }

    @Override
    public void onTestFailure(ITestResult result) {
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
