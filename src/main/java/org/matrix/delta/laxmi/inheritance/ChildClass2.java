package org.matrix.delta.laxmi.inheritance;

public class ChildClass2 extends ChildClass1{
    public void m1(){
        super.m1();
        System.out.println("This is Method 1 of Child Class-2");
    }
    public static void main(String[] args) {
        ChildClass2 cc2=new ChildClass2();
        cc2.m1();
    }
}
