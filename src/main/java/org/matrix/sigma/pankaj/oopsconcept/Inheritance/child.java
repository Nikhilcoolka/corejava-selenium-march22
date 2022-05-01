package org.matrix.sigma.pankaj.oopsconcept.Inheritance;

public class child extends Parent{
 int a = 50;
    public void s1(){
        System.out.println("child:: i am in s1 method");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


    public static void main(String[] args) {
        child obj = new child();
        obj.s1();
        obj.s2();
        obj.s3();

    }
}
