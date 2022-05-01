package org.matrix.lambda.nisha.blocks;

public class StaticBlocks2 {
    static {
        System.out.println("Im in Static Block 1");         // Static Block
    }

    static {
        System.out.println("Im in Static Block 2");         // Static Block
    }

    {
        System.out.println("I'm in Instance Block 1");      // Instance block
    }

    StaticBlocks2() {
        System.out.println("In Constructor");               // Constructor
    }

    public static void main(String[] args) {
        StaticBlocks2 obj = new StaticBlocks2();
        System.out.println("--------------------------");
        StaticBlocks2 obj1 = new StaticBlocks2();
    }

}



/*

Execution Sequence ===>
StaticBlock1 class
Static Block1 -> Constructor -> Constructor -> Constructor

StaticBlock2 class
If we have instance block in the same class
Static Block -> Instance Block -> Constructor -> Instance -> Constructor -> Instance Constructor

 */
