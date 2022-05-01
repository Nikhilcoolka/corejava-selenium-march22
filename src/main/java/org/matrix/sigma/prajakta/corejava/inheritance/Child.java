package org.matrix.sigma.prajakta.corejava.inheritance;

public class Child extends Parent {

    int a = 10;

    Child() {
        super();
        System.out.println("In child class constructor");
    }

    void m1() {
        System.out.println("Child method::m1");
        System.out.println(this.a);
        System.out.println("parent class variable::" + super.a);
        super.m2();  //call parent class method
        System.out.println("Grand parent class variable::"+super.d);
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.m1();
        System.out.println(obj.a);   //call parent class variable using object reference
        obj.m2();   //call parent class m2()
    }
}
