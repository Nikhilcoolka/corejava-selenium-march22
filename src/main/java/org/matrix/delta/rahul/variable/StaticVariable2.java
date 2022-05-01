package org.matrix.delta.rahul.variable;

public class StaticVariable2 {
    static int empID = 100;
    int age = 120;

    /*
    public void m1() {
         static int roll;

     }
     */

    public static void main(String[] args) {
        System.out.println(StaticVariable2.empID);
        StaticVariable2 obj = new StaticVariable2();
        System.out.println(obj.age);

    }
}
/*
 * >> static variable can not declare in method check the line 7 to 12.
 * >> static variable, we can call by using class name check the line 16
 * >>
 * */