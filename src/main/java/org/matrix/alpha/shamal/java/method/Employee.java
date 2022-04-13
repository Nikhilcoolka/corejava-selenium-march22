package org.matrix.alpha.shamal.java.method;

public class Employee {

    int EmpId;
    String EmpName;
    static String CompanyName;
    String DeptName;

    public void getData(int id, String eName, String cmpName, String dName) {
        System.out.println("Employee ID Is:" + id);
        System.out.println("Employee Name Is :" + eName);
        System.out.println("Employee Company Name Is:" + CompanyName);
        System.out.println("Employee Department Is:" + dName);

    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getData(1001, "Shamal-jadhav", "ABC", "Testing");
    }
}
