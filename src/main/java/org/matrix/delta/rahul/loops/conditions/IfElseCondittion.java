package org.matrix.delta.rahul.loops.conditions;

import java.util.Scanner;

public class IfElseCondittion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter the number to check the weather number is even or odd");
        num = s.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is even ");
        } else {
            System.out.println("Number is Odd");
        }
    }


}
