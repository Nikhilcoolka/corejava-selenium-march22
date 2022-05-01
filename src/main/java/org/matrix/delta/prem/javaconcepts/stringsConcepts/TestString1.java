package org.matrix.delta.prem.javaconcepts.stringsConcepts;

public class TestString1 {
   
    public static void main(String[] args) {
        String str1 = new String("Prem");
        String str2 = new String("Prem");

        System.out.println("Address of str1 ="+System.identityHashCode(str1));   //to get memory location od str1
        System.out.println("Address of str2 ="+System.identityHashCode(str2));   //to get memory location od str2

        String str3="Prem";
        String str4="Prem";

        System.out.println("Address of str3 ="+System.identityHashCode(str3));  //to get memory location od str3
        System.out.println("Address of str4 ="+System.identityHashCode(str4));  //to get memory location od str4


        System.out.println(str1 == str2); //False will do reference/Address comparison
        System.out.println(str3 == str4); //True will do reference/Address comparison

        System.out.println("----------------------");

        System.out.println(str1.equals(str2));  //True will do content comparison
        System.out.println(str3.equals(str4));  //True will do content comparison
    }
}
