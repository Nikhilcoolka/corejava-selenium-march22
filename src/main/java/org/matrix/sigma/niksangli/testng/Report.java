package org.matrix.sigma.niksangli.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Report {

    @Test
    public  void test1()
    {
        Assert.assertEquals(1,2);
    }

    @Test
    public  void test2()
    {
        Assert.assertEquals("Shri","Shri");
    }

    @Test
    public  void test3()
    {
        Assert.assertTrue(false);

    }
}
