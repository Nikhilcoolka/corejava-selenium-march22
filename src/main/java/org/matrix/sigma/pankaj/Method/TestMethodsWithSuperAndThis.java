package org.matrix.sigma.pankaj.Method;

import org.matrix.sigma.pankaj.corejava.Employee;

public class TestMethodsWithSuperAndThis extends Employee {

    public void s1() {
        System.out.println("i am in TestMethodsWithSuperAndThis :: s1 method ");
    }

    public void s2() {
        this.s1();
    }

    public static void main(String[] args) {
        TestMethodsWithSuperAndThis obj = new TestMethodsWithSuperAndThis();
        obj.s2();

    }

}
