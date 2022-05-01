package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.abstractionconcepts.abstraction;

public class TestAbstract extends AbstractChild {

    @Override
    protected void addChild(int a, int b) {
        result = a + b;

    }

    @Override
    public int result() {
        return result;
    }

    public static void main(String[] args) {
        TestAbstract obj = new TestAbstract();
        obj.addChild(10, 89);
        System.out.println(obj.result());
        obj.addParent(90, 1);
        System.out.println(obj.result());
        obj.multiply(5, 4);
        System.out.println(obj.result());
    }
}
