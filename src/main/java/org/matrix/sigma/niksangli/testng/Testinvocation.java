package org.matrix.sigma.niksangli.testng;

import org.testng.annotations.Test;

public class Testinvocation {

    @Test(invocationCount = 3)
    public void test1()
    {
        System.out.println("I am in test1 method");
    }
}
