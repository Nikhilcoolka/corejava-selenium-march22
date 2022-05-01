package org.matrix.lambda.nisha.blocks;

public class InstanceBlocks {

    // Instance Initializer block is used to initialize the instance data member.
    // It runs each time whenever an object of the class is created.

    {
        System.out.println("I'm in Instance Block 1");
    }

    public InstanceBlocks() {
        System.out.println("Constructor  block");
    }

    {
        System.out.println("I'm in Instance Block 2");
    }

    public InstanceBlocks(int i) {
        System.out.println("In 1-args constructor");
    }

    public InstanceBlocks(int i, String myCar) {
        System.out.println("In 2-args constructor");
    }

    public static void main(String[] args) {
        InstanceBlocks myobj = new InstanceBlocks();                // object 1

        System.out.println("---------------------------------");

        InstanceBlocks myobj1 = new InstanceBlocks();               // object 2
        System.out.println("---------------------------------");

        InstanceBlocks myobj2 = new InstanceBlocks(58);               // object 2
        System.out.println("---------------------------------");

        InstanceBlocks myobj3 = new InstanceBlocks(6, "Nisha");               // object 2

    }
}


