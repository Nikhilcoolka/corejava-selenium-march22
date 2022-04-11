package org.matrix.sigma.ashish.Method;

public class MethodChanging {
    public void m1() {
        System.out.println("in m1 method");
        System.out.println("call m2 method");
        System.out.println("-----------------------");
        m2();
    }

    public void m2() {
        System.out.println("in m2 method");
        System.out.println("call m3 method");
        System.out.println("-------------------");
        m3();
    }

    public void m3() {

        System.out.println("in m3 method");
    }

    public static void main(String[] args) {
        MethodChanging obj = new MethodChanging();
        System.out.println("Calling method from another method");
        obj.m1();

    }
}
