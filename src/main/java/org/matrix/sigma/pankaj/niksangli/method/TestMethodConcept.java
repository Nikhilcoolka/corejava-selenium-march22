package org.matrix.sigma.niksangli.method;

public class TestMethodConcept
{
    public void m1()
    {
        System.out.println("This is m1 method");
    }
    public static void m2()
    {
        System.out.println("This is m2 method");
    }
    public void m3(int age)
    {
        System.out.println("Age is" +age);
    }

    public static void m4(int age)
    {
        System.out.println("Age is" +age);
    }
    public static void m5(int a,int b)
    {
            int c=a*b;
            System.out.println("Multiplication is"+c);
    }

    public static void main(String[] args)
    {
        TestMethodConcept tc=new TestMethodConcept();
        tc.m1();
        TestMethodConcept.m2();
        tc.m3(30);
        TestMethodConcept.m4(31);
        TestMethodConcept.m5(20,11);
    }
}
