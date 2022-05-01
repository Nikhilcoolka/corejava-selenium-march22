package org.matrix.lambda.amruta.constructor;

public class TestParameterConstructor {
    String name;

    public TestParameterConstructor(String name){//Parameter constructor

        System.out.println("My name is:"+name);
    }

    public static void main(String[] args) {
        TestParameterConstructor obj=new TestParameterConstructor("Amu");
    }

}
