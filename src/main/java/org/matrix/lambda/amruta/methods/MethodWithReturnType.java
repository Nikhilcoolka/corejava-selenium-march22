package org.matrix.lambda.amruta.methods;

public class MethodWithReturnType{

    public int addition(int a,int b){
        int c = a+b;
        return c;
    }

    public int multiplication(int a,int b){
        int c=a*b;
        return c;
    }

    public static void main(String[] args) {
        MethodWithReturnType obj = new MethodWithReturnType();
        int add = obj.addition(10, 20);
        int multi=obj.multiplication(10,15);
        System.out.println(add);
        System.out.println(multi);

    }
    }

