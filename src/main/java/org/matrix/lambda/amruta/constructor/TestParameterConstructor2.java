package org.matrix.lambda.amruta.constructor;

public class TestParameterConstructor2 {

    String companyname;

    private TestParameterConstructor2(String name){//this is parameter constructor
        System.out.println("The company name is:"+name);
    }

    public static void main(String[] args) {
        TestParameterConstructor2 obj=new TestParameterConstructor2("TCS");
    }
}
