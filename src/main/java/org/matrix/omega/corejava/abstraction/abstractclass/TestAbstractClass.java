package org.matrix.omega.corejava.abstraction.abstractclass;

public abstract class TestAbstractClass {

    // non abstract method/concrete method
    public void m1() {
        System.out.println("I am in m1 method");
    }

    public abstract void saving(); // abstract method

    public abstract void current();

    public abstract void cashWithdraw();
}
