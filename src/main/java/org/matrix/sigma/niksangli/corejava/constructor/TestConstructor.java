package org.matrix.sigma.niksangli.corejava.constructor;

public class TestConstructor {
    int emp_id;
    String empname;

    public TestConstructor()
    {
        System.out.println("This non parameterized constructor");
    }
    public TestConstructor(int age)
    {
        System.out.println("The age is" +age);
    }

    public static void main(String[] args) {
        TestConstructor tc=new TestConstructor();
        TestConstructor tc1=new TestConstructor(31);
    }




}
