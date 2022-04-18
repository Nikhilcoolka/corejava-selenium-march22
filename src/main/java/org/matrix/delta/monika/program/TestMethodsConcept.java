package org.matrix.delta.monika.program;

public class TestMethodsConcept {
    public void m1()
    {
        System.out.println("I am in m1 method");
    }
    public  void m2(){
        System.out.println("I am in m2 method");
    }
    //Method with parameter
    public void m3(int age){
        System.out.println("My age is "+age);
    }


    public static void main(String[] args) {
        TestMethodsConcept test=new TestMethodsConcept();
        test.m1();
       test.m2();
        test.m3(20);

    }

}
