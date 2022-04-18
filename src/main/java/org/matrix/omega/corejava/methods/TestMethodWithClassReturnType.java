package org.matrix.omega.corejava.methods;

import org.matrix.omega.corejava.Employee;

public class TestMethodWithClassReturnType {

    public static Employee getEmployeeData() {
        Employee emp = new Employee();
        return emp;
    }

    public static void main(String[] args) {
        Employee ee = getEmployeeData();
        System.out.println(ee.empId); // var call
        System.out.println(ee.empName); // var call
        System.out.println(Employee.company); // var

        ee.getData(); // method call
    }
}
