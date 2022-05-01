package org.matrix.omega.corejava.methods;

import org.matrix.omega.corejava.Employee;

public class TestMethodWithClassReturnType1 {


    public static Employee getEmployeeData() {
        // Employee emp = new Employee();
        return new Employee();
    }

    public Employee getEmployee(Employee ee) {
        return ee;
    }

    public String getName(String str) {
        return str;
    }

    public String getMethodData() {
        return getName("Shriniwas"); // Shriniwas
    }

    public static void main(String[] args) {
        Employee ee = getEmployeeData();
        System.out.println(ee.empId); // var call
        System.out.println(ee.empName); // var call
        System.out.println(Employee.company); // var

        ee.getData(); // method call

        TestMethodWithClassReturnType1 obj = new TestMethodWithClassReturnType1();
        Employee emp = new Employee();
        obj.getEmployee(emp);

        obj.getName("Shriniwas");

        String str = obj.getMethodData(); // Shriniwas
        System.out.println(str);
    }
}
