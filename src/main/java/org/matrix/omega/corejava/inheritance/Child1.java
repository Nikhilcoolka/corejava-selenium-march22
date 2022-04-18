package org.matrix.omega.corejava.inheritance;

public class Child1 extends Parent {
    int a = 10;

    Child1() {
         super(); // compiler will add super()
        System.out.println("Child Constructor");
        // this(10);
        System.out.println(this.a);
    }

    Child1(int i) {
        System.out.println("Param Constructor");
    }

    public void m1() {
        System.out.println("Child:: m1 method");
        System.out.println(this.a);
        System.out.println(super.a);
        System.out.println(b);
        m2();
        super.m1();
        this.m2();
    }

    public void m2() {
        System.out.println("Child:: m2 method");
    }

    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.m1();
        obj.m2();
        System.out.println(obj.b);
    }
}
