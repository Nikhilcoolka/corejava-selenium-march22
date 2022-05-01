package org.matrix.delta.laxmi;

public class StaticBlockTest {
    static {
        System.out.println("This is static block(static keyword is used while declaring this block)-executes once .class file is loaded");
    }

    static {
        System.out.println("This is static block2");
    }

    public static void main(String[] args) {
        //  new StaticBlockTest();
        System.out.println("-----------------------");
        //new StaticBlockTest();
    }
}
