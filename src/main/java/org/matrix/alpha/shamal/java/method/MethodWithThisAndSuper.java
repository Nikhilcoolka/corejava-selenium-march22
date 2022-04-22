package org.matrix.alpha.shamal.java.method;

public class MethodWithThisAndSuper extends Student{

    public void m1(){
        System.out.println("This is the MethodsWithThisAndSuper Class :: m1 method");
    }

    public void m2(){
        this.m1();
        super.m1();
    }

    public static void main(String[] args) {
        MethodWithThisKeyword obj = new MethodWithThisKeyword();
        obj.m1();
        obj.m2();
    }
}
