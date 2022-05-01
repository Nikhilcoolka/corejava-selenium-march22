package org.matrix.omega.samir.practice;

import java.util.Scanner;

public class Manager extends Employee {
    int salary;
    void accept(){
        Scanner sc=new Scanner(System.in);
        super.accept();
        System.out.println("Enter the salary");
        salary=sc.nextInt();
    }
    void display(){
        super.display();
        System.out.println("salary ="+ salary );
    }
}
