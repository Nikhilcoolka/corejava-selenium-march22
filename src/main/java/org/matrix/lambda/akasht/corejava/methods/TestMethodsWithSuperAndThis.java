package org.matrix.lambda.akasht.corejava.methods;

import org.matrix.lambda.akasht.corejava.Employee;

public class TestMethodsWithSuperAndThis extends Employee {
    public void m1() {
        System.out.println("I am in a TestMethodsWithSuperAndThis :: m1 Method ");
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