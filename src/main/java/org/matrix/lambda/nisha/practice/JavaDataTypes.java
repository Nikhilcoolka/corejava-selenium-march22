package org.matrix.lambda.nisha.practice;

public class JavaDataTypes {

    public static void main(String[] args) {

        byte num1 = 100;
        System.out.println(num1);
        System.out.println("byte size = 1 byte");
        System.out.println("Stores whole numbers from -128 to 127");
        System.out.println("--------------------------------------------------");

        short num2 = 5000;
        System.out.println(num2);
        System.out.println("short size = 2 byte");
        System.out.println("Stores whole numbers from -32,768 to 32,767");
        System.out.println("--------------------------------------------------");

        int num3 = 700000;
        System.out.println(num3);
        System.out.println("int size = 4 byte");
        System.out.println("Stores whole numbers from -2,147,483,648 to 2,147,483,647\n");
        System.out.println("--------------------------------------------------");

        long num4 = 54000000L;
        System.out.println(num4);
        System.out.println("long size = 8 byte");
        System.out.println("Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        System.out.println("--------------------------------------------------");

        float num5 = 15.6f;
        System.out.println(num5);
        System.out.println("float size = 4 byte");
        System.out.println("Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits");
        System.out.println("--------------------------------------------------");

        double num6 = 66.87d;
        System.out.println(num6);
        System.out.println("double size = 8 byte");
        System.out.println("Stores fractional numbers. Sufficient for storing 15 decimal digits");
        System.out.println("--------------------------------------------------");


        boolean isJavafun = true;
        System.out.println(isJavafun);
        System.out.println("boolean size = 1 bit");
        System.out.println("Stores true or false values");
        System.out.println("--------------------------------------------------");

        char name = 'N';
        System.out.println(name);
        System.out.println("char size = 2 byte");
        System.out.println("Stores a single character/letter or ASCII values");


    }
}
