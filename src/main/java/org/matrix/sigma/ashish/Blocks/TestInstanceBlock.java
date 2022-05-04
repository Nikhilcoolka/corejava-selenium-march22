package org.matrix.sigma.ashish.Blocks;

public class TestInstanceBlock {
    {
        System.out.println("I am in Instance Block1");
    }

    {
        System.out.println(" I am instance Block2");
    }

    public TestInstanceBlock(){
        System.out.println("I am in Constructor");
    }

    public TestInstanceBlock(int age){
        System.out.println(" I am in Parameter Passing Constructor"+age);
    }

    {
        System.out.println(" I am in Instance Block 3");
    }

    public static void main(String[] args) {
        TestInstanceBlock obj=new TestInstanceBlock();
        System.out.println("--------------------------");
        TestInstanceBlock obj2=new TestInstanceBlock(10);
    }
}
