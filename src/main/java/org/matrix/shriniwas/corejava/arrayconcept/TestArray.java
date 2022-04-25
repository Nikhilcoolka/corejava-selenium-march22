package org.matrix.shriniwas.corejava.arrayconcept;

public class TestArray {

    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 10; // 0th index
        arr[1] = 20; // 1st index
        arr[2] = 30; // 2nd index
        // arr[3] = 40;

        // Using for loop
        System.out.println("---- For Loop ----");
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
            // arr[0] -> 10
            // arr[1] -> 20
            // arr[2] -> 30
        }

        // Using for each loop
        System.out.println("---- For each Loop ----");
        for(int i : arr) {
            System.out.println(i);
        }

        String [] sArr = new String[2];
        sArr[0] = "Shri1";
        sArr[1] = "Shri2";

        for (String str : sArr) {
            System.out.println(str);
        }

        Employee [] empArr = new Employee[3];
        Employee e1 = new Employee("Shri1", 10);
        Employee e2 = new Employee("Shri2", 20);
        Employee e3 = new Employee("Shri3", 30);

        empArr[0] = e1;
        empArr[1] = e2;
        empArr[2] = e3;

        // Using For each loop
        for (Employee emp :  empArr) {
            System.out.println(emp.name + "---->" +emp.id);
        }

        // Using for loop
        for(int i = 0; i < 3; i++) {
            System.out.println(empArr[i].name + "--->" + empArr[i].id);
        }

        String [] strArr = {"Shri1", "Shri2"};

        // Using For each loop
        for (String st :  strArr) {
            System.out.println(st);
        }
    }
}
