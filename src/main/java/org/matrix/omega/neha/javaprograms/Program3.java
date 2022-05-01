package org.matrix.omega.neha.javaprograms;

//Program to count words in sentence.
public class Program3 {
    public static void main(String[] args) {
        String str = "I am a boy";
        System.out.println(str);
        int count = 1;
        for(int i=0; i<(str.length()-1); i++){
            if (str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
                count++;
            }
        }
        System.out.println("No. of words in a String:" +count);
    }
}
