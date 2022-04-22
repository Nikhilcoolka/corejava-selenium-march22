package org.matrix.alpha.shamal.java.method;

public class MethodWithThisKeyword {
    public void m1(){
        m2();
        System.out.println("I am in method m1");
    }

    public  void m2(){
        this.m3();
        System.out.println("I am in method m2");
    }

    public  void m3(){
        System.out.println("I am in method m3");
    }

    public static void main(String[] args) {
        MethodWithThisKeyword obj = new MethodWithThisKeyword();
        obj.m1();
        obj.m2();
        obj.m3();
    }

}
