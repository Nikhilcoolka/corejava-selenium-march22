package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.abstractionconcepts.interfaces;

public abstract class TestInterface implements Arithmetic {
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int square(int a) {
        return a * a;
    }

    @Override
    public int power(int X, int n) {
        int result = X, temp;
        if (n == 0)
            return 0;
        else if (n == 1)
            return X;
        else
            for (int i = 1; i < n; i++)
                result *= X;
        return result;
    }
}
