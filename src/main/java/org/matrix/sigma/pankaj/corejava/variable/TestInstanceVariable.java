package org.matrix.sigma.pankaj.corejava.variable;

import org.matrix.sigma.pankaj.corejava.Employee;

public class TestInstanceVariable {
    int age = 30;

    public void display() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        // System.out.println(age); //non static variable can't use directly inside static method

        //memory allocation //object creation
        TestInstanceVariable obj = new TestInstanceVariable();
        System.out.println(obj.age); //instance variable use by using object creation

        //object creation
        Employee emp = new Employee();
        System.out.println(emp.empname);
        System.out.println(emp.empId);
    }
}

