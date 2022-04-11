package org.matrix.omega.nayan;

public class PractiseTwoMethod {

    int a = 200;

    public void m1() {
        int a = 1001;
        System.out.println(a);     // local variable high priority
        System.out.println(this.a); // we can use instance variable by using this keyword

    }

    public void m2(int a, String b) {
        m1();
        System.out.println("value of a:" + a);
        System.out.println("value of parameter b:" + b);
        System.out.println("next");
    }

    public void m3() {

        System.out.println("default parameter");

    }


    public static void main(String[] args) {
        PractiseTwoMethod obj = new PractiseTwoMethod();
        obj.m2(10, "NAYAN");


    }


}
