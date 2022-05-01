package org.matrix.lambda.nisha.practice.TypeCasting;

public class WideningCasting {

    //Widening casting is done automatically when passing a smaller size type to a larger size type

    public static void main(String[] args) {

        short myShort = 1234;
        //double myDouble = myShort;

        System.out.println((double)(myShort));

    }

}
