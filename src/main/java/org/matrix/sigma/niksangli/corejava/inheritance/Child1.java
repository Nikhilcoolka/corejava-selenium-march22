package org.matrix.sigma.niksangli.corejava.inheritance;

public class Child1 extends Parent {
    static int a = 10;
    int b = 40;

    public void m1() {
        System.out.println("Child m1 method");  ///
        //System.out.println(this.a);  // 10  instance
        //System.out.println(super.a); /// 20  super represents parent class variable
        //System.out.println(this.b);  //40
        //System.out.println(super.b); // 30  super represents parent class variable
        // m1();  recursive
        super.m1();
        this.m2();


    }

    public static void main(String[] args) {
        Child1 obj = new Child1();  //
        obj.m1();

        //System.out.println(obj.b); /// create obj if want to use non static variable in static method


    }


}
