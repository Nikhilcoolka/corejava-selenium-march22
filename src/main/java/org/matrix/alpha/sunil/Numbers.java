package org.matrix.alpha.sunil;

import java.util.Scanner;

public class Numbers {


    public static void main(String[] args) {
        int number;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number");
        number = s.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else System.out.println("Number is Odd");
    }
}

