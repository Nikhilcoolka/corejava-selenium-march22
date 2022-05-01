package org.matrix.delta.laxmi.programpractice;

//Reverse string in sentence
public class Program2 {
    public static void main(String[] args) {
        String str = "My name is Laxmi";
        String[] strA = str.split(" ");
        for (int i = strA.length - 1; i >= 0; i--) {
            System.out.println(strA[i]);
        }
    }
}
