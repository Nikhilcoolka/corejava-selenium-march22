package org.matrix.sigma.niksangli.corejava.javaprogram;

public class ReverseString {

    public static void main(String[] args) {
        String s1="Nikhil";
        System.out.println("toCharArray************************");
        char [] s2=s1.toCharArray();   /// it is string fuction i.e string to array
        System.out.println(s2.length);
        for(int i=s2.length-1;i>=0;i--)
        {
          System.out.print(s2[i]);

        }

        System.out.println("Char At function************************");

        for(int i=s1.length()-1;i>=0;i--)
        {
            System.out.print(s1.charAt(i));  // char at is string function
        }

        System.out.println("********** reverse using split function************************");

        String s3="I_am_Nikhil_kulkarni";
        System.out.println(s3.length());
        String [] s4=s3.split("_");   /// string array
        System.out.println(s4.length);
        for(int i=s4.length-1;i>=0;i--)
        {
            System.out.print(s4[i]);
        }


    }
}
