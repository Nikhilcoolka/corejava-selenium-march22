package org.matrix.omega.neha.javaprograms;

//Program to reverse strings in sentence.
public class Program2 {
    public static void main(String[] args) {

        String str = new String("My name is Neha konda");

        String[] strA = str.split("");

        for (int i = strA.length - 1; i >= 0; i--) {
            System.out.println(strA[i]);
        }
    }
}