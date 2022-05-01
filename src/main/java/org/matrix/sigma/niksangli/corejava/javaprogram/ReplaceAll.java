package org.matrix.sigma.niksangli.corejava.javaprogram;

public class ReplaceAll {
    public static void main(String[] args) {
        String s1="Hello world";
        //String s2=s1.replace('o','p');  //Hellp wprld
        String s2=s1.substring(0,7 ) + 'p'+ s1.substring(7 + 1);
        System.out.println(s2);

        //String s4=s3[0].replace('o','t');
      //  System.out.println(s4);




    }
}
