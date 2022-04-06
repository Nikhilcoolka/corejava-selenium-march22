package org.matrix.alpha.shamal.javaprograms;

public class Program4 {

    public static void main(String[] args) {

        // String SCP Immutable
        String str1 = "Shrenee";
        str1.concat("Matale");
        System.out.println(str1);

        // String object Immutable
        String str4 = new String("Hello");
        str4.concat("World");
        System.out.println(str4);

        // StringBuffer Mutable
        StringBuffer str2 = new StringBuffer("Shamal");
        str2.append("Jadhav");
        System.out.println(str2);

        // StringBuilder Mutable
        StringBuilder str3 = new StringBuilder("Shamal");
        str3.append("Matale");
        System.out.println(str3);
    }
}