package org.matrix.lambda.nisha.stringsconcept;

import java.lang.String;
import java.lang.System;

public class TestString1 {

    public static void main(String[] args) {

        // Returns different HashCode for same filename
        String str1 = new String("Vijayalaxmi");     // Hashcode = 1118140819
        String str2 = new String("Vijayalaxmi");     // Hashcode = 1975012498

        String str3 = "Singam";          // Hashcode = 1808253012
        String str4 = "Singam";          // Hashcode = 1808253012

        // "==" checks the references ie hashcodes
        System.out.println(str1 == str2);           // Hashcode is different = False
        System.out.println(str3 == str4);           // Hashcode is same = True

        System.out.println("-------------------------------");

        // Returns the HashCode
        int returnValue1 = System.identityHashCode(str1);
        System.out.println(returnValue1);

        int returnValue2 = System.identityHashCode(str2);
        System.out.println(returnValue2);

        int returnValue3 = System.identityHashCode(str3);
        System.out.println(returnValue3);

        int returnValue4 = System.identityHashCode(str4);
        System.out.println(returnValue4);

        System.out.println("-----------------------------------");

        // equals check the value of objects
        System.out.println(str1.equals(str2));      // Vijayalaxmi = Vijayalaxmi
        System.out.println(str3.equals(str4));      // Singam = Singam


    }
}
