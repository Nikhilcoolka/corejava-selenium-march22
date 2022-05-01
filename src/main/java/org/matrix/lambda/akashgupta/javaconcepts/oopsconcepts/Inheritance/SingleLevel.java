package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.Inheritance;

import org.matrix.lambda.akashgupta.javaconcepts.corejava.classes.Employee;

import java.util.Scanner;

public class SingleLevel extends Employee {       // child_class extends parent_class

    static Employee[] employees = new Employee[3];    //array of Employee-class object

    public void empEntry() {
        company = "MicroSoft";                          //direct access to static variable of parent in child
        for (int i = 0; i <= 2; i++) {

            employees[i] = createEmpObject();      // parent class static method (employees[] is an object of p-class)
            System.out.println("Enter Emp Data:");
            Scanner scan = new Scanner(System.in);
            System.out.println("Name:");
            employees[i].empName = scan.nextLine();   //parent class instance (like obj.empName)
            System.out.println("EmpId:");
            employees[i].empId = scan.nextInt();
        }
    }

    public void displayList() {
        for (int i = 0; i <= 2; i++) {
            employees[i].getData();       // parent class method
        }
    }

}
