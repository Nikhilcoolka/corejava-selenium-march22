package org.matrix.delta.laxmi.programpractice;

// Program to reverse the string.
public class Program1 {
    public static void main(String[] args) {
        String str = "Laxmi";
        //Using StringBuilder
        StringBuilder str1 = new StringBuilder(str);
        System.out.println(str1.reverse());

        //Using StringBuffer
        StringBuffer str2 = new StringBuffer(str);
        System.out.println(str2.reverse());

        //Using toCharArray method
        char[] strChar = str.toCharArray();
        for (int i = (str.length() - 1); i >= 0; i--) {
            System.out.println(strChar[i]);
        }
        //Using chaAt()function
        for (int a = (str.length() - 1); a >= 0; a--) {
            System.out.println(str.charAt(a));
        }

    }
}

