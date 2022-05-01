package org.matrix.delta.rahul.corejava;

public class MethodDeclaration {
    // Method Without argument/parameter.
    public void data1() {
        System.out.println("Created Second Simple Method");
    }

    //static method without argument/parameter.
    public static void data2() {
        System.out.println("Created Static Method");
    }

    public void m1(int age, String name) {
        System.out.println("My age is " + age + " & " + "name is " + name);
    }

    public static void main(String[] args) {
        MethodDeclaration obj = new MethodDeclaration();
        obj.data1(); //simple method call by using the object.
        MethodDeclaration.data2(); //static method/variable call by using the class name.
        obj.m1(20, "Sagar"); //passing the value to the parameter.
    }
}
