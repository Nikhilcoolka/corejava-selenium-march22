package org.matrix.omega.samir;

import java.util.Scanner;

public class InstanceVariables {
    int salary = 5000; // instance variable
    String companyName = "ABC"; // Static Variable

    void checkEvenOrOdd(int num) { //non static method
        if (num % 2 == 0) {
            System.out.println("Given Number" + num + "is Even  Number");
        } else {
            System.out.println("Given Number" + num + "is Odd  Number");
        }
    }

    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables();
        System.out.println("SALARY IS " + obj.salary);//calling using object
        //System.out.println("Company Name is " + companyName);//direct calling because it is a static variable
        System.out.println("Enter the value of num");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        obj.checkEvenOrOdd(num);//calling using object


    }
}
