package org.matrix.alpha.sunil.selenium.corejava.constructor;

public class TestConstructor {
    int empId;
    String empName;
    static String empCompanyName = "Google";

    TestConstructor(int empid, String empName) {
        this.empId = empid;
        this.empName = empName;
        System.out.println(empid);
        System.out.println(empName);
        System.out.println(empCompanyName);
    }

    public static void main(String[] args) {
        TestConstructor obj1 = new TestConstructor(100, "Sunil");
        TestConstructor obj2 = new TestConstructor(101, "Anil");

    }
}
