package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.abstractionconcepts.abstraction;

public abstract class AbstractParent {
    //abstract int sum;  // you cannot abstract data variables
    public static int result;

    public abstract int result();

    protected abstract int addParent(int a, int b);

    public int multiply(int a, int b) {
        return result = a * b;
    }
}
