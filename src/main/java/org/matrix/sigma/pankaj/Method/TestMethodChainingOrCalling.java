package org.matrix.sigma.pankaj.Method;

public class TestMethodChainingOrCalling {

    public void p1(){
        System.out.println("hello i am pankaj i am in p1 method");
        p2();  // method calling

    }

     public void p2(){
         System.out.println("hello i am pankaj i am in p2 method");
         p3(); //method calling


     }
    public void p3(){
        System.out.println("hello i am pankaj i am in p3 method");

    }

    public static void main(String[] args) {
        TestMethodChainingOrCalling obj = new TestMethodChainingOrCalling();
        obj.p1(); //method calling
    }

}
