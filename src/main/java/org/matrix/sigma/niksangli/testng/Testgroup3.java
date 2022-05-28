package org.matrix.sigma.niksangli.testng;

import org.testng.annotations.Test;

public class Testgroup3 {

    @Test(groups = {"smoke"})
    public void Test10()
    {
        System.out.println("This is Test10");
    }
    @Test(groups = {"sanity"})
    public void Test11()
    {
        System.out.println("This is Test11");
    }

}
