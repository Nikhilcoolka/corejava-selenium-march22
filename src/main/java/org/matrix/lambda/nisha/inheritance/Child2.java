package org.matrix.lambda.nisha.inheritance;

public class Child2 extends Parent {

    public void m4() {
        System.out.println("Child2 :: m4 method");
    }

    public static void main(String[] args) {
        Child2 ref = new Child2();
        ref.m4();
        ref.m3();
    }
}
