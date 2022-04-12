package org.matrix.lambda.akasht.corejava;

public class Employee {
    int empId = 100;
    String empName = "Akash";
    public static String companyName = "Techsum";

    public void getData() {
        System.out.println(empId);
        System.out.println(empName);
    }

    public void m1() {
        System.out.println("I am in Employee :: m1 method");
    }
}
