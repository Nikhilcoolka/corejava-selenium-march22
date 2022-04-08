package org.matrix.sigma.prajakta.corejava.methods;

import org.matrix.sigma.prajakta.corejava.EmployeeDemo;

public class MethodWithClassReturnType {

    public static EmployeeDemo getEmp() {
        return new EmployeeDemo();
    }

    public static void main(String[] args) {
        EmployeeDemo ee = getEmp();
        System.out.println(ee.empId);
        System.out.println(ee.empName);
        System.out.println(ee.empCompany);
        ee.getData2();
    }
}
