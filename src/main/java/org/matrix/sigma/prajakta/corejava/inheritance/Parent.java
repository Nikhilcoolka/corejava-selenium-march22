package org.matrix.sigma.prajakta.corejava.inheritance;

public class Parent extends GrandParent {

    int a = 20;
    int b = 30;

    public Parent() {
        System.out.println("In parent constructor");
    }

    void m2() {
        System.out.println("Parent method::m2");
    }
}
