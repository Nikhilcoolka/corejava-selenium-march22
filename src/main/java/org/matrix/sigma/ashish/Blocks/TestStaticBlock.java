package org.matrix.sigma.ashish.Blocks;

public class TestStaticBlock {

    static{
        System.out.println("I am in static block");
    }

    public TestStaticBlock(){
        System.out.println("I am in constructor");
    }

    public static void main(String[] args) {
        TestStaticBlock obj=new TestStaticBlock();
        TestStaticBlock obj2=new TestStaticBlock();
    }
}
