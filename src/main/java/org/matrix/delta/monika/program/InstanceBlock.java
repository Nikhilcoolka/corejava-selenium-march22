package org.matrix.delta.monika.program;

public class InstanceBlock {
    {
        System.out.println("i am in instance block");
    }

    {
        System.out.println("i am in instance block1");
    }

    public InstanceBlock() {
        System.out.println("constructor");
    }

    public InstanceBlock(int i) {
        System.out.println(i);
    }


    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();
        InstanceBlock obj1 = new InstanceBlock(10);
        System.out.println("------");
    }
}
