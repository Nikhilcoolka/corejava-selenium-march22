package org.matrix.shriniwas.testng;

import org.testng.annotations.Test;

@Test(groups = {"functional"})
public class TestGrouping1 {

    @Test(groups = {"smoke", "sanity", "regression"})
    public void test1() {
        System.out.println("I am in Test1");
    }

    @Test(groups = {"sanity"})
    public void test2() {
        System.out.println("I am in Test2");
    }

    @Test(groups = {"smoke"})
    public void test3() {
        System.out.println("I am in Test3");
    }

    @Test(groups = {"sanity"})
    public void test4() {
        System.out.println("I am in Test4");
    }

    @Test(groups = {"smoke", "sanity"})
    public void test5() {
        System.out.println("I am in Test5");
    }

    @Test(groups = {"sanity", "regression"})
    public void test6() {
        System.out.println("I am in Test6");
    }
}
