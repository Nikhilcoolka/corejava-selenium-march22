package org.matrix.sigma.niksangli.corejava.javaprogram;

public class ReverseOfEachWord {
    public static void main(String[] args) {
        String str="My name is nikhil";
        String[] words=str.split(" ");  //
        String reverseString="";
        System.out.println(words.length);  //4

        for(int i=0;i <words.length;i++)
        {
               String word=words[i];
                String reverseword="";

                for(int j=word.length()-1;j>=0;j++)
                {
                    reverseword= reverseword + word.charAt(j);
                }
                reverseString=reverseString+reverseword+"";

        }
        System.out.println("Input" +str);
        System.out.println("output" +reverseString);
    }
}
