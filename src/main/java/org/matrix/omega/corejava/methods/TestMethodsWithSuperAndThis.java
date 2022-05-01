package org.matrix.omega.corejava.methods;

import org.matrix.omega.corejava.Employee;

public class TestMethodsWithSuperAndThis extends Employee {

    public void m1() {
        System.out.println("I am in TestMethodsWithSuperAndThis :: m1 method");
    }

    public void m2() {
        this.m1();
        super.m1();
    }

    public static void main(String[] args) {
        TestMethodsWithSuperAndThis obj = new TestMethodsWithSuperAndThis();
        obj.m2();
    }
}
