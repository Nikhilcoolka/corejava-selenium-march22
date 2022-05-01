package org.matrix.delta.rahul.interviewexample;

import java.util.Scanner;

public class Program21 {
    Scanner s=new Scanner(System.in);
    int f;int fc; int fact=1;
    public void factorialMethod() {
        System.out.println("Enter the Number for calculate the factorial");
        f=s.nextInt();
        for (fc=1;fc<=f;fc++) {
            fact=fact*fc;
        }
        System.out.println("Factorial is "+fact);
    }

    public static void main(String[] args) {
        Program21 obj=new Program21();
        obj.factorialMethod();

    }
}
