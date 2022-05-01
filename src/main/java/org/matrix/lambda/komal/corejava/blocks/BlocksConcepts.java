package org.matrix.lambda.komal.corejava.blocks;

// instance block
public class BlocksConcepts {
    {
        System.out.println("in instance block 1"); // instance block (logic)common for all objects
        // ex. database connection or common assign value for all objects
    }

    public BlocksConcepts() {
        System.out.println("in constructor");  // constructor logic are for tht constructor only
    }

    {
        System.out.println("in instance block 2");
    }

    public static void main(String[] args) {
        new BlocksConcepts(); //it's obj of      // first it'll show instance blocks in sequence then constructor
        //BlocksConcepts obj = new BlocksConcepts();    // it'll go to instance blocks for every object
        //BlocksConcepts obj1 = new BlocksConcepts();    // it'll go to blocks also but static block is execute one time
    }
}
