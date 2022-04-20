package org.matrix.lambda.akashgupta.javaconcepts.practiceprograms.stringoperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringReverse {
    String str = "1MIRROR_IMAGE || EGAMI_RORRIM2";

    public StringBuilder usingStringBuilderClass(String revstr) {   //using StringBuilder(built-in java class)
        StringBuilder obj = new StringBuilder(revstr);
        System.out.println("................using StringBuilder Class...............");
        return obj.reverse();                           //using  reverse(); method
    }

    public void usingStringClassMethod1(String revstr) {
        int j = revstr.length() - 1, i = 0;
        char[] chars = revstr.toCharArray(), buffer = new char[j + 1];//using String class method to convert (String --> char[])
        System.out.println("................using toCharArray() method(String Class)...............");
        //System.out.println(chars);             //just converts String --> char[] doesn't reverse
        /*for(char c:chars){
            chars[i]=chars[j];
            i++;
            j--;
        }*/        //use buffer::overwriting issue, works fine for palindrome
        while (j >= 0) {
            buffer[i] = chars[j];
            i++;
            j--;
        }
        System.out.println(buffer);
    }

    public void usingStringClassMethod2(String revstr) {
        int j = revstr.length();
        char[] buffer = new char[j];
        j = 0;
        System.out.println("................using charAt(int index) method(String Class)...............");
        for (int i = (revstr.length() - 1); i >= 0; i--) {
            buffer[j] = revstr.charAt(i);//using String Class method  to access directly at index....charAt(int index)
            j += 1;
        }
        System.out.println(buffer);
    }

    public StringBuffer usingStringBufferClass(String revstr) {   //using StringBuffer (built-in java Class)
        StringBuffer obj = new StringBuffer(revstr);
        System.out.println("................using StringBuffer Class...............");
        return obj.reverse();
    }

    public void usingCollectionsClass(String revstr) {       //revisit after interface theory
        char[] chars = revstr.toCharArray();
        char[] buffer = new char[revstr.length()];
        int i = 0;
        List<Character> list = new ArrayList<Character>();     //creating List(interface) type using ArrayList class
        for (char ch : chars) {    //'for-each':loop through each element for given array[]....for(Type var: arrayName){}
            list.add(ch);
        }
        Collections.reverse(list);                             //collections method which accepts List type
        ListIterator<Character> listIt = list.listIterator();  //interface
        System.out.println("................using ListIterator...............");
        while (listIt.hasNext()) {
            buffer[i] = listIt.next();
            i++;
        }
        System.out.println(buffer);
    }

    public static void main(String[] args) {
        StringReverse obj = new StringReverse();
        System.out.println(obj.usingStringBuilderClass(obj.str));
        obj.usingStringClassMethod1(obj.str);
        obj.usingStringClassMethod2(obj.str);
        System.out.println(obj.usingStringBufferClass(obj.str));
        obj.usingCollectionsClass(obj.str);
    }
}
