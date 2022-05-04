package org.matrix.sigma.ashish.Constructor;

public class TestChildConstructor extends TestParentConstructor {
    TestChildConstructor() {
        System.out.println("I am in Test Child Constructor");
    }

    public void get() {
        System.out.println("--------------------------------------");
        System.out.println("I am in Child Class Constructor method");
    }

    public static void main(String[] args) {
        new TestChildConstructor().get();
    }

}
