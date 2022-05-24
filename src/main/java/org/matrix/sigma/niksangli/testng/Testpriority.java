package org.matrix.sigma.niksangli.testng;

import org.testng.annotations.Test;

public class Testpriority {
    @Test(priority = 0)
    public void a()
    {
        System.out.println("method a");
    }

    @Test(priority = -1)
    public void b()
    {
        System.out.println("method b");
    }

    @Test(priority = 1)
    public void c()
    {
        System.out.println("method c");
    }

}
