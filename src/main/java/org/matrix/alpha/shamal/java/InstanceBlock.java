package org.matrix.alpha.shamal.java;

public class InstanceBlock {

    {
        System.out.println("I am in Instance Block1"); // Logic
    }

    {
        System.out.println("I am in Instance Block2"); // Logic
    }

    public InstanceBlock() {
        System.out.println("In Constructor"); // Logic
    }

    public InstanceBlock(int age) {

        System.out.println("In Constructor"); // Logic
    }

    public static void main(String[] args) {
        InstanceBlock obj1 = new InstanceBlock();

        InstanceBlock obj2 = new InstanceBlock(10);
        System.out.println("---------------------");

        InstanceBlock obj3 = new InstanceBlock();
    }

}
