package org.matrix.sigma.prajakta.corejava.array;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        //Iterate array using for loop
        for (int i = 0; i < 3; i++) {
            System.out.println("Integer array :: " + i);
        }

        String[] strArr = new String[4];
        strArr[0] = "Prajakta";
        strArr[1] = "Sayalee";
        strArr[2] = "Pallavi";
        strArr[3] = "Anu";

        //Iterate array using for each loop
        for (String str : strArr) {
            System.out.println("String array :: " + str);
        }

        Employee[] emp = new Employee[3];
        Employee e1 = new Employee(1, "Sayalee");
        Employee e2 = new Employee(2, "Prajakta");
        Employee e3 = new Employee(3, "Pallavi");

        emp[0] = e1;
        emp[1] = e2;
        emp[2] = e3;

        for (Employee obj : emp) {
            System.out.println("Employee array :: " + obj.id + " " + obj.name);
        }

        for (int j = 0; j < 3; j++) {
            System.out.println("Employee array using for loop :: " + emp[j].id + " " + emp[j].name);
        }

    }
}


