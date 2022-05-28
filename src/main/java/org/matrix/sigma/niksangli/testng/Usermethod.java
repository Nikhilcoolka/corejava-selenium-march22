package org.matrix.sigma.niksangli.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

// @Listeners(TestListner.class)
public class Usermethod {

    @Test
    public void test1()
    {
        System.out.println("I am in test1 method");
    }


    @Test
    public void test2()
    {
        System.out.println("I am in test2 method");
        Assert.assertEquals(1,2);
    }

    @Test(dependsOnMethods = "test2")
    public void test3()
    {
        System.out.println("I am in test3 method");
    }

    @Test
    public void test4()
    {
        System.out.println("I am in test4 method");
    }

    @Test(timeOut = 2000)
    public void test5() throws InterruptedException {
        System.out.println("I am in test5 method");
       // Thread.sleep(4000);
    }
}
