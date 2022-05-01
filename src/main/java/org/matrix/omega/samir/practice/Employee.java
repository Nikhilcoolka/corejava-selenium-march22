package org.matrix.omega.samir.practice;

import java.util.Scanner;

public class Employee {
    int id;
    String name;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id and name");
        id = sc.nextInt();
        name = sc.next();
    }
    void display(){
        System.out.println("ID ="+id + " Name ="+ name);
    }
}
