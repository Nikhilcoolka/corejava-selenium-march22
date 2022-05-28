package org.matrix.sigma.niksangli.testng;

import org.testng.annotations.Test;

public class Testgroup2 {

  @Test(groups = {"smoke","sanity"})
    public void Test7()
    {
        System.out.println("This is Test7");
    }

    @Test(groups = {"smoke","sanity","Regression"})
    public void Test8()
    {
        System.out.println("This is Test8");
    }

    @Test(groups = {"smoke","sanity"})
    public void Test9()
    {
        System.out.println("This is Test9");
    }

}
