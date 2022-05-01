package org.matrix.lambda.nisha.blocks;

public class StaticBlocks1 {

    static {
        System.out.println("Im in Static Block 1");
    }

    StaticBlocks1() {
        System.out.println("In Constructor");
    }

    static {
        System.out.println("Im in Static Block 2");
    }

    public static void main(String[] args) {
        new StaticBlocks1();
        new StaticBlocks1();
        new StaticBlocks1();
    }
}



/*

Execution Sequence:
Static Block -> Constructor -> Constructor -> Constructor
If we have instance block in the same class
Static Block -> Instance Block -> Constructor -> Instance -> Constructor -> Instance Constructor

 */



