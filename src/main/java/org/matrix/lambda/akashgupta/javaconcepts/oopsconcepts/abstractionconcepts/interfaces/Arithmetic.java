package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.abstractionconcepts.interfaces;

public interface Arithmetic {

    public static final int count = 1;  //redundant specifier jvm automatically assign it& variable must be assigned

    public abstract void add(int a, int b);   //redundant specifier jvm automatically assign it

    int multiply(int a, int b);

    int square(int a);

    int power(int X, int n);


}
