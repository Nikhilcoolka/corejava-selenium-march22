package org.matrix.omega.samir.inheritance;

public class ChildClass extends ParentClass {
    public void method() {
        System.out.println("i m in child class");

    }
    public void method(int a ) {
        System.out.println("i m in child class"+a);

    }

    public ChildClass() {
     //   System.out.println("i m in child constructor");
    }

    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        c.method();
        //c.method1();


    }
}
