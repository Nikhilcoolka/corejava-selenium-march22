package org.matrix.lambda.akashgupta.javaconcepts.practiceprograms;

public class ReverseByWordsAndCount {
    static String str;
    int count = 0;

    ReverseByWordsAndCount(String str) {
        ReverseByWordsAndCount.str = str;
    }

    public void reverseByWord(String str) {
        String[] words = str.split(" ");
        count = words.length;
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }

    public void wordCount(String str) {
        String[] words = str.split(" ");
        count = words.length;
        System.out.println("total no of words are :" + count);
    }

    public static void main(String[] args) {
        ReverseByWordsAndCount obj = new ReverseByWordsAndCount("My name is Akash");
        obj.reverseByWord(str);
        obj.wordCount(str);

    }
}
