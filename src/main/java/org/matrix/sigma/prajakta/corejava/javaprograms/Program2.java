package org.matrix.sigma.prajakta.corejava.javaprograms;

public class Program2 {

    public static void main(String[] args) {

        //Program :: to reverse strings in sentence

        String str = new String("Prajakta Ashok Deshpande"); //String object
        String[] arr = str.split(" ");                       //String array

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
