package org.matrix.shriniwas.corejava.constructors;

public class TestConstructorNewDefault {
    int empId;
    String empName;

    TestConstructorNewDefault(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public static void main(String[] args) {
        TestConstructorNewDefault e1 = new TestConstructorNewDefault(100, "Shri1");
        TestConstructorNewDefault e2 = new TestConstructorNewDefault(200, "Shri2");
    }
}
