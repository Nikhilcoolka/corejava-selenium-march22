package org.matrix.sigma.kadambari;

public class TestEmployeeStaticVariable {

    int empI1 = 100;
    String empName1 = "shravi";
    int empId2 = 101;
    String empName2 = "shri";

    public void getData1() {
        System.out.println("empId1");
        System.out.println("emoName1");
        System.out.println("TestEmployeeStaticVariable.companyName");
    }

    public void getDate2() {
        System.out.println("empId2");
        System.out.println("empName");
        System.out.println("TestEmployeeStaticVariable.companyName");
    }

    public static void main(String[] args) {
        TestEmployeeStaticVariable obj1 = new TestEmployeeStaticVariable();
        obj1.getData1();
        TestEmployeeStaticVariable obj2 = new TestEmployeeStaticVariable();
        obj2.getDate2();

    }
}