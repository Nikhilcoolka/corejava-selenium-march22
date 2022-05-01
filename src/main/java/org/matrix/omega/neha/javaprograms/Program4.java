package org.matrix.omega.neha.javaprograms;

//Programs for String are immutable
public class Program4 {
    public static void main(String[] args) {

        //String SCP immutable
        String str1 = "Shri";
        str1 = str1.concat("Alle");
        System.out.println(str1);

        //String Object Immutable
        String str2 = new String("Hello");
        str2 = str2.concat("World");
        System.out.println(str2);

        //StringBuffer Mutable
        StringBuffer str3 = new StringBuffer("Madhu");
        str3.append("shri");
        System.out.println(str3);

        // StringBuilder Mutable
        StringBuilder str4 = new StringBuilder("Madhushri");
        str4.append("Konda");
        System.out.println(str4);
    }
}
