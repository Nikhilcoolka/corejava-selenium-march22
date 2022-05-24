package org.matrix.sigma.niksangli.testng;

import org.testng.annotations.*;

public class Testannotations {
    @BeforeSuite
    public void beforSuite()
    {
        System.out.println("before suite method");
    }
    @BeforeTest
    public void BeforeTest()
    {
        System.out.println("BeforeTest method");
    }

    @AfterTest
    public void AfterTest()
    {
        System.out.println("AfterTest method");
    }
    @BeforeClass
    public void Beforeclass()
    {
        System.out.println("Beforeclass method");
    }
    @AfterClass
    public void AfterClass()
    {
        System.out.println("AfterClass method");
    }

    @BeforeMethod
    public void BeforeMethod()
    {
        System.out.println("BeforeMethod method");
    }

    @AfterMethod
    public void AfterMethod()
    {
        System.out.println("AfterMethod method");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("afterSuite method");
    }

    @Test
    public void Test1()
    {
        System.out.println("test 1 method");
    }

    @Test
    public void Test2()
    {
        System.out.println("test 2 method");
    }




}
