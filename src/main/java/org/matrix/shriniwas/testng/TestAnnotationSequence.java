package org.matrix.shriniwas.testng;

import org.testng.annotations.*;

public class TestAnnotationSequence {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    // Before Class
    // BeforeMethod  -> Test1 -> After Method
    // BeforeMethod  -> Test2 -> After Method
    // BeforeMethod  -> Test3 -> After Method
    // After Class
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    // BeforeMethod -> Test1 -> AfterMethod
    @Test
    public void test1() {
        System.out.println("Test1 method");
    }

    // BeforeMethod -> Test2 -> AfterMethod
    @Test
    public void test2() {
        System.out.println("Test2 method");
    }
}
