package org.matrix.shriniwas.corejava.stringsconcept;

public class TestString2 {

    public static void main(String[] args) {
        String str1 = new String("Shriniwas");  // Address: 1163157884
        String str2 = new String("Shriniwas");  // Address: 1956725890
        System.out.println("Address of str1: " +System.identityHashCode(str1)); // to get the memory address location of str1
        System.out.println("Address of str2: " +System.identityHashCode(str2)); // to get the memory address location of str2

        String str3 = "Shri"; // Address: 1956725890
        String str4 = "Shri"; // Address: 1956725890
        System.out.println("Address of str3: " +System.identityHashCode(str3)); // to get the memory address location of str3
        System.out.println("Address of str4: " +System.identityHashCode(str4)); // to get the memory address location of str4

        System.out.println(str1 == str2); // false : Will do the reference comparison
        System.out.println(str3 == str4); // true  : Will do the reference comparison

        System.out.println("----------------------------------");

        System.out.println(str1.equals(str2)); // true : Will do the content comparison
        System.out.println(str3.equals(str4)); // true : Will do the content comparison*/
    }

}
