package org.matrix.sigma.ashish.Method;

public class MethodObject {
    ObjectMethod obj = new ObjectMethod();

    public void m1() {
        // ObjectMethod obj=new ObjectMethod();
        obj.getdata1();
    }

    public void m2() {
        obj.getdata();
    }

    public static void main(String[] args) {
        MethodObject b = new MethodObject();
        b.m1();
        b.m2();
    }
}
