package org.matrix.delta.monika.program;

import org.matrix.delta.monika.import1.HelloWorld;

public class importHello {
    public void getData() {
        System.out.println(HelloWorld.studId);
        System.out.println(HelloWorld.str);
    }

    public static void main(String[] args) {
        importHello imp = new importHello();
        imp.getData();
    }
}
