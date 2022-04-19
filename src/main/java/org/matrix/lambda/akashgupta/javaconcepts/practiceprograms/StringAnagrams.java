package org.matrix.lambda.akashgupta.javaconcepts.practiceprograms;

import java.util.Arrays;

//two strings are called anagrams when they contain same set of characters but in different order
public class StringAnagrams {
    public static void main(String[] args) {
        String str1 = "Nagesh".replaceAll("\\s", "");
        String str2 = "Ganash".replaceAll("\\s", "");
        //System.out.println(str1);
        boolean flag = str1.length() == str2.length();
        if (flag) {
            char[] c1 = str1.toLowerCase().toCharArray();
            char[] c2 = str2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if (Arrays.equals(c1, c2)) System.out.println("Two string are anagrams");
            else System.out.println("Two strings are not anagrams");

        } else System.out.println("Two strings are not anagrams");


    }
}
