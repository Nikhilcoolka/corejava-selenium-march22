package org.matrix.shriniwas.testng;

import org.testng.annotations.Test;

public class TestGrouping2 {

    @Test(groups = {"smoke"})
    public void test7() {
        System.out.println("I am in Test7");
    }

    @Test(groups = {"smoke"})
    public void test8() {
        System.out.println("I am in Test8");
    }

    @Test(groups = {"sanity", "smoke"})
    public void test9() {
        System.out.println("I am in Test9");
    }

}
