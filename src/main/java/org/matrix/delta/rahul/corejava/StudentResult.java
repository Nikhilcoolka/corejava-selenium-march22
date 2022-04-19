package org.matrix.delta.rahul.corejava;

import java.util.Scanner;

public class StudentResult {
    int marathi, english, physics, chemistry, mathematics, biology, total;
    float per;
    Scanner s = new Scanner(System.in);

    public void examMarks() {
        System.out.println("Enter the Marathi Marks");
        marathi = s.nextInt();
        System.out.println("Enter the english Marks");
        english = s.nextInt();
        System.out.println("Enter the physics Marks");
        physics = s.nextInt();
        System.out.println("Enter the chemistry Marks");
        chemistry = s.nextInt();
        System.out.println("Enter the mathematics Marks");
        mathematics = s.nextInt();
        System.out.println("Enter the biology Marks");
        biology = s.nextInt();
    }

    public void result() {
        total = marathi + english + physics + chemistry + mathematics + biology;
        //System.out.println("Total Marks is"+total);
        per = (total * 100 / 600);
        //System.out.println("My per is "+per);
        System.out.println("**********************************************************");
        if (per > 60) {
            System.out.println("Total_Marks " + total + " Percentage " + per + "% Grade A");
        } else if (per > 50) {
            System.out.println("Total_Marks " + total + " Percentage " + per + "% Grade B");
        } else if (per > 40) {
            System.out.println("Total_Marks " + total + " Percentage " + per + "% Grade C");
        } else {
            System.out.println("Total_Marks " + total + " Percentage " + per + "% Grade D");
        }
    }

    public static void main(String[] args) {
        StudentResult sr = new StudentResult();
        sr.examMarks();
        sr.result();
    }
}
