package org.matrix.delta.laxmi;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = obj.nextInt();
        if (a % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
