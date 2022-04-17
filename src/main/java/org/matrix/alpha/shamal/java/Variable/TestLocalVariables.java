package org.matrix.alpha.shamal.java.Variable;

public class TestLocalVariables {

    // This is the constructor
    TestLocalVariables() {
        int i = 10;  // local variable
        System.out.println(i);
    }

    public void loacalVariable() {
        int age = 25;
        System.out.println(age);

    }

    public void test(int age) {
        age = 20;
        System.out.println(age);

    }

    public static void main(String[] args) {

        TestLocalVariables obj = new TestLocalVariables();
        obj.test(0);
        obj.loacalVariable();
        String s = "Local variable";
        System.out.println(s);  // local variable

    }


}
