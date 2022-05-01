package org.matrix.omega.samir.inheritance;

public class ParentClass {
    public ParentClass() {
       // System.out.println("i m in parent constructor");

    }

    public void method() {
        System.out.println("i m in chparent method ");

    }

    public void method1() {
        System.out.println("i m in parent class");
    }

    public static void main(String[] args) {
        ParentClass p = new ChildClass();
        p.method();

    }
}
