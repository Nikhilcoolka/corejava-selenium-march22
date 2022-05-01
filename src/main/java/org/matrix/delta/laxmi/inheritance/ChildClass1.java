package org.matrix.delta.laxmi.inheritance;

public class ChildClass1 extends ParentClass{
    public void m1(){
        super.m1();
        System.out.println("This is Method 1 of Child Class-1");
    }
    public static void main(String[] args) {
        ChildClass1 cc1=new ChildClass1();
        cc1.m1();

    }
}
