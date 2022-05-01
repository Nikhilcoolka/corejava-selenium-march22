package org.matrix.lambda.amruta.methods;

public class MethodReturnType {
    int square (int num){
        return num*num;

    }
    public static void main(String[] args) {
        MethodReturnType obj=new MethodReturnType();
        int SquareOfnos = obj.square(10);
        System.out.println("square of 10 is:" +SquareOfnos);
    }

}
