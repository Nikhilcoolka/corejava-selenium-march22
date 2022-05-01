package org.matrix.omega.samir;

import java.util.*;

public class Calculations {

    void addition(int i, int y) {

        int z = i + y;
        System.out.println("Addition of two number " + z);
    }

    void subtraction(int i, int y) {
        int z = i - y;
        System.out.println("Subtraction of two numbers " + z);
    }

    public static void main(String[] args) {

        Calculations cal = new Calculations();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x and y");
        int i = sc.nextInt();
        int y = sc.nextInt();
        cal.addition(i, y);
        cal.subtraction(i, y);


    }
}

