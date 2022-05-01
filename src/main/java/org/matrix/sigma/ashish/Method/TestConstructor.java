package org.matrix.sigma.ashish.Method;

public class TestConstructor {
    int EmpId;
    String Ename;

    public TestConstructor(){
        System.out.println("I am in No value Passing Constructor");

    }

    public TestConstructor (int Empid){
        System.out.println("---------------------------------------");
        System.out.println("I am in Int Value Passing Constructor");
        System.out.println("Employee Id :  "+Empid);
    }

    public TestConstructor(String Ename){
        System.out.println("----------------------------------------");
        System.out.println("I am in String Value Passing Constructor");
        System.out.println("Employee Name:  "+Ename);
    }

    public static void main(String[] args) {
        TestConstructor TC=new TestConstructor();
        TestConstructor TC1=new TestConstructor(10);
        TestConstructor TC2=new TestConstructor("Ashish");

    }
}
