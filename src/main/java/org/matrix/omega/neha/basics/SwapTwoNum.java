package org.matrix.omega.neha.basics;

public class SwapTwoNum {
    public static void main(String[] args) {
        int first = 20;
        int second = 50;
        System.out.println("Before swap");
        System.out.println("The first number is: " + first);
        System.out.println("The second number is: " + second);
        int temporary = first;     // First value stored in temporary.
        first = second;            // Second value stored in first.
        second = temporary;        // Temporary value stored in second.
        System.out.println(" After swap");
        System.out.println("The first number is: " + first);
        System.out.println("The second number is: " + second);
    }
}
