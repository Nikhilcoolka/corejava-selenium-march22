package org.matrix.omega.corejava.constructors;

public class TestConstructorNew {
    int empId; // empId = 10
    String empName; // empName = "Shri1"

    public TestConstructorNew(int empId, String empName) {
        this.empId = empId;  // empId = 10
        this.empName = empName; // empName = "Shri1"
    }

    public void getEmployeeData() {
        System.out.println("EmpId:" + empId);
        System.out.println("EmpName:" + empName);
    }

    public static void main(String[] args) {
        TestConstructorNew obj1 = new TestConstructorNew(10, "Shri1");
        obj1.getEmployeeData();

        System.out.println("-----------------------");

        TestConstructorNew obj2 = new TestConstructorNew(20, "Shri2");
        obj2.getEmployeeData();
    }
}
