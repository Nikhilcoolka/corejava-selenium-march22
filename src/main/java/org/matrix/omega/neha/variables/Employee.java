package org.matrix.omega.neha.variables;

public class Employee {
    int empId;
    String empName;
    static String companyName = "TCS";

    // Constructor to initialize variable
     Employee(int id, String name) {
        empId = id;
        empName = name;
    }

    public Employee() {
        System.out.println("TCS Company");
    }

    // method to display values
    public void display() {
        System.out.println("34");
        System.out.println("Neha");
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.display();
    }
}