package org.matrix.alpha.shamal.java.method;

public class MethodChaniningOrCalling {
    public void m1() {
        System.out.println("I am in m1 method");
        m2();
    }

    public void m2() {
        System.out.println("I am in m2 method");
        m3();
    }

    public void m3() {
        System.out.println("I am in m3 method");
    }

    public static void main(String[] args) {
        MethodChaniningOrCalling obj = new MethodChaniningOrCalling();
        obj.m1();
        // I am in m1 method
        // I am in m2 method
        // I am in m3 method
    }
}
