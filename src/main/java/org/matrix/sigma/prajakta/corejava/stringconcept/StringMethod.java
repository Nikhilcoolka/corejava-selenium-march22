package org.matrix.sigma.prajakta.corejava.stringconcept;

public class StringMethod {

    public static void main(String[] args) {

        //String functions
        String str1="Prajakta";
        String str2="   Deshpande  ";

        System.out.println("String length::"+str1.length());
        System.out.println("------------------------------");

        System.out.println("String To convert in lower case::"+str1.toLowerCase());
        System.out.println("==============================");

        System.out.println("String to convert in upper case::"+str1.toUpperCase());
        System.out.println("---------------------------------");

        System.out.println("String trim function::"+str2.trim());
        System.out.println("----------------------------------");

        String s1="Cognizant";
        String s2="Cognizant";
        String s3="COGNIZANT";
        System.out.println("String equals::"+s1.equals(s2)); // value comparison
        System.out.println("---------------------------------");
        System.out.println("String equalIgnoreCase::"+s1.equalsIgnoreCase(s3));
        System.out.println("====================================");

        System.out.println("To get memory location addrss::"+System.identityHashCode(s1));
        System.out.println("---------------------------------------");

        String str5="ram";
        String str7="ram";

        String str8=new String("ram");
        String str9=new String("ram");

        System.out.println(str5==str7);  // reference comparison
        System.out.println("-------------");
        System.out.println(str8==str9); //
        System.out.println("---------------");


    }
}
