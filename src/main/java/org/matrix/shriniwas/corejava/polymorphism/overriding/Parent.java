package org.matrix.shriniwas.corejava.polymorphism.overriding;

public class Parent {

    public Object m1() {
        System.out.println("In Parent m1 method");
        return 1;
    }

    private void m2() {
        System.out.println("In Parent m2 method");
    }

    public static void m3() {
        System.out.println("In Parent m3 method");
    }
}
