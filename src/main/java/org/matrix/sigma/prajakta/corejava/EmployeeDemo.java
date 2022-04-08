package org.matrix.sigma.prajakta.corejava;

public class EmployeeDemo {

    int empId=1;
    String empName="Prajakta";
    String empCompany="Cognizant";

    void getData(){
        System.out.println("Employee ID:-"+empId);
        System.out.println("Employee Name:-"+empName);
        System.out.println("Company Name:-"+empCompany);
    }
    public static void main(String[] args) {
        EmployeeDemo obj=new EmployeeDemo();
        obj.getData();   // This is method calling.

    }
}
