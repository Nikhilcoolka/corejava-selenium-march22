package org.matrix.lambda.amruta.methods;

public class TestMethods {
    int a=100;
    int b=200;

    public void addition(int a,int b){
        System.out.println(this.a+this.b);
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        TestMethods obj=new TestMethods();
        obj.addition(5,10);
    }

}
