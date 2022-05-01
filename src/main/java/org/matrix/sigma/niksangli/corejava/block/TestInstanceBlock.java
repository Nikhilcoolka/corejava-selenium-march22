package org.matrix.sigma.niksangli.corejava.block;

public class TestInstanceBlock {

    {
        System.out.println("This is 1st Instance block");
    }
    {
        System.out.println("This is 2nd instance block");
    }
    TestInstanceBlock()
    {
        System.out.println("This is constructor");
    }
    TestInstanceBlock(int i)
    {
        System.out.println("parameter constructor"+i);
    }

    public static void main(String[] args) {
        TestInstanceBlock tb=new TestInstanceBlock();
        System.out.println("*********************************");
        TestInstanceBlock tb1=new TestInstanceBlock(12);
        System.out.println("*********************************");
        TestInstanceBlock tb2=new TestInstanceBlock();
        System.out.println("*********************************");
        TestInstanceBlock tb3=new TestInstanceBlock();



    }

}
