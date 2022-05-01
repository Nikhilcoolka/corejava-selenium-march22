package org.matrix.lambda.akasht.corejava;

import org.matrix.shriniwas.corejava.methods.TestMethodsConceptNew;

public class LocalVariables {
    int a = 100;
    int b = 200;

    public void add(int a, int b) {
        System.out.println(this.a + this.b);
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        TestMethodsConceptNew obj = new TestMethodsConceptNew();
        obj.add(10, 20);
    }
}
