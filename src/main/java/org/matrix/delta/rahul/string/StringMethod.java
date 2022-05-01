package org.matrix.delta.rahul.string;


public class StringMethod {
    public static void main(String[] args) {
        String name="Shendage";
        //          [01234567]
        System.out.println("Length  of string is "+name.length());// int
        System.out.println("String in lowercase "+name.toLowerCase());//String
        System.out.println("String in upppercase "+name.toUpperCase());//String

        String str="Rahul";
        System.out.println("Concat the two string "+name.concat(" "+str)); //String
        System.out.println(" To replace the characters in String "+name.replace("h","S"));//String
        System.out.println(" To replace the substring in String "+name.replaceAll("Shen","Rah"));//String
        System.out.println("Returning the substring of string "+name.substring(5));//String

        String str2="   Pune   ";
        System.out.println(""+str2.trim());//String -to remove the leading & trailing white spaces are removed.
        System.out.println(""+name.charAt(5));//char - it gives index char of specified string.

        String str3="AB";//Ascii Code
        String str4="AB";//Ascii code
        System.out.println("compare  the Two string "+str3.compareTo(str4));//int this method compare the two string
        System.out.println("contain "+name.contains("S"));//boolean if any char fount the result is true otherwise false

        String city="Mumbai";
        String city2="Mumbai";
        String city3="mumbai";
        System.out.println("equals "+city.equals(city2));
        System.out.println("equalsIgnoreCase"+city.equalsIgnoreCase(city3));

        String homeMaterial="CeiligFan";
                          //[012345678]
        System.out.println("substring "+homeMaterial.substring(2,5));
        System.out.println("substring "+homeMaterial.substring(2,4));

        String tab="Glocozon";
        System.out.println("indexOf "+tab.indexOf('o'));//int it find the postion of d from right side
        System.out.println(tab.lastIndexOf("o"));//int

        String cricke="MahendrasingDhoni";
        System.out.println("startsWith "+cricke.startsWith("Mah"));//boolean
        System.out.println("endsWith"+cricke.endsWith("Dhoni"));

        String bike="";
        System.out.println("isEmpty "+bike.isEmpty());

        char []arr=name.toCharArray();





    }

}
/*
in Substring the index of string start from 0 not 1;

 */