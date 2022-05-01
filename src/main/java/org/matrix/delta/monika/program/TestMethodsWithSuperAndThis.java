package org.matrix.delta.monika.program;

public class TestMethodsWithSuperAndThis extends TestMethodsConcept{

    public void m1(){
        System.out.println("I am in TestMethodswithSuperAndThis");
    }
    public void m2(){
        this.m1();
        super.m1();
    }

    public static void main(String[] args) {
        TestMethodsWithSuperAndThis test=new TestMethodsWithSuperAndThis();test.m2();
        test.m2();
    }
}
