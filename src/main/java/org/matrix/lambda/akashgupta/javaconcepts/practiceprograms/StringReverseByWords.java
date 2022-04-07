package org.matrix.lambda.akashgupta.javaconcepts.practiceprograms;

public class StringReverseByWords {
    public static void reverseEachWords(String s) {
        String[] words = s.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                result += words[i].charAt(j);
            }
            result += " ";
        }
        System.out.println("original string:" + s);
        System.out.println("result:" + result);
    }

    public static void main(String[] args) {
        int j = 0;
        String input = "Hello my name is Akash", output = "";
        String[] reverseString = input.split(" "), buffer = new String[input.length()];
        for (int i = reverseString.length - 1; i >= 0; i--) {
            output += reverseString[i] + " ";

        }
        System.out.println(output);
        reverseEachWords(input);
    }
}
