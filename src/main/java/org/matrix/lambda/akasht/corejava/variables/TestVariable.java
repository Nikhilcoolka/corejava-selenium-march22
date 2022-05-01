package org.matrix.lambda.akasht.corejava.variables;

import org.matrix.lambda.akasht.corejava.Employee;

public class TestVariable {

    public static void main(String[] args) {
        int age = 26;
        System.out.println(age);
    }

    public void test(String str) {
        int i = 10;
        int age = 100;
        System.out.println(i);
        System.out.println(age);

    //Object creation
        Employee emp = new Employee();
        System.out.println(emp);
    }
}