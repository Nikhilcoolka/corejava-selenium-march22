package org.matrix.omega.corejava.blocks;

public class TestInstanceBlock {

    {
        System.out.println("I am in Instance Block1"); // Logic
    }

    {
        System.out.println("I am in Instance Block2"); // Logic
    }

    public TestInstanceBlock() {
        System.out.println("In Constructor"); // Logic
    }

    public TestInstanceBlock(int i) {
        System.out.println("In 1-args Constructor");
    }

    public static void main(String[] args) {
        TestInstanceBlock obj1 = new TestInstanceBlock();
        TestInstanceBlock obj2 = new TestInstanceBlock(10);
        System.out.println("---------------------");

        TestInstanceBlock obj3 = new TestInstanceBlock();

        System.out.println("---------------------");

        TestInstanceBlock obj4 = new TestInstanceBlock();
    }
}
