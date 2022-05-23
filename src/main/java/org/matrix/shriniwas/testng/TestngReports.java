package org.matrix.shriniwas.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngReports {

    @Test
    public void test1() {
        // Code

        Assert.assertEquals(1, 1);
    }

    @Test
    public void test2() {
        // Code
        Assert.assertEquals("Shri", "Shriniwas");
    }

    @Test
    public void test3() {
        // Code
        Assert.assertTrue(false);
    }
}
