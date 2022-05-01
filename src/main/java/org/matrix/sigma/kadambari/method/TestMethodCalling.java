package org.matrix.sigma.kadambari.method;

public class TestMethodCalling {
    public void m1() {
        System.out.println("I m in m1 method");
        m2();
    }

    public void m2() {
        System.out.println("I m in m2 method");
        m3();
    }

    public void m3() {
        System.out.println("I m in m3 method");
    }

    public static void main(String[] args) {
        TestMethodCalling obj = new TestMethodCalling();
        obj.m1();//method calling
    }
}
