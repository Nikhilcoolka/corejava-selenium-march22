package org.matrix.delta.rahul.corejava;

public class MethodCallingFromDifferentClass {
    public void m1() {
        MethodDeclaration.data2();// static data2() method in MethodDeclation.
        LocalMethodPriority l = new LocalMethodPriority();
        l.addition(10, 52);// obj created for calling the addition method of LocalMethodPriority.

    }

    public static void main(String[] args) {
        MethodCallingFromDifferentClass obj = new MethodCallingFromDifferentClass();
        obj.m1();
    }
}
