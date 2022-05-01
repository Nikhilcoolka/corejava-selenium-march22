package org.matrix.delta.prem.javaconcepts.overriding;

public class OverridingChild extends OverridingParent {
     //Rules of overriding-:
     //overriding is done in child and parent classes i.e. we need to have inheritance relationship(IS-A relationship)
     //same method name same parameters
     // Method Signature Should be same
     //Datatype of parameters should also be the same
     //Sequence of parameter should also be the same

    public void m1(){

        System.out.println("i m in child m1 method");
    }

    public void m1(int a){

        System.out.println("i m in child m1 int method");
    }

    public static void main(String[] args) {

        //parent reference and parent object
        OverridingParent parent = new OverridingParent();
        parent.m1(); //compiler will check if m1 is present or not in parent class
        //if yes, at Runtime JVM will call the method whoever class object is created
        parent.m1(15);

        //child ref and child object
        OverridingChild child =new OverridingChild();
        child.m1();//compiler will check if m1 is present or not in Child class
        //if yes, at Runtime JVM will call the method whoever class object is created
        child.m1(74);

        //parent ref and child object
        OverridingParent p1 =new OverridingChild();
        p1.m1();//compiler will check if m1 is present or not in parent class
        //if yes, at Runtime JVM will call the method whoever class object is created
        p1.m1(12);


        //child ref and parent object is not allowed we can not make obj like this
        //OverridingChild c1 = new OverridingParent();

    // MAin thing in overriding is at RUNTIME JVM will call the method from the class whoever object is created.

    }
}
