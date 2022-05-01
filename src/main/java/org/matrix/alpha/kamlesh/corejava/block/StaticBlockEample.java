package org.matrix.alpha.kamlesh.block;

import java.io.File;

public class StaticBlockEample {
    static int i;

    static {
        i=10; //read file from c drive
        System.out.println("Im static block" +i);
    }
    public StaticBlockEample() {
        System.out.println("Im constructor" +i);
    }
    public static void main(String[] args) {
        StaticBlockEample obj = new StaticBlockEample();
        StaticBlockEample obj2 = new StaticBlockEample();
    }
}
