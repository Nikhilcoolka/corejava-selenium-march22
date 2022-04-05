package org.matrix.shriniwas.corejava.polymorphism.overriding;

public class ChildAccessSpecifier extends ParentAccessSpecifier {

    public void m1() {
        System.out.println("In Child::m1 method");
    }

    public static void main(String[] args) {
        ChildAccessSpecifier obj = new ChildAccessSpecifier();
        obj.m1();
    }
}
