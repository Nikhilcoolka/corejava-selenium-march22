package org.matrix.omega.neha.corejava.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

// Program to reverse the given string //
public class Program1 {
    public static void main(String[] args) {
        String str = "Shriniwas";
        System.out.println("String Name:" + str);

        // using String Builder
        StringBuilder str1 = new StringBuilder(str);
        System.out.println("StringBuilder: " + str1.reverse());
        System.out.println("---------------");

        //using StringBuffer
        StringBuffer str2 = new StringBuffer(str);
        System.out.println("StringBuffer: " + str2.reverse());
        System.out.println("---------------");

        //Using toCharArray method
        char[] strChar = str.toCharArray();
        System.out.println("toCharArray: ");
        for (int i = (str.length() - 1); i >= 0; i--) {
            System.out.println(strChar[i]);
        }
        System.out.println("--------------");

        //using charAt() function
        System.out.println("charAt() funcion");
        for(int i=(str.length()-1); i>=0; i--){
            System.out.println(str.charAt(i));
        }
        System.out.println("--------------");

        //Using Collections
        char ch1[]= str.toCharArray();
        List<Character> list =new ArrayList<Character>();

        for(char ch:ch1){
            list.add(ch);

            Collections.reverse(list);
            ListIterator<Character>listIt = list.listIterator();
            System.out.println("Using ListIterator");

            while(listIt.hasNext()){
                System.out.println(listIt.next());
            }
        }


    }
}
