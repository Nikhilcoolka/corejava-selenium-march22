package org.matrix.lambda.komal.corejava.methods;

public class Employee {
    int empId = 1;
    String empName = "komal";
    String empCompany = "tcs";

    public void getData() {
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(empCompany);
    }
    public void m1(){
        System.out.println("i'm in Employee m1");
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
        System.out.println(obj.empId);
        System.out.println(obj.empName);
        System.out.println(obj.empCompany);

    }
}
