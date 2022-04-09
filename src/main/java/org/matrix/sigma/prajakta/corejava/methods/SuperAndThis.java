package org.matrix.sigma.prajakta.corejava.methods;

import org.matrix.sigma.prajakta.corejava.EmployeeDemo;

public class SuperAndThis extends EmployeeDemo {

    public void m1() {
        System.out.println("I am in SuperAndThis class m1 method...");
    }

    public void m2() {
        this.m1();
        super.m1();
        System.out.println("I am in m2 method...");
    }

    public void m3(){
        System.out.println("call variable from parent class...");
        System.out.println(super.empId);
        System.out.println(super.empName);
        System.out.println(super.empCompany);
    }

    public static void main(String[] args) {
        SuperAndThis obj = new SuperAndThis();
        obj.m2();
        obj.m3();
    }
}
