package org.matrix.omega.nayan.javaprograms;


// Program to reverse the given String

public class Program1 {

    public static void main(String[] args) {
        String str = "Shriniwas";
        StringBuilder str1 = new StringBuilder(str);
        System.out.println(str1.reverse());
        System.out.println("===============================================");

        String str2 = "nayan";
        StringBuffer str3 = new StringBuffer(str2);
        System.out.println(str3.reverse());

        String str4 = "raviraj";
        char[] strChat = str4.toCharArray();
        for (int i = (str4.length() - 1); i >= 0; i--) {
            System.out.print(strChat[i]); // using charArray
        }

        for (int i = (str4.length() - 1); i >= 0; i--) {

            System.out.print(str4.charAt(i));
        }


    }








}
