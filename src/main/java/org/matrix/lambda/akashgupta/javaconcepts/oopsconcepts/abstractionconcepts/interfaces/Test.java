package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.abstractionconcepts.interfaces;

public class Test extends TestInterface implements Arithmetic {
    @Override
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.multiply(2, 4));
        System.out.println(obj.power(3, 4));
        System.out.println(obj.square(3));
        obj.add(90, 78);
    }
}
