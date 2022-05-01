package org.matrix.shriniwas.corejava.variables;

import org.matrix.shriniwas.corejava.Employee;

public class InstanceVariable {

    int age = 100;  // This is a non static instance variable
    // static int age = 100; // This is a static instance variable

    /* TestInstanceVariable() {
        System.out.println(age);
    } */

    public void display() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        // Non static variables can not be used directly inside static methods
        // System.out.println(age);

        // Object Creation
        InstanceVariable obj = new InstanceVariable();
        System.out.println(obj.age); // By using object creation

        // Object Creation
        Employee emp = new Employee();
        System.out.println(emp.empName);
        System.out.println(emp.empId);

    }
}
