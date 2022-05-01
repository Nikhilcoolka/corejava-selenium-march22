package org.matrix.delta.monika.practice;

import java.util.Random;

public class Array {

    public static void main(String[] args) {
        int []array = new int[]{
                15,18,17,26,48,50,62,100,102,114,119,1,9
        };
        Random r = new Random();
        int obj= r.nextInt(array.length);

        System.out.println(array[obj]);

    }

    }

