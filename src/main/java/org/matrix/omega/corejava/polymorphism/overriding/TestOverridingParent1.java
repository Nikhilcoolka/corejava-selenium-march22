package org.matrix.omega.corejava.polymorphism.overriding;

public class TestOverridingParent1 {

    public void m1(int i) {
        System.out.println("I am in Parent:: m1(int) method");
    }

    public void m1(String a) {
        System.out.println("I am in Child:: m1(String) method");
    }
}
