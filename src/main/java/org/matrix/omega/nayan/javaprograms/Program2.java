package org.matrix.omega.nayan.javaprograms;

public class Program2 {


    public static void main(String[] args) {
        String str="My Name is Nayan";

        String[] strA=str.split(" ");

        System.out.println("Given String :" +str);

        System.out.println("Reverse String :");

        System.out.println("Value :" +strA[3]);

        for(int i=strA.length-1;i>=0;i--) {
            System.out.print(strA[i]);
        }
    }
}
