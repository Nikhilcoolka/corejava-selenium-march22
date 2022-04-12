package org.matrix.lambda.akasht.corejava.methods;

import org.matrix.lambda.akasht.corejava.Employee;

public class TestEmployeeStaticVariables {

    int empId1 = 100;
    String empName1 = "Akash";
    static String companyName = "ABC";

    int empId2 = 101;
    String empName2 = "Akash";

    public void getData1() {
        System.out.println(empId1);
        System.out.println(empName1);
        System.out.println(TestEmployeeStaticVariables.companyName);
        System.out.println(Employee.companyName);
        System.out.println(companyName); //1. We can directly use static variables in static and non static methods
    }

    public void getData2() {
        System.out.println(empId2);
        System.out.println(empName2);
        System.out.println(TestEmployeeStaticVariables.companyName);  //2. By using class name
        System.out.println(Employee.companyName);
    }

    static public void main(String[] args) {
        TestEmployeeStaticVariables emp1 = new TestEmployeeStaticVariables();
        emp1.getData1();
        System.out.println(emp1.companyName); // 3. By using object reference

        System.out.println("-------------------");

        TestEmployeeStaticVariables emp2 = new TestEmployeeStaticVariables();
        emp2.getData2();

    }
}
