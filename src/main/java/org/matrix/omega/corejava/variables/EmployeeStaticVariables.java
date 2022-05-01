package org.matrix.omega.corejava.variables;

import org.matrix.omega.corejava.Employee;

public class EmployeeStaticVariables {

    int empId1 = 100;
    String empName1 = "Shri1";
    static String companyName = "ABC";

    int empId2 = 101;
    String empName2 = "Shri2";

    public void getData1() {
        System.out.println(empId1);
        System.out.println(empName1);
        System.out.println(EmployeeStaticVariables.companyName);
        System.out.println(Employee.company);
        System.out.println(companyName); //1. We can directly use static variables in static and non static methods
    }

    public void getData2() {
        System.out.println(empId2);
        System.out.println(empName2);
        System.out.println(EmployeeStaticVariables.companyName);  //2. By using class name
        System.out.println(Employee.company);
    }

    static public void main(String[] args) {
        EmployeeStaticVariables emp1 = new EmployeeStaticVariables();
        emp1.getData1();
        System.out.println(emp1.companyName); // 3. By using object reference

        System.out.println("-------------------");

        EmployeeStaticVariables emp2 = new EmployeeStaticVariables();
        emp2.getData2();

    }
}
