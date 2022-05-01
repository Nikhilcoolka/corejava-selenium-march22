package org.matrix.sigma.niksangli.corejava.constructor;

public class TestConstructorChaining {

    public TestConstructorChaining()
    {
        this(31,"Nik");
        System.out.println("This is non parameterized constructor");
    }
    public TestConstructorChaining(int age)
    {
        System.out.println("This is single parameterized constructor");
    }

    public TestConstructorChaining(int age,String name)
    {
        this(32);
        System.out.println("This is double parameterized constructor");
    }

    public static void main(String[] args) {
        TestConstructorChaining tc1=new TestConstructorChaining();
    }
}
