package org.matrix.omega.corejava.polymorphism.overriding;

public class Child extends Parent {

    public String m1() {
        System.out.println("In Child m1 method");
        return "Shriniwas";
    }

    private void m2() {
        System.out.println("In Child m2 method");
    }

    public static void m3() {
        System.out.println("In Child m3 method");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.m1();
        // p.m2();
        p.m3(); //  Method Hiding Concept

    }
}
