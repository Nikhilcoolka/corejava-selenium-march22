package org.matrix.sigma.niksangli.corejava.constructor;

public class TestChild extends TestParent
{
    TestChild()
    {
        System.out.println("This is test Child Constructor");
    }
    public void get()
    {
        System.out.println("This is method");
    }

    public static void main(String[] args)
    {
        TestChild tc=new TestChild();
        System.out.println("********************************");

        tc.get();  // with reference variable tc
        System.out.println("********************************");

        new TestChild().get(); /// without using reference variable

        System.out.println("********************************");
        System.out.println("**********************************");

        TestParent tp=new TestParent();

    }
}
