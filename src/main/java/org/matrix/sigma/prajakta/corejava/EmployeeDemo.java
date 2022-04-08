package org.matrix.sigma.prajakta.corejava;

public class EmployeeDemo {

    public int empId=1;
    public String empName="Prajakta";
    public String empCompany="Cognizant";

    void getData(){
        System.out.println("Employee ID:-"+empId);
        System.out.println("Employee Name:-"+empName);
        System.out.println("Company Name:-"+empCompany);
    }

    public void getData2(){
        System.out.println("Employee ID:-"+empId);
        System.out.println("Employee Name:-"+empName);
        System.out.println("Company Name:-"+empCompany);
    }
    public static void main(String[] args) {
        EmployeeDemo obj=new EmployeeDemo();
        obj.getData();   // This is method calling.
        obj.getData2();
    }
}
