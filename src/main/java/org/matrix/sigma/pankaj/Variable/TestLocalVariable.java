package org.matrix.sigma.pankaj.Variable;

public class TestLocalVariable {

    {
        int age2 = 24;   //this is called blocks
    }

    TestLocalVariable() {
        int age1 = 25;
        System.out.println(age1);     // this is called constructor , name same as class name
    }

    public static void main(String[] args) {
        int age = 28;
        System.out.println(age);

    }

    //new method start
    public void exam() {
        int age = 50;       // local variable
        System.out.println(age);

    }

    public void exam(String str) {
        int age = 10;       // local variable
        System.out.println(age);

    }

}
