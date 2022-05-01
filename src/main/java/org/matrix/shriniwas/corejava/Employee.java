package org.matrix.shriniwas.corejava;

public class Employee {
    public int empId = 123;
    public String empName = "Shriniwas";
    public static String company = "Microsoft";

    public void getData() {
        System.out.println(empId);
        System.out.println(empName);
    }

    public void m1() {
        System.out.println("I am in Employee :: m1 method");
    }
}
