package org.matrix.sigma.kadambari.javaprogram;
//Program to reverse String in sentence
public class SecondProgram {

    public static void main(String[] args) {
        String str = new String ("My name is Kadmabari Belavate");
        String [] strA = str.split("");
        for (int i=strA.length-1; i>=0;i--){
            System.out.println(strA[i]);
        }
    }
}
