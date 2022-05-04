package org.matrix.sigma.kadambari.javaprogram;

public class FourProgram {
    public static void main(String[] args) {
        //String SCP Immutable
        String str1 = "Shravi";
        str1 = str1.concat("Kadambari");
        System.out.println(str1);
        System.out.println("--------------------");
        //String object Immutable
        String str2 = new String("Welcome");
        str2 = str2.concat("Everyone");
        System.out.println(str2);
        System.out.println("--------------------");
        //StringBuffer Mutable
        StringBuffer str3 = new StringBuffer("Shravi");
        str3 = str3.append("Belavate");
        System.out.println(str3);
        System.out.println("----------------------");
        //StringBuilder Mutable
        String str4 = String.valueOf(new StringBuilder("Shravi"));
        str4 = str4.concat("kadambari");

        System.out.println(str4);
    }
}
