package org.matrix.omega.corejava.stringsconcept;

public class TestString1 {

    public static void main(String[] args) {
        String str1 = new String("Shriniwas"); //a1234
        String str2 = new String("Shriniwas"); //a4567

        String str3 = "Shri"; // b789
        String str4 = "Shri"; // b789

        System.out.println(str1 == str2); // false : Will do the reference comparison
        System.out.println(str3 == str4); // true  : Will do the reference comparison

        System.out.println("----------------------------------");

        System.out.println(str1.equals(str2)); // true : Will do the content comparison
        System.out.println(str3.equals(str4)); // true : Will do the content comparison
    }
}
