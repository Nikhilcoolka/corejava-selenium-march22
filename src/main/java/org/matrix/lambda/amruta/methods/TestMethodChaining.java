package org.matrix.lambda.amruta.methods;

public class TestMethodChaining{

  public void m1(){
        System.out.println("This is 1st line");
        m2();

    }
    public void m2(){
        System.out.println("This is 2nd line");
    }

    public static void main(String[] args) {
        TestMethodChaining obj = new TestMethodChaining();
        obj.m1();


    }
}
