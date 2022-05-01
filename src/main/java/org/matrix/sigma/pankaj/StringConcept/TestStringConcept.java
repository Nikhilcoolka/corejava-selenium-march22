package org.matrix.sigma.pankaj.StringConcept;

public class TestStringConcept {

    public static void main(String[] args) {
        String str1 = new String("pankaj");
        String str2 = new String("pankaj");


        System.out.println("Address os str1 :" +System.identityHashCode(str1));
        System.out.println("Address os str2 :" +System.identityHashCode(str2));


        String str3 = "pank";
        String str4 = "pank";
        String str5 = "kurhade";
        String str6 = "kurhade";

        System.out.println("Address os str3 :" +System.identityHashCode(str3));
        System.out.println("Address os str4 :" +System.identityHashCode(str4));


        System.out.println(str1 == str2); //with the help of this we will get reference comparison
        System.out.println(str3 == str4);//with the help of this we will get reference comparison

        System.out.println(str1.equals(str2));//with the help of this we will get content comparison
        System.out.println(str3.equals(str4));//with the help of this we will get content comparison
        System.out.println(str5.equals(str6));
    }
}
