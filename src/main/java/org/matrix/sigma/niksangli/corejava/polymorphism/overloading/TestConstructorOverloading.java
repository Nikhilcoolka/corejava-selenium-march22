package org.matrix.sigma.niksangli.corejava.polymorphism.overloading;

public class TestConstructorOverloading
{
    public  TestConstructorOverloading(int a)

    {
        System.out.println("Paramerized constructor" +a);
    }

    public TestConstructorOverloading()
    {
        System.out.println("0 arguments");
    }
     public TestConstructorOverloading(String s1,int b)
     {
         System.out.println("paramerized" +s1+b);
     }

    public static void main(String[] args)
    {
        new TestConstructorOverloading(10);
        new TestConstructorOverloading();
        new TestConstructorOverloading("Niki",90);

    }
}
