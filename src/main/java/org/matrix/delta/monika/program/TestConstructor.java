package org.matrix.delta.monika.program;

public class TestConstructor {
    int empId;
    String empName;
    public TestConstructor(){
        System.out.println("This is non args constructor");
    }
    public TestConstructor(int age){
        System.out.println("My age is "+age);
    }

    public static void main(String[] args) {
        TestConstructor obj = new TestConstructor();
        TestConstructor obj1 = new TestConstructor(20);
    }
}
