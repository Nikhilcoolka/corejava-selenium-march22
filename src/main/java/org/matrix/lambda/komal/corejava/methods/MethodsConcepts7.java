package org.matrix.lambda.komal.corejava.methods;

// Methods with Super and This keyword
public class MethodsConcepts7 extends Employee{     //multiple classes can't extend only one allowed
    public void m1() {
        System.out.println("i'm in child m1");
    }

    public void m2() {
        //m1();            // shows child m1
        this.m1();        // shows child m1
        super.m1();      // shows parent m1
        System.out.println("i'm in child m2");
    }

    public static void main(String[] args) {
        MethodsConcepts7 obj=new MethodsConcepts7();
        obj.m2();
    }
}
