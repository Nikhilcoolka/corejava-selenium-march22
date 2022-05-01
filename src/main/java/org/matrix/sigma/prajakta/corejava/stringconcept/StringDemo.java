package org.matrix.sigma.prajakta.corejava.stringconcept;

public class StringDemo {

    public static void main(String[] args) {

        /*
           String is immutable class i.e. value does not change.
           String object are created in 2 ways:
             1. By object cration.
             2. String literals.
         */

        // 1. By object creation
        String str1=new String("Prajakta");
        String str2=new String("Deshpande");

        // 2. String literals
        String str3="pallavi";
        String str4="kulkarni";

        String str6=str3.concat(str4); // String class in immutable
        System.out.println(str6);

        StringBuffer sb1=new StringBuffer("Abcd");
        sb1.append("efgh");     //StringBuffer is mutable class.

    }
}
