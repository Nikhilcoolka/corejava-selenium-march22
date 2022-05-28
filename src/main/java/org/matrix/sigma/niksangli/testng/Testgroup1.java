package org.matrix.sigma.niksangli.testng;

import org.testng.annotations.Test;

@Test(groups = {"Functional"})
public class Testgroup1
{

    @Test(groups = {"smoke","sanity"})
    public void Test1()
    {
        System.out.println("This is Test1");
    }

    @Test(groups = {"sanity"})
    public void Test2()
    {
        System.out.println("This is Test2");
    }


    @Test(groups = {"smoke"})
    public void Test3()
    {
        System.out.println("This is Test3");
    }

    @Test(groups = {"sanity"})
    public void Test4()
    {
        System.out.println("This is Test4");
    }

    @Test(groups = {"smoke","sanity"})
    public void Test5()
    {
        System.out.println("This is Test5");
    }

    @Test(groups = {"sanity"})
    public void Test6()
    {
        System.out.println("This is Test6");
    }


}
