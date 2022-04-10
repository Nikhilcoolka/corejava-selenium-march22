package org.matrix.lambda.nisha.stringsconcept;

import java.lang.String;
import java.lang.System;

public class TestString2 {

    public static void main(String[] args) {

        String str1 = new String("Vijaylaxmi");     // Hashcode = 1118140819
        String str2 = new String("Vijaylaxmi");     // Hashcode = 1975012498
        System.out.println("Address of str1: " + System.identityHashCode(str1));
        System.out.println("Address of str2: " + System.identityHashCode(str2));

    }
}
