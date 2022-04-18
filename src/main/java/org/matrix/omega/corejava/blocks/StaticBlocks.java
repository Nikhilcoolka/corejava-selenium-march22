package org.matrix.omega.corejava.blocks;

import java.io.File;

public class StaticBlocks {

    static int i;

    static {
        i = 10;
       // read file from c drive

        File f = new File("test.txt");
        // Database connectivity
        // Excel File reading
        // To initialize the browser

        System.out.println("In static block - 1");
    }

    static {
        System.out.println("In static block - 2");
    }

    StaticBlocks() {
        System.out.println("In Constructor");
    }

    public static void main(String[] args) {
        new StaticBlocks();
        new StaticBlocks();
        new StaticBlocks();
    }
}
