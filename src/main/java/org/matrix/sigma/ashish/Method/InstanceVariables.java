package org.matrix.sigma.ashish.Method;

public class InstanceVariables {
    int age = 20;
    static int newage = 30;

    public static void main(String[] args) {
        // System.out.println("age  " +age);
        //nonstatic variables not used in static methods

        System.out.println("age  " + newage);
        //static variables  used directly in static methods


        //Object Creation
        InstanceVariables iv = new InstanceVariables();
        // nonstatic variables  used in static methods using object
        System.out.println("age  " + iv.age);


        //Object crestion of another class
        Employee ee = new Employee();
        System.out.println("Emplyee Name" + ee.empname);
        System.out.println("Employee Id" + ee.empid);
    }

    public void test(String str) {

        System.out.println(str);
        //static variables  used directly in nonstatic methods

        System.out.println("age  " + age);
    }
}
