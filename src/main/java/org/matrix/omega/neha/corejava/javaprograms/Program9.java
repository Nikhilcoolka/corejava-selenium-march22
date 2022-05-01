package org.matrix.omega.neha.corejava.javaprograms;

//Proram to find each character/ find duplicate/ repeated characters in strings.

import java.util.HashMap;
import java.util.Locale;

public class Program9 {

    public static void main(String[] args) {
        String str = "Shriniwas Alle is my name".toLowerCase();

        //Create Hashmap containing char as a key and occurrences as value.
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        //converting given string to char array.
        char[] chArr = str.toCharArray();

        //Checking each character of stringarray.
        for(char ch : chArr){
            if(charCountMap.containsKey(ch)){

                // if char is present is in charCountMap, incrementing its by 1.
                charCountMap.put(ch, charCountMap.get(ch) + 1);

            }
            else {

                // If char is not present in charCountMap , putting this value to  char to charCountMap with 1 as its value.
                charCountMap.put(ch,1);
            }
        }
        System.out.println(charCountMap);

    }
}
