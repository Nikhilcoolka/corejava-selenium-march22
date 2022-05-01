package org.matrix.omega.samir;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[][] a = new int[10][10];
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 10 values");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }*/
        for (int i = 0; i < 4; i++) {
            System.out.print("2");
            for (int j = 0; j < i; j++) {
                System.out.print("2");

            }
            System.out.println("\n");
            //System.out.println("The value present at   " + i + "  is  " + a[i]);
        }
    }
}
