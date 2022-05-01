package org.matrix.delta.rahul.corejava;

public class MethodWIthSuperAndThisKeyword extends ExampleClass {
    public void m1() {
        System.out.println("I m of MethodWIthSuperAndThisKeyword class");
    }
    public void m2() {
        this.m1();
        super.m1();

    }

    public static void main(String[] args) {
        MethodWIthSuperAndThisKeyword obj=new MethodWIthSuperAndThisKeyword();
        obj.m2();
    }
}
