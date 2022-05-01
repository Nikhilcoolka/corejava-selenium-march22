package org.matrix.omega.neha.corejava.javaprograms;

//Program  to check String Anagrams

import java.util.Arrays;
import java.util.Locale;

public class Program6 {

    public static void main(String[] args) {

    String str1 = "Ganesh".replaceAll("\\s", " ");
        System.out.println(str1);

    String str2 = "Nagesh".replaceAll("\\s", " ");
        System.out.println(str2);

    boolean flag = true;
    if(str1.length() != str2.length()){
        flag = false;
    }
    else{
        char ch1[] = str1.toLowerCase().toCharArray();
        char ch2[] = str2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        flag = Arrays.equals(ch1,ch2);
    }
    if(flag == true){
        System.out.println("Strings are Anagram");
    }
    else{
        System.out.println("Strings are not Anagrams");
    }
    }
}
