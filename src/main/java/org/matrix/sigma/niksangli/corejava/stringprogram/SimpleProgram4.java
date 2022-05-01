package org.matrix.sigma.niksangli.corejava.stringprogram;


public class SimpleProgram4 {

    public static void main(String[] args) {
        String s1 = "Nikhil";

        char[] a1 = s1.toCharArray();       // string to tochararray

        for (int i = 0; i < a1.length; i++)  // to print array
        {
            System.out.println(a1[i]);
        }

        String s2 = "nikhilCoolkarni";
        String[] a2 = s2.split("");
        System.out.println("String Array length is " + a2.length);
        System.out.println("using for loop");

        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }

        System.out.println("----- Using For each loop -----");

        for (String s3 : a2)   /// string to array
        {
            System.out.println(s3);
        }

        System.out.println("----- Using For each loop for Character array  to String-----");
        char[] ch = {'N', 'i', 'k', 'h', 'i', 'l'};
       // String s5=String.copyValueOf(ch);
       // String s6;
        //System.out.println(s5);
        //System.out.println(ch.toString());
        for(char d1:ch)  // for (datatype var : arrayname)
        {
            System.out.print(d1);

        }
        System.out.println("----- Using valueoff  String-----");

        String s7=String.valueOf(ch);
        System.out.println(s7);









    }


}
