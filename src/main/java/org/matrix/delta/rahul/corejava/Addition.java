package org.matrix.delta.rahul.corejava;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int numberFirst, numberSecond;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First Number");
        numberFirst = s.nextInt();
        System.out.println("Enter the Second Number");
        numberSecond = s.nextInt();
        int sum = numberFirst + numberSecond;
        System.out.println("Addition " + sum);

    }
}
