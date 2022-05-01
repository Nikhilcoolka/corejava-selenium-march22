package org.matrix.lambda.komal.corejava.methods;

// Method Chaining or Calling
// when we create recursive process we'll get stack overflow error
public class MethodsConcepts3 {
    /*
    public void m1(){
        System.out.println("i'm in m1 method");
        m2();
    }
    public void m2(){
        System.out.println("i'm in m2 method");
        m3();
    }
    public void m3(){
        System.out.println("i'm in m3 method");
    }

    public static void main(String[] args) {
        MethodsConcepts3 obj=new MethodsConcepts3();
        obj.m1();
    }
    */
    //Employee obj;                   // create employee obj var outside method and create object only in one method
    // we can create employee object outside method and can access method using tht obj also
    public void m1() {
        System.out.println("i'm in m1 method");
        Employee obj = new Employee();        //obj variable is local so it'll use in this method only
        obj.getData();                       // can create obj of class in Any Method not only in main method
    }

    public void m2() {
        // Employee obj = new Employee();   // if we want getdata() here then create new obj var
        // obj.getData();

        //obj.getData();
        System.out.println("i'm in m2 method");
        m1();
    }

    public static void main(String[] args) {
        MethodsConcepts3 obj = new MethodsConcepts3();
        obj.m2();
    }
}
