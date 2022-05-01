package org.matrix.omega.samir;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter the choice \n1. Addition\n 2. subtraction");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Addition is" + "" + (n + m));

            case 2:

                System.out.println("subtraction is" + "" + (n - m));


        }
    }
}