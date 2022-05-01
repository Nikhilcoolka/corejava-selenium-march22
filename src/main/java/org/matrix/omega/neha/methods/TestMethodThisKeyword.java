package org.matrix.omega.neha.methods;

import java.io.FilterOutputStream;

public class TestMethodThisKeyword {
    public void m1() {
        System.out.println("i am in m1 method");
        this.m2();
    }

    public void m2() {
        System.out.println("I am in m2 method");

    }

    public static void main(String[] args) {
        TestMethodThisKeyword obj = new TestMethodThisKeyword();
        obj.m1();
    }
}