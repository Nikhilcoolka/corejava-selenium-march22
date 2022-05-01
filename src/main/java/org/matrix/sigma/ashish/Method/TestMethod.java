package org.matrix.sigma.ashish.Method;

public class TestMethod {
    public static void main(String[] args) {
        TestMethod TM = new TestMethod();
        //ObjectMethod OM=new ObjectMethod();

        TM.m2();
        //OM.getdata();

        TestMethod.m1();
        //OM.getdata1();

        TM.m3(30);
        m4(40);


    }

    //static method
    public static void m1() {
        System.out.println("I am in static method m2");
    }

    //instance method
    public void m2() {
        System.out.println("I am an instance m1 method");
    }

    //method with parameter
    public void m3(int age) {
        System.out.println("My Age is   " + age);
    }

    //static method with parameter
    public static void m4(int age) {
        System.out.println("My static age is  " + age);
    }

}
