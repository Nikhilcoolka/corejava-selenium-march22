package org.matrix.omega.samir;

import java.util.Scanner;

class HelloWorld {

    void employeeDetails() {
        int empNumber = 1, empsalary = 5000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int no = sc.nextInt();
        System.out.println("hii");
        String empName = "samir", empLocation = "pune";
        System.out.println("Your entered Number " + no + "empNumber=" + empNumber + " empsalary =   " + empsalary + " empName = " + empName + " empLocation= " + empLocation + "  " + empName.charAt(2) + " empName Lenght = " + empName.length());
    }

    public static void main(String[] args) {
        HelloWorld HelloWorld1 = new HelloWorld();
        HelloWorld1.employeeDetails();
        for (int i = 0; i < 3; i++) {


            System.out.println("You Are Right");
        }

    }
}
