package org.matrix.delta.rahul.corejava;

public class MethodCalling {
    public void m1() {
        System.out.println("i am in method m1");
        m2();  // called the m2 method in m1 method.
    }

    public void m2() {
        System.out.println("I am in Method m2");

    }

    public void m3() {
        System.out.println("I am in method m3");
    }

    public static void main(String[] args) {
        MethodCalling obj = new MethodCalling();
        obj.m1(); //called the m1 method.
        // obj.m2();
        // obj.m2();
    }
}
