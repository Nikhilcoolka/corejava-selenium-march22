package org.matrix.omega.samir.practice;

import java.util.Scanner;

public class DynamicBinding extends Manager {
    public static void main(String[] args) {
        String str = "Employee";
        Scanner sc = new Scanner(System.in);
        Employee[] ref = new Employee[5];
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter choice  1.Employee  2. Manager");
            int choice = sc.nextInt();
            if (choice == 1) {
                ref[i] = new Employee();
            } else {
                ref[i] = new Manager();
            }
            ref[i].accept();
        }
        System.out.println("The Entered Objects Are");
        for (int i = 0; i < 2; i++) {
            if (ref[i].getClass().getName().equals(str))
                System.out.println("Employee detail-------------");
            else
                System.out.println("Manager Details------------------");
            ref[i].display();
        }
    }
}
