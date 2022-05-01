package org.matrix.omega.nayan;

public class MethodConceptOne {

    public void m1() {     // method without parameter

        System.out.println("i am in instance m1 method");

    }

    public static void m2() {

        System.out.println("i am in static m2 method");
    }


    public static void main(String[] args) {

        MethodConceptOne obj = new MethodConceptOne();
        obj.m1();
        MethodConceptOne.m2();

    }

}





