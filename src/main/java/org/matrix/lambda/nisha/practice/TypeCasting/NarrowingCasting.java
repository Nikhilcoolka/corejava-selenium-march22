package org.matrix.lambda.nisha.practice.TypeCasting;

public class NarrowingCasting {

    // converting a larger type to a smaller size type

    public static void main(String[] args) {

        float myFloat = 2445.57f;
        int i = (int) myFloat;
        System.out.println(i);


        double n = 14.54d;
        short s = (short) n;
        System.out.println(s);
        }
    }
