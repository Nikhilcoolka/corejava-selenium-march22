package org.matrix.lambda.komal.corejava.blocks;

// static block
public class BlocksConcepts1 {
    static int i;
    static{
        i=10;
        //read file from c drive or for database connectivity or exel reading, load text ,to initialize browser
        System.out.println("in static block");
    }
    static{
        System.out.println("in static block 2");
    }
    BlocksConcepts1(){
        System.out.println("in constructor");
    }

    public static void main(String[] args) {
        new BlocksConcepts1();      // it'll show static block once only for all objects
        new BlocksConcepts1();     // it'll not show static block coz already shown in previous obj
        new BlocksConcepts1();    // but constructor will execute every time i.e. 3 times
    }
}
